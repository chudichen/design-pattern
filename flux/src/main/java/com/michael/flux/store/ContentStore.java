package com.michael.flux.store;

import com.michael.flux.action.Action;
import com.michael.flux.action.ActionType;
import com.michael.flux.action.Content;
import com.michael.flux.action.ContentAction;

import java.util.Objects;

/**
 * 内容存储
 *
 * @author Michael Chu
 * @date 2019-05-20 16:01
 */
public class ContentStore extends Store {

    private Content content = Content.PRODUCTS;

    @Override
    public void onAction(Action action) {
        if (Objects.equals(action.getType(), ActionType.CONTENT_CHANGED)) {
            ContentAction contentAction = (ContentAction) action;
            content = contentAction.getContent();
            notifyChange();
        }
    }

    public Content getContent() {
        return content;
    }

}
