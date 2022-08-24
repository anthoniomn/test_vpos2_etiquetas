package com.alg.model;


public class Segments {

    private String state;
    private String step;
    private String class_and_method;
    Duration durationObject;
    private String start;
    private String end;
    private String line_number;
    Message_ilgn message_ilgn = new Message_ilgn();
    Error errorObject;
    private String number_sequence;
    
    
    public Segments(String state, String step, String class_and_method, Duration durationObject, String start,
            String end, String line_number, Message_ilgn message_ilgn, Error errorObject, String number_sequence) {
        this.state = state;
        this.step = step;
        this.class_and_method = class_and_method;
        this.durationObject = durationObject;
        this.start = start;
        this.end = end;
        this.line_number = line_number;
        this.message_ilgn = message_ilgn;
        this.errorObject = errorObject;
        this.number_sequence = number_sequence;
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
        return class_and_method;
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
}
