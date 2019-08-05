package com.michael.ambassador;

/**
 * @author Michael Chu
 * @date 2019-06-11 16:47
 */
public class App {

    public static void main(String[] args) {
        Client host1 = new Client();
        Client host2 = new Client();
        host1.useService(12);
        host2.useService(73);
    }
}
