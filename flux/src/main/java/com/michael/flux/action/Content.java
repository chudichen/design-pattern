package com.michael.flux.action;

/**
 * 内容枚举
 *
 * @author Michael Chu
 * @date 2019-05-20 15:24
 */
public enum Content {

    /** 产品 */
    PRODUCTS("Products - This page lists the company's products."),
    /** 公司 */
    COMPANY("Company - This page displays information about the company.");

    private String title;

    private Content(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
