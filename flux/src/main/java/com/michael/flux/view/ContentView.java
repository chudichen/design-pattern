package com.michael.flux.view;

import com.michael.flux.action.Content;
import com.michael.flux.store.ContentStore;
import com.michael.flux.store.Store;
import lombok.extern.slf4j.Slf4j;

/**
 * 内容视图
 *
 * @author Michael Chu
 * @date 2019-05-20 16:04
 */
@Slf4j
public class ContentView implements View {

    private Content content = Content.PRODUCTS;

    @Override
    public void storeChanged(Store store) {
        ContentStore contentStore = (ContentStore) store;
        content = contentStore.getContent();
        render();
    }

    @Override
    public void render() {
        log.info(content.toString());
    }
}
