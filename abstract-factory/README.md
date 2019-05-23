---
属性: 模式
标题: 抽象工厂
类型: 创建
标签:
 - Java
 - Gang Of Four
 - 中等难度
---

## 也被称作
Kit

## 意图
提供一个接口来创建一系列相关的实现子类不需要指定具体的工厂实现。

# 解释
现实案例

> 创建一些相同主题的王国。精灵国又精灵国王，精灵城堡和精灵军队。兽人王国又兽人国王，兽人城堡和兽人军队。在王国中有一个共同的依赖接口。

简单来说

> 一个工厂的工厂。将一组相关的个体分组，并不指定具体的实现工厂。

Wikipedia

> 抽象工厂是一种提供一种封装一组含有相同主题并不指定具体实现的独立的工厂的设计模式。


**编程案例**

正如上述的王国案例，首先在王国中我们需要一些接口和一些实现类。

```java
public interface Castle {
    String getDescription();
}

public interface King {
    String getDescription();
}

public interface Army {
    String getDescription();
}

// 精灵实现
public class ElfCastle implements Castle {
    static final String DESCRIPTION = "This is the Elven castle!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}

public class ElfKing implements King {
    static final String DESCRIPTION = "This is the Elven king!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}

public class ElfArmy implements Army {
    static final String DESCRIPTION = "This is the Elven army!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}

// 兽人实现也类似。。。
```

然后我们抽象以及现实王国的工厂

```java
public interface KingdomFactory {
    Castle createCastle();
    King createKing();
    Army createArmy();
}

public class ElfKingdomFactory implements KingdomFactory {
    public Castle createCastle() {
        return new ElfCastle();
    }
    public King createKing() {
        return new ElfKing();
    }
    public Army createArmy() {
        return new ElfArmy();
    }
}

public class OrcKingdomFactory implements KingdomFactory {
    public Castle createCastle() {
        return new OrcCastle();
    }
    public King createKing() {
        return new OrcKing();
    }
    public Army createArmy() {
        return new OrcArmy();
    }
}
```

现在我们已经又了抽象工厂，让我们去把对象和实际抽象关联起来。

```java
KingdomFactory factory = new ElfKingdomFactory();

Castle castle = factory.createCastle();
King king = factory.createKing();
Army army = factory.createArmy();

castle.getDescription();  // Output: This is the Elven castle!
king.getDescription(); // Output: This is the Elven king!
army.getDescription(); // Output: This is the Elven Army!
```

现在我们设计一个不同的王国工厂，在这个案例中，我们将创建一个FactoryMaker，负责返回一个工厂实例。客户端调用FactoryMaker返回一个需要的工厂，然后创建需要的对象。在这个案例中，我们同样创建一个枚举来限制工厂实例类型。

```java
@Slf4j
public static class FactoryMaker {
    public enum KingdomType {
        ELF, ORC
    }
    
    public static KingdomFactory makeFactory(KingdomType type) {
        switch (type) {
            case ORC:
                return new ElfKingdomFactory();
            case ELF:
                return new OrcKingdomFactory();
            default:
                throw new IllegalArgumentException("KingdomType not supported");
        }
    }
    
    public static void main(String[] args){
        App app = new App();
        log.info("Elf Kingdom");
        app.createKingdom(FactoryMaker.makeFactory(KingdomType.ELF));
        log.info(app.getArmy().getDescription());
        log.info(app.getCastle().getDescription());
        log.info(app.getKing().getDescription());
    }
}
```

## 适用性
当有以下场景的时候可以使用抽象工厂:

* 一个系统需要使产品的创建，组合以及展示相互独立。
* 一个系统需要配置很多相似的产品。
* 一个产品族被设计成在一起使用，而且需要强制保证这个实现。
* 你需要一个系列的产品，并且希望只是通过通用的接口来进行调用。
* 这些产品的生命周期比消费者短。
* 你需要运行时创建这些依赖。
* 你希望在运行时候指定创建哪个产品实现。


## 用例

* 选择在运行时调用FileSystemAcmeService或者DatabaseAcmeService或者NetworkAcmeService的实现。
* 希望单元测试的编写变得更为简洁。

## 缺点

* 依赖注入在Java中会隐藏实现类，可能会导致在编译时捕获运行时异常。

## 教程
* [Abstract Factory Pattern Tutorial](https://www.journaldev.com/1418/abstract-factory-design-pattern-in-java) 

## 展示

* [Abstract Factory Pattern](etc/presentation.html) 

## 现实案例

* [javax.xml.parsers.DocumentBuilderFactory](http://docs.oracle.com/javase/8/docs/api/javax/xml/parsers/DocumentBuilderFactory.html)
* [javax.xml.transform.TransformFactory](http://docs.oracle.com/javase/8/docs/api/javax/xml/transform/TransformerFactory.html#newInstance--)
* [javax.xml.xpath.XPathFactory](http://docs.oracle.com/javase/8/docs/api/javax/xml/xpath/XPathFactory.html#newInstance--)

## 引用

* [Design Patterns: Elements of Reusable Object-Oriented Software](http://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612)