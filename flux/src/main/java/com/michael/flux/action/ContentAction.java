package com.michael.flux.action;

/**
 * 内容动作
 *
 * @author Michael Chu
 * @date 2019-05-20 15:27
 */
public class ContentAction extends Action {

    private Content content;

    public ContentAction(Content content) {
        super(ActionType.CONTENT_CHANGED);
        this.content = content;
    }

    public Content getContent() {
        return content;
    }
}
