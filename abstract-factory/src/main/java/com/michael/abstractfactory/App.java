package com.michael.abstractfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * 抽象工厂提供一种封装一组具有相同功能（实现相同接口）的工厂方法,不需要指定
 * 具体的实现类。通常，客户端使用抽象工厂来生产一些工厂实例，并用工厂生产实体
 * 对象，使用通用的功能接口。因此抽象工厂只适用于使用通用接口的情况。这个设计
 * 模式把一系列的对象的具体实现分离开来。
 *
 * @author Michael Chu
 * @date 2019-05-23 10:36
 */
@Slf4j
public class App {

    private King king;
    private Castle castle;
    private Army army;

    private void createKingdom(final KingdomFactory factory) {
        setKing(factory.createKing());
        setCastle(factory.createCastle());
        setArmy(factory.createArmy());
    }
    King getKing(final KingdomFactory factory) {
        return factory.createKing();
    }

    public King getKing() {
        return king;
    }

    private void setKing(final King king) {
        this.king = king;
    }

    Castle getCastle(final KingdomFactory factory) {
        return factory.createCastle();
    }

    public Castle getCastle() {
        return castle;
    }

    private void setCastle(final Castle castle) {
        this.castle = castle;
    }

    Army getArmy(final KingdomFactory factory) {
        return factory.createArmy();
    }

    public Army getArmy() {
        return army;
    }

    private void setArmy(final Army army) {
        this.army = army;
    }

    /**
     * 工厂类别
     */
    public static class FactoryMaker {
        public enum KingdomType {
            /** 产品 */
            ELF, ORC
        }

        /**
         * 具体的工厂生产
         *
         * @return 工厂
         */
        public static KingdomFactory makeFactory(KingdomType type) {
            switch (type) {
                case ELF:
                    return new ElfKingdomFactory();
                case ORC:
                    return new OrcKingdomFactory();
                default:
                    throw new IllegalArgumentException("KingdomType not supported.");
            }
        }
    }

    /**
     * 程序入口
     *
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        App app = new App();

        log.info("Elf Kingdom");
        app.createKingdom(FactoryMaker.makeFactory(FactoryMaker.KingdomType.ELF));
        log.info(app.getArmy().getDescription());
        log.info(app.getCastle().getDescription());
        log.info(app.getKing().getDescription());

        log.info("Orc Kingdom");
        app.createKingdom(FactoryMaker.makeFactory(FactoryMaker.KingdomType.ORC));
        log.info(app.getArmy().getDescription());
        log.info(app.getCastle().getDescription());
        log.info(app.getKing().getDescription());
    }
}
