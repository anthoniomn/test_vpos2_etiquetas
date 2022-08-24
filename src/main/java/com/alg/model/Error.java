package com.alg.model;

import java.util.ArrayList;

public class Error {
    private String code;
    private String message;
    ArrayList<Object> message_ilgn = new ArrayList<Object>();

    // Getter Methods

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    // Setter Methods

    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}