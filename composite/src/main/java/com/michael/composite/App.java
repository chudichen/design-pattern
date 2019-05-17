package com.michael.composite;

import lombok.extern.slf4j.Slf4j;

/**
 * 组合设计模式是一个分区的设计模式。组合设计模式描述了一组对象按照同一种方式来对待。
 *
 * @author Michael Chu
 * @date 2019-05-17 10:33
 */
@Slf4j
public class App {

    /**
     * 程序入口
     *
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        AbstractLetterComposite orcMessage = new Messenger().messageFromOrcs();
        orcMessage.print();

        log.info("\nMessage from the elves: ");

        AbstractLetterComposite elfMessage = new Messenger().messageFromElves();
        elfMessage.print();
    }
}
