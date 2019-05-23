package com.michael.abstractfactory;

/**
 * 王国工厂
 *
 * @author Michael Chu
 * @date 2019-05-23 10:37
 */
public interface KingdomFactory {

    Castle createCastle();

    King createKing();

    Army createArmy();
}
