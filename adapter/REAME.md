# 适配器模式
Gang Of Four,结构模式

## 常用于
Wrapper

## 意图
将一个类的功能加入另一个类的接口中。可以使不兼容的类也能在一起正常工作。

## 解释

现实案例

> 想象一下你有很多照片在内存卡当中，你想要传入电脑上。为此，你需要一个适配器将你的来适配内存卡以及电脑的输入端口，从而将内存卡连接在电脑上。这时读卡器就充当了适配器。
> 另一个例子是电源适配器，三孔的插头无法插入两个孔的电源接口，这是需要找到一个电源转换器来充当适配器。
> 还有一个例子就是翻译，将语言翻译给另外一个人，这个翻译工作就充当了适配器。

简单来说

> 适配器可以使两个不兼容的接口，经过包装之后可以在一起兼容的工作。

Wikipedia

> 在软件工程中，适配器模式是一种允许现有类接口被其他类使用的设计模式。它可以使用两个类在不更改源码的情况下在一起工作。

**编程案例**

想象一个只能使用划船不能使用帆船的船长。
首先我们要创建接口`RowingBoat`和`FishingBoat`

```java
public interface RowingBoat {
    void row();
}

@Slf4j
public class FishingBoat {
    public void sail() {
        log.info("The fishing boat is sailing");
    }
}
```

然后船长希望有一个`RowingBoat`的实现类，来使船移动

```java
public class Captain implements RowingBoat {
    private RowingBoat rowingBoat;
    
    public Captain(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }
    
    @Override
    public void row() {
        rowingBoat.row();
    }
}
```

现在海盗来了，但是只有渔船可用，我们需要一个适配器来让船长使用他的划船技术来操作渔船来逃跑。


```java
@Slf4j
public class FishingBoatAdapter implements RowingBoat {
    
    private FishingBoat boat;
    
    public FishingBoatAdapter() {
        boat = new FishingBoat();
    }
    
    @Override
    public void row() {
        boat.sail();
    }
}
```

现在船长可以使用渔船来逃跑了。

```java
Captain captain = new Captain(new FishingBoatAdapter());
captain.row();
```

## 适用性
当出现一下场景的时候可以使用适配器模式

* 你需要使用一个现在类，但它的接口不符合你的需求
* 你需要为不相关以及不可见的对象创建一个可重复使用的类，而且这个类不需要有兼容性接口。
* 你需要用到一系列的子类实例，但是为每个子类创建适配对象是不现实的，可以针对其父类创建适配接口。
* 大多数应用都是用到了第三方库，使用适配器来作为中间层连接第三方库以及应用本身。当一个需要被使用时，只要添加新的适配器，而不需要修改源码。

## 后果
类于对象适配器有着不一样的权衡：

* 适配器专注于通用方法，当需要对一个类的子类进行完全适配时，适配器模式不太适合。
* 如果适配器需要重写适配对象的方法，适配器会作为被适配对象的子类
* 当要求仅有一个对象，不能有其他中间层时，适配器模式不适合。

对象适配器
* 实现一个适配器对许多对象的适配，适配器可以同时对适配对象添加功能操作。

## 现实案例

* [java.util.Arrays#asList()](http://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#asList%28T...%29)
* [java.util.Collections#list()](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#list-java.util.Enumeration-)
* [java.util.Collections#enumeration()](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#enumeration-java.util.Collection-)
* [javax.xml.bind.annotation.adapters.XMLAdapter](http://docs.oracle.com/javase/8/docs/api/javax/xml/bind/annotation/adapters/XmlAdapter.html#marshal-BoundType-)

## 引用

* [Design Patterns: Elements of Reusable Object-Oriented Software](http://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612)
* [J2EE Design Patterns](http://www.amazon.com/J2EE-Design-Patterns-William-Crawford/dp/0596004273/ref=sr_1_2)

