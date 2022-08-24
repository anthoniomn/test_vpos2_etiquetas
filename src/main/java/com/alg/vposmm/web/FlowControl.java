package com.alg.vposmm.web;

import com.alg.model.Segments;

public class FlowControl {
    static Segments segments;

    static long LogControlTimeStart;
    public static void validateData() {
        Segments Segment = new Segments();
        //punto de control 3
        LogControlTimeStart = System.currentTimeMillis();
        try {
            Thread.sleep(2659);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        segments = new Segments("Incomplete", "Flow_control",
            Segment.getClass_and_method(), LogControlTimeStart,
            Segment.getLine_number(), null, LogControlTimeStart + "",
            "punto de control 3", "es_PE", "punto de control 3");
        Segment.PrintLog(segments);
    }
}
