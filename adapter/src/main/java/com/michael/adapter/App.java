package com.michael.adapter;

/**
 * 一个简单的故事作为案例。
 * 海盗来了，我们需要{@link RowingBoat}来逃跑，我们有{@link FishingBoat}以及我们的
 * 船长{@link Captain},我们没时间来造一个新船了，我们需要重用{@link FishingBoat}.然而
 * 船长只能操作{@link RowingBoat}.我们需要一个适配器来适配{@link FishingBoat}
 *
 * @author Michael Chu
 * @date 2019-05-15 11:05
 */
public class App {

    /**
     * 程序入口
     *
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        Captain captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }
}
