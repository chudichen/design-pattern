package com.michael.acyclicvisitor;

/**
 * 非循环访客模式允许新的方法添加而不影响原有层次结构。
 * <p>
 * 在这个例子中，访问者的基类是{@link ModemVisitor}.
 * 层次结构的基类是{@link Modem},并且有两个子类{@link Hayes}
 * 和{@link Zoom}，并且都有自己的访问者接口{@link HayesVisitor}
 * 和{@link ZoomVisitor}
 *
 * @author Michael Chu
 * @date 2019-06-11 10:47
 */
public class App {

    public static void main(String[] args) {
        ConfigureForUnixVisitor conUnix = new ConfigureForUnixVisitor();
        ConfigureForDosVisitor conDos = new ConfigureForDosVisitor();

        Zoom zoom = new Zoom();
        Hayes hayes = new Hayes();

        hayes.accept(conDos);
        zoom.accept(conDos);

        hayes.accept(conUnix);
        zoom.accept(conUnix);
    }
}
