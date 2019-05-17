package com.michael.dependencyinjection;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * @author Michael Chu
 * @date 2019-05-17 17:26
 */
public class App {

    /**
     * 程序入口
     *
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        SimpleWizard simpleWizard = new SimpleWizard();
        simpleWizard.smoke();

        AdvancedWizard advancedWizard = new AdvancedWizard(new SecondBreakfastTobacco());
        advancedWizard.smoke();

        AdvancedSorceress advancedSorceress = new AdvancedSorceress();
        advancedSorceress.setTobacco(new SecondBreakfastTobacco());
        advancedSorceress.smoke();

        Injector injector = Guice.createInjector(new TobaccoModule());
        GuiceWizard guiceWizard = injector.getInstance(GuiceWizard.class);
        guiceWizard.smoke();
    }
}
