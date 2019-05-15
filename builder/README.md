# 建造者模式

Gang Of Four

## 意图
分离复杂对象的创建过程，可以化简创建过程。

## 解释
真实世界例子
> 想象一下角色扮演游戏的角色生成器。可以让电脑为你生成角色，但是你想要选择一些角色的细节，例如：职业，年龄，性别，发色等。这个角色生成器会一步一步的往下走，直到完成了所有的选择项。

简单来说

> 可以让你创建不同风格的角色而不去污染构造器。当存在多个角色的时候或者创建或称步骤很多的时这显得十分有用。

Wikipedia

> 建造者模式是一个软件设计模式中创建可伸缩构造器的反模式（telescoping constructor anti-pattern）的一种解决方案。

简单说一下什么是可伸缩构造器的反模式，我们有如下的一个构造器：

```java
public com.michael.builder.Hero(com.michael.builder.Profession profession, String name, com.michael.builder.HairType hairType, com.michael.builder.HairColor hairColor,
    com.michael.builder.Armor armor, com.michael.builder.Weapon weapon) {
}
```

正如你所见，构造方法的参数十分多，因此要正确的构造，并且记住其中元素的位置并不十分容易，并且这些参数在未来可能还会有增加趋势，这就是可伸缩构造器的反模式。

**代码例子**

明智的做法是使用建造者模式，首先我们要有我们想要创建的Hero。

```java
public final class com.michael.builder.Hero {
    private final Profession profession;
    private final String name;
    private final HairColor hairColor;
    private final Armor armor;
    private final Weapon weapon;
    
    private com.michael.builder.Hero(Builder builder) {
        this.profession = builder.profession;
        this.name = builder.name;
        this.hairColor = builder.hairColor;
        this.hairType = builder.hairType;
        this.weapon = builder.weapon;
        this.armor = builder.armor;
    }
}
```

然后我们使用builder

```java
public static class Builder {
    private final Profession profession;
    private final String name;
    private HairType hairType;
    private HairColor hairColor;
    private Armor armor;
    private Weapon weapon;
    
    public Builder(Profession profession, String name){
        if (profession == null || name == null){
            throw new IllegalArgumentException("profession and name can not be null");
        }
        this.profession = profession;
        this.name = name;
    }
    
    public Builder withHairType(HairType hairType){
        this.hairType = hairType;
        return this;
    }
    
    public Builder withHairColor(HairColor hairColor){
        this.hairColor = hairColor;
        return this;
    }
    
    public Builder withArmor(Armor armor){
        this.armor = armor;
        return this;
    }
    
    public Builder withWeapon(Weapon weapon){
        this.weapon = weapon;
        return this;
    }
    
    public Hero build() {
        return new Hero(this);
    }
}
```

如果要创建Hero可以这样使用：

```java
com.michael.builder.Hero mage = new com.michael.builder.Hero.Builder(com.michael.builder.Profession.MAGE, "Michael").withHairColor(com.michael.builder.HairColor.BLACK).withWeapon(com.michael.builder.Weapon.DAGGER).build();
```

## 适用性
当初如下情况的时候可以使用建造者模式：
* 创建的对象要独立于其他部分，可以被组装起来的。
* 被构造的对象要允许构造成不同表现形式。

## 现实中的例子
* [java.lang.StringBuilder](http://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html)
* [java.nio.ByteBuffer](http://docs.oracle.com/javase/8/docs/api/java/nio/ByteBuffer.html#put-byte-)其他的Buffer，如FloatBuffer，IntBuffer也一样。
* [java.lang.StringBuffer](http://docs.oracle.com/javase/8/docs/api/java/lang/StringBuffer.html#append-boolean-)
* [java.lang.Appendable](http://docs.oracle.com/javase/8/docs/api/java/lang/Appendable.html)中所有的实现类
* [Apache Camel builders](https://github.com/apache/camel/tree/0e195428ee04531be27a0b659005e3aa8d159d23/camel-core/src/main/java/org/apache/camel/builder)

## 引用
* [Design Patterns: Elements of Reusable Object-Oriented Software](http://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612)
* [Effective Java (2nd Edition)](http://www.amazon.com/Effective-Java-Edition-Joshua-Bloch/dp/0321356683)
