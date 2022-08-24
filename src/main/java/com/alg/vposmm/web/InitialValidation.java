package com.alg.vposmm.web;

import com.alg.config.Config;
import com.alg.data.Data;
import com.alg.model.EtiquetaLog;
import com.alg.model.Message_ilgn;
import com.alg.model.Segments;

import java.util.ArrayList;

public class InitialValidation {

    static Segments segments;

    static long LogControlTimeStart;

    public static void validateData() {
        Segments Segment = new Segments();
        //punto de control 2
        LogControlTimeStart = System.currentTimeMillis();
        try {
            Thread.sleep(1567);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        FlowControl.validateData();
        segments = new Segments("registered", "capture",
            Segment.getClass_and_method(), LogControlTimeStart,
            Segment.getLine_number(), null, LogControlTimeStart + "",
            "punto de control 2", "es_PE", "punto de control 2");
        Segment.PrintLog(segments);
    }

}
