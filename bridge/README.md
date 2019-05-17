# 桥接模式
Gang Of Four

## 也被成为
Handle/Body

## 意图

将一个整体拆分成组合，以便于解耦各个模块

## 解释

举例说明

> 想象一下你的武器附魔，而且支持多种武器多种附魔。你会怎么做？拷贝多个武器的副本以及附魔的副本?或者你只需要将附魔和武器分开，在需要的时候进行整合。桥接模式可以允许你实现第二种。

简单来说

> 桥接模式是一种组合优先于继承的设计模式。实现细节被拆分成多个层级。

Wikipedia

> 桥接模式是软件工程种一种来用使实现类进行接口的设计模式。

**编程案例**

正如上面所说的武器附魔，这里我们将武器进行分层。

```java
public interface Weapon {
    void wield();
    void swing();
    void unwield();
    Enchantment getEnchantment();
}

@Slf4j
public class Sword implements Weapon {
    
    public Sword(Enchantment enchantment) {
        this.enchantment = enchantment;
    }
    
    @Override
    public void wield() {
        log.info("The sword is wielded.");
        enchantment.onActivate();
    }
    
    @Override
    public void swing() {
        log.info("The sword is swinged.");
        enchantment.apply();
    }
    
    @Override
    public void unwield() {
        log.info("The sword is unwielded.");
        enchantment.onDeactivate();
    }
    
    @Override
    public Enchantment getEnchantment() {
        return enchantment;
    }
}
@Slf4j
public class Hammer implements Weapon {
    
    public Sword(Enchantment enchantment) {
        this.enchantment = enchantment;
    }
    
    @Override
    public void wield() {
        log.info("The hammer is wielded.");
        enchantment.onActivate();
    }
    
    @Override
    public void swing() {
        log.info("The hammer is swinged.");
        enchantment.apply();
    }
    
    @Override
    public void unwield() {
        log.info("The hammer is unwielded.");
        enchantment.onDeactivate();
    }
    
    @Override
    public Enchantment getEnchantment() {
        return enchantment;
    }
}
```

附魔的分层

```java
public interface Enchantment {
    void onActivate();
    void apply();
    void onDeactivate();
}

@Slf4j
public class FlyingEnchantment implements Enchantment {
    
    @Override
    public void onActivate() {
        log.info("The item begins to glow faintly.");
    }
    
    @Override
    public void apply() {
        log.info("The item flies and strikes the enemies finally returning to owner's hand.");
    }
    
    @Override
    public void onDeactivate() {
        log.info("The item's glow fades.");
    }
}

@Slf4j
public class SoulEatingEnchantment implements Enchantment {
        @Override
        public void onActivate() {
            log.info("The item spreads bloodlust.");
        }
        
        @Override
        public void apply() {
            log.info("The item eats the soul of enemies.");
        }
        
        @Override
        public void onDeactivate() {
            log.info("Bloodlust slowly disappears.");
        }
}
```

将武器和附魔组合起来
```java
Sword enchantedSword = new Sword(new SoulEatingEnchantment());
enchantedSword.wield();
enchantedSword.swing();
enchantedSword.unwield();
// The sword is wielded.
// The item spreads bloodlust.
// The sword is swinged.
// The item eats the soul of enemies.
// The sword is unwielded.
// Bloodlust slowly disappears.

Hammer hammer = new Hammer(new FlyingEnchantment());
hammer.wield();
hammer.swing();
hammer.unwield();
// The hammer is wielded.
// The item begins to glow faintly.
// The hammer is swinged.
// The item flies and strikes the enemies finally returning to owner's hand.
// The hammer is unwielded.
// The item's glow fades.
```

## 适用性
一下场景推荐使用桥接模式：

* 你希望避免实现与抽象之间的永久绑定。这很重要，比如实现要在运行期间被选择或者切换。
* 抽象和实现需要通过子类来扩展。桥接模式可以使不同的抽象与不同的实现之间进行绑定，而且是相互独立的方式。
* 抽象中的不同实现类之间的差异和改变不能影响到客户端。因此，它们的代码不需要进行重新编译。
* 你有一个分层的类。比如把一个类分成两部分。嵌套泛化这样的类。

## 教程
* [Bridge Pattern Tutorial](https://www.journaldev.com/1491/bridge-design-pattern-java)

## 引用
* [Design Patterns: Elements of Reusable Object-Oriented Software](http://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612)