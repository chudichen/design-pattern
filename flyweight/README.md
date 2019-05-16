# 享元模式
Gang Of Four

## 意图
用来高效共享大量细粒度的对象

## 解释
现实案例

> 老王的商店里摆满了神奇的药水。但是大多数药物都是相同的，因此没必要每个都摆放（创建对象），可以重复使用一个来代替相同的，空间占用率会很小。

简单来说

> 可以通过共享相同的对象来最小化内存或者计算花费。

Wikipedia

> 在计算机编程中，享元模式是一种软件设计模式。享元模式是一种通过最可能使用共享的对象来减少重复创建操作从而最小化内存的设计模式。

**编程案例**

正如上面的老王药铺。首先我们需要有不同的药水

```java
public interface Potion {
    void drink();
}

@Slf4j
public class HealingPotion implements Potion{
    
    @Override
    public void drink() {
        log.info("You feel healed. (Potion={})", System.identityHashCode(this));
    }
}

@Slf4j
public class HolyWaterPotion implements Potion {
    
    @Override
    public void drink() {
        log.info("You feel blessed. (Potion={})", System.identityHashCode(this));
    }
}

@Slf4j
public class InvisibilityPotion implements Potion {
    
    @Override
    public void drink() {
        log.info("You become invisible. (Potion={})", System.identityHashCode(this));
    }
}
```

然后真实的享元对象是通过工厂创建的

```java
public class PotionFactory {
    
    private final Map<PotionType, Potion> potions;
    
    public PotionFactory() {
        potions = new EnumMap(PotionType.class);
    }
    
    Potion createPotion(PotionType type) {
        Potion potion = potions.get(type);
        if (potion == null){
            switch (type) {
                case HEALING:
                    potion = new HealingPotion();
                    potions.put(type, potion);
                    break;
                case HOLY_WATER:
                    potion = new HolyWaterPotion();
                    potions.put(type, potion);
                case INVISIBILITY:
                    potion = new InvisibilityPotion();
                    potions.put(type, potion);
                    break;
                default:
                    break;
            }
        }
        return potion;
    }
}
```

然后通过下面方式使用

```java
factory.createPotion(PotionType.INVISIBILITY).drink(); // You become invisible. (Potion=6566818)
factory.createPotion(PotionType.HEALING).drink(); // You feel healed. (Potion=648129364)
factory.createPotion(PotionType.INVISIBILITY).drink(); // You become invisible. (Potion=6566818)
factory.createPotion(PotionType.HOLY_WATER).drink(); // You feel blessed. (Potion=1104106489)
factory.createPotion(PotionType.HOLY_WATER).drink(); // You feel blessed. (Potion=1104106489)
factory.createPotion(PotionType.HEALING).drink(); // You feel healed. (Potion=648129364)
```

## 适用性
享元模式的效率取决于如何以及在哪里使用。当下面的条件都成立时可以使用享元模式：

* 一个应用使用了大量的对象
* 存储成本很高，因为对象数量庞大
* 绝大多数对象都是相同的
* 当外部状态移除时，绝大多数对象可以被替代
* 程序不依赖于对象标识，可能在享元模式返回相同对象的时候，对象也不是同一个

## 现实案例
* [java.lang.Integer#valueOf(int)](http://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html#valueOf%28int%29) Byte等其他包装模块也相同

## 引用
* [Design Patterns: Elements of Reusable Object-Oriented Software](http://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612)