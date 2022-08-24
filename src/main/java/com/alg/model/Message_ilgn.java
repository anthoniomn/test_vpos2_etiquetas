package com.alg.model;

public class Message_ilgn {
    private String locale;
    public String getLocale() {
        return locale;
    }
    public void setLocale(String locale) {
        this.locale = locale;
    }
    private String value;


    public Message_ilgn(String locale, String value) {
        this.locale = locale;
        this.value = value;
    }
    public Message_ilgn() {
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
}
