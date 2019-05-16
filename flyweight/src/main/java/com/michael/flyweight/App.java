package com.michael.flyweight;

/**
 * 当程序需要大量的重复对象的时候享元模式是十分有用的，它通过共享
 * 相同的对象来减少对象的创建。
 * <p>
 * 在这个例子中，{@link WangShop}在货架上有无数个药品，为了填充
 * 药品使用了{@link PotionFactory}（享元模式在本例中的具体体现），
 * 在工厂内部，采用懒加载在需要的时候填充新的对象。
 * <p>
 * 为了在客户端和线程之间安全共享，享元对象要是不可变对象。享元对象
 * 通过值定义。
 * @author Michael Chu
 * @date 2019-05-16 11:32
 */
public class App {

    /**
     * 程序入口
     *
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        WangShop wangShop = new WangShop();
        wangShop.enumerate();
    }
}
