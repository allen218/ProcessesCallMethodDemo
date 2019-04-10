package com.example.eventbus.responce;

/**
 *
 */

public class ResponceBean {

//fastjson
    private Object data;//UserManager

    public ResponceBean(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }
}
