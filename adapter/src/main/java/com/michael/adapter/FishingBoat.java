package com.michael.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * 设备类（适配器模式中的被适配对象），我们需要重用这个类
 * 渔船通过帆来航行
 *
 * @author Michael Chu
 * @date 2019-05-15 11:06
 */
@Slf4j
public class FishingBoat {

    public void sail() {
        log.info("The fishing boat is sailing");
    }
}
