package com.alg.model;


import com.alg.config.Config;
import com.alg.data.Data;
import com.google.gson.Gson;

import java.util.ArrayList;

public class Segments {

    private String state;
    private String step;
    private String class_and_method;
    Duration durationObject;
    private String start;
    private String end;
    private String line_number;
    private String message;
    Message_ilgn message_ilgn = new Message_ilgn();
    Error errorObject;
    private String number_sequence;
    static Duration duration;

    static Config cfg = new Config();
    static Data data = new Data();

    public Segments(String state, String step, String class_and_method, long start,
                    String line_number, Error errorObject, String number_sequence, String Message,
                    String Message_ilgn_locale, String Message_ilgn_value) {
        this.state = state;
        this.step = step;
        this.class_and_method = class_and_method;
        this.start = start + "";
        long endTime = System.currentTimeMillis();
        duration = new Duration();
        duration.setMilliseconds(endTime - start + "");
        duration.setSeconds("1");
        this.durationObject = duration;
        this.end = endTime + "";
        this.message = Message;
        this.line_number = line_number;
        this.errorObject = errorObject;
        this.number_sequence = number_sequence;
        this.message_ilgn = new Message_ilgn(Message_ilgn_locale, Message_ilgn_value);

    }

    public Segments() {

    }

    public Message_ilgn getMessage_ilgn() {
        return message_ilgn;
    }

    public void setMessage_ilgn(Message_ilgn message_ilgn) {
        this.message_ilgn = message_ilgn;
    }


    // Getter Methods

    public String getState() {
        return state;
    }

    public String getStep() {
        return step;
    }

    public String getClass_and_method() {
        String className = Thread.currentThread().getStackTrace()[2].getClassName();
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        return className + "." + methodName;
    }

    public void PrintLog(Segments segments) {
        cfg.initConfLog();
        ArrayList<Segments> segmentsArr = new ArrayList<Segments>();
        EtiquetaLog log = new EtiquetaLog(cfg.getSetup(), cfg.getMeta(), segmentsArr);
        segmentsArr.add(segments);
        System.out.println("json => " + new Gson().toJson(log));
    }

    public Duration getDuration() {
        return durationObject;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public String getLine_number() {
//        String line_number = "";
        try {
            line_number = String.valueOf(Thread.currentThread().getStackTrace()[2].getLineNumber());
        } catch (Exception e) {
//            LOG_TIME.error(e.getMessage(), e);
            System.out.println(e.getMessage());
            return line_number;
        }
        return line_number;
    }

    public Error getError() {
        return errorObject;
    }

    public String getNumber_sequence() {
        return number_sequence;
    }

    // Setter Methods

    public void setState(String state) {
        this.state = state;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public void setClass_and_method(String class_and_method) {
        this.class_and_method = class_and_method;
    }

    public void setDuration(Duration durationObject) {
        this.durationObject = durationObject;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public void setLine_number(String line_number) {
        this.line_number = line_number;
    }

    public void setError(Error errorObject) {
        this.errorObject = errorObject;
    }

    public void setNumber_sequence(String number_sequence) {
        this.number_sequence = number_sequence;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
