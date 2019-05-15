package com.michael.adapter;

/**
 * 船长只能使用{@link RowingBoat}来航行。
 * 在适配器模式中成为客户端。
 *
 * @author Michael Chu
 * @date 2019-05-15 11:06
 */
public class Captain {

    private RowingBoat rowingBoat;

    public Captain() {}

    public Captain(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    public void setRowingBoat(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    public void row() {
        rowingBoat.row();
    }
}
