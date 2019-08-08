package com.michael.chain;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Michael Chu
 * @since 2019-08-08 16:11
 */
@Slf4j
public abstract class RequestHandler {

    private RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request request) {
        if (request != null) {
            next.handleRequest(request);
        }
    }

    protected void printHandling(Request request) {
        log.info("{} handling request \"{}\"", this, request);
    }

    @Override
    public abstract String toString();
}
