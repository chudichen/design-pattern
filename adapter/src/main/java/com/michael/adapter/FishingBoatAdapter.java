package com.michael.adapter;

/**
 * 适配器类，通过被适配对象的接口{@link FishingBoat}适配进它们所期望的客户端{@link RowingBoat}
 *
 * @author Michael Chu
 * @date 2019-05-15 11:11
 */
public class FishingBoatAdapter implements RowingBoat {

    private FishingBoat boat;

    public FishingBoatAdapter() {
        boat = new FishingBoat();
    }

    @Override
    public void row() {
        boat.sail();
    }
}
