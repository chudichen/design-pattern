package com.michael.proxy;

/**
 * 这是一个代理的例子，{@link WizardTowerProxy}来控制{@link IvoryTower}的访问权限
 *
 * @author Michael Chu
 * @date 2019-05-16 16:13
 */
public class App {

    /**
     * 程序入口
     *
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        WizardTowerProxy proxy = new WizardTowerProxy(new IvoryTower());
        proxy.enter(new Wizard("Red wizard"));
        proxy.enter(new Wizard("White wizard"));
        proxy.enter(new Wizard("Black wizard"));
        proxy.enter(new Wizard("Green wizard"));
        proxy.enter(new Wizard("Brown wizard"));
    }
}
