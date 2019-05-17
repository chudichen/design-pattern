# 组合模式

Gang Of Four

## 意图
将对象进入一个部分-整体层次结构的树形对象中。组合允许客户端同等对待个体以及组合整体。

## 解释

实例分析

> 每个句子都是由特定排列的词语组成。每个词语都是可打印的。

简单来说

> 组成可以使客户端以同样的方式来对待个体。

Wikipedia

> 在软件工程中，组合模式是一种分层的设计模式。组合设计模式描述了一组对象被当做一个实例对象来对待。组合表示对象以一种部分-整体分层的方式进行树化。组合中的每个元素都可以被当作一个单一的个体来对待。

**编程案例**

以句子为例，我们首先要有可打印的基类和不同的打印类型

```java
public abstract class LetterComposite {
    
    private List<LetterComposite> children = new ArrayList<>();
    
    public void add(LetterComposite letter) {
        children.add(letter);
    }
    
    public int count() {
        return children.size();
    }
    
    protected void printThisBefore() {}
    
    protected void printThisAfter() {}
    
    public void print() {
        printThisBefore();
        for (LetterComposite letter : children){
            letter.print();
        }
        printThisAfter();
    }
}

public class Letter extends LetterComposite {
    
    private char c;
    
    public Letter(char c){
        this.c = c;
    }
    
    @Override
    protected void printThisBefore() {
        System.out.print(c);
    }
}

public class Word extends LetterComposite {
    
    public Word(List<Letter> letters) {
        for (Letter letter : letters){
            this.add(letter);
        }
    }
    
    @Override
    protected void printThisBefore() {
        System.out.print(" ");
    }
}

public class Sentence extends LetterComposite {
    
    public Sentence(List<Word> words) {
        for (Word word : words){
            this.add(word);
        }
    }
    
    @Override
    protected void printThisAfter() {
        System.out.print(".");
    }
}
```

然后我们有信使来携带消息

```java
public class Messenger {
    
    LetterComposite messageFromOrcs() {
        List<Word> words = new ArrayList<>();
        words.add(new Word(Arrays.asList(new Letter('W'), new Letter('h'), new Letter('e'), new Letter('r'), new Letter('e'))));
        words.add(new Word(Arrays.asList(new Letter('t'), new Letter('h'), new Letter('e'), new Letter('r'), new Letter('e'))));
        words.add(new Word(Arrays.asList(new Letter('i'), new Letter('s'))));
        words.add(new Word(Arrays.asList(new Letter('a'))));
        words.add(new Word(Arrays.asList(new Letter('w'), new Letter('h'), new Letter('i'), new Letter('p'))));
        words.add(new Word(Arrays.asList(new Letter('t'), new Letter('h'), new Letter('e'), new Letter('r'), new Letter('e'))));
        words.add(new Word(Arrays.asList(new Letter('i'), new Letter('s'))));
        words.add(new Word(Arrays.asList(new Letter('a'))));
        words.add(new Word(Arrays.asList(new Letter('w'), new Letter('a'), new Letter('y'))));
        return new Sentence(words);
    }
    
    LetterComposite messageFromElves() {
        List<Word> words = new ArrayList<>();
        words.add(new Word(Arrays.asList(new Letter('M'), new Letter('u'), new Letter('c'), new Letter('h'))));
        words.add(new Word(Arrays.asList(new Letter('w'), new Letter('i'), new Letter('n'), new Letter('d'))));
        words.add(new Word(Arrays.asList(new Letter('p'), new Letter('o'), new Letter('u'), new Letter('r'), new Letter('s'))));
        words.add(new Word(Arrays.asList(new Letter('f'), new Letter('r'), new Letter('o'), new Letter('m'))));
        words.add(new Word(Arrays.asList(new Letter('y'), new Letter('o'), new Letter('u'), new Letter('r'))));
        words.add(new Word(Arrays.asList(new Letter('m'), new Letter('o'), new Letter('u'), new Letter('t'), new Letter('h'))));
        return new Sentence(words);
    }
}
```

然后可以被使用

```java
LetterComposite orcMessage = new Messenger().messageFromOrcs();
orcMessage.print();
LetterComposite elfMessage = new Messenger().messageFromElves();
elfMessage.print();
```

## 适用性
当满足一下情况的时候可以考虑使用组合模式：

* 你希望有部分-整体分层的对象
* 你希望客户端忽略个体与整体之间的差异。客户端可以用同一种方式来对待所有的对象。

## 现实案例

* [java.awt.Container](http://docs.oracle.com/javase/8/docs/api/java/awt/Container.html) 和 [java.awt.Component](http://docs.oracle.com/javase/8/docs/api/java/awt/Component.html)
* [Apache Wicket](https://github.com/apache/wicket) 树组件 [Component](https://github.com/apache/wicket/blob/91e154702ab1ff3481ef6cbb04c6044814b7e130/wicket-core/src/main/java/org/apache/wicket/Component.java) 以及 [MarkupContainer](https://github.com/apache/wicket/blob/b60ec64d0b50a611a9549809c9ab216f0ffa3ae3/wicket-core/src/main/java/org/apache/wicket/MarkupContainer.java)

## 引用

* [Design Patterns: Elements of Reusable Object-Oriented Software](http://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612)