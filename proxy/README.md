# 代理模式
Gang Of Four

## 意图
为一个其他的对象提供占位符或者代理对象来访问它

## 解释
举例说明

> 想象有一座塔，当地的巫师去学习法术，这个象牙塔通过代理来保证只有前三名巫师才可以进入。这个塔的代理体现了添加访问控制的能力。

简单来说

> 使用代理模式，一个类表现出代理的行为。

Wikipedia

> 代理的最基本表现形式，一类作为其他类的接口。一个代理类是一个包装类或者是一个中介，客户端通过代理类来间接访问背后的实体类。使用代理类可以轻松的访问到被代理实例，或者增加逻辑访问。在代理中可以提供额外的逻辑，比如缓存处理过的值，在访问实例前检测参数等。

**编程案例**

编写巫师塔的案例，首先我们要先定义好塔的接口

```java
public interface WizardTower {
    
    void enter(Wizard wizard);
}

@Slf4j
public class IvoryTower implements WizardTower {
    
    public void enter(Wizard wizard) {
        log.info("{} enters the tower.", wizard);
    }
}
```

然后创建一个简单的巫师对象

```java
public class Wizard {
    
    private final String name;
    
    public Wizard(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
```

然后我们通过代理来添加访问控制

```java
@Slf4j
public class WizardTowerProxy implements WizardTower {
    
    private static final int NUM_WIZARDS_ALLOWED = 3;
    
    private int numWizards;
    
    private final WizardTower tower;
    
    public WizardTowerProxy(WizardTower tower){
        this.tower = tower;
    }
    
    @Override
    public void enter(Wizard wizard) {
        if (numWizards < NUM_WIZARDS_ALLOWED){
            tower.enter(wizard);
            numWizards++;
        } else {
            log.info("{} is not allowed to enter!", wizard);
        } 
    }
}
```

然后下面是巫师进入的例子

```java
WizardTowerProxy proxy = new WizardTowerProxy(new IvoryTower());
proxy.enter(new Wizard("Red wizard")); // Red wizard enters the tower.
proxy.enter(new Wizard("White wizard")); // White wizard enters the tower.
proxy.enter(new Wizard("Black wizard")); // Black wizard enters the tower.
proxy.enter(new Wizard("Green wizard")); // Green wizard is not allowed to enter!
proxy.enter(new Wizard("Brown wizard")); // Brown wizard is not allowed to enter!
```

## 适用性

当需要有比较复杂的处理逻辑时，代理就比直接使用对象引用更加合适。下面是一些代理模式更加适用的场景：

* 远程代理对象代理不同的地址空间
* 虚拟代理提供成本高昂的对象
* 来保护原始对象的访问权限。在需要针对不同对象有不同访问权限的时候保护代理显得十分重要。

## 指导
* [Controlling Access With Proxy Pattern](http://java-design-patterns.com/blog/controlling-access-with-proxy-pattern/)

## 表现
* [Proxy](https://github.com/iluwatar/java-design-patterns/tree/master/proxy/etc/presentation.html)

## 现实案例
* [java.lang.reflect.Proxy](http://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Proxy.html)
* [Apache Commons Proxy](https://commons.apache.org/proper/commons-proxy/)
* 模拟框架，Mockito, Powermock, EasyMock

## 引用

* [Design Patterns: Elements of Reusable Object-Oriented Software](http://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612)