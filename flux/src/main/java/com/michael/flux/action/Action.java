package com.michael.flux.action;

/**
 * @author Michael Chu
 * @date 2019-05-20 15:21
 */
public abstract class Action {

    private ActionType type;

    public Action(ActionType type) {
        this.type = type;
    }

    public ActionType getType() {
        return type;
    }
}
