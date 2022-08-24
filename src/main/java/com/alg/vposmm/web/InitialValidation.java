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
    public static void ListInitialValidation(String args) {
        Segments Segment = new Segments();
        //punto de control 1
        LogControlTimeStart = System.currentTimeMillis();
        try {
            Thread.sleep(2545);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        segments = new Segments("registered", "capture",
            Segment.getClass_and_method(), LogControlTimeStart,
            Segment.getLine_number(), null,
            LogControlTimeStart + "", "es_PE", "data.getDataJson().get(i).getValue()");
        Segment.PrintLog(segments);
    }

}
