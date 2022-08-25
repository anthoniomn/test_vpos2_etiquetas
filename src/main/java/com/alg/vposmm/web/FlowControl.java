package com.alg.vposmm.web;

import com.alg.model.Segments;
import com.alg.vposmm.rest.util.RestUtil;

public class FlowControl {
    static Segments segments;

    static long LogControlTimeStart;
    public static void switchProcessing() {
        //punto de control 3
        LogControlTimeStart = System.currentTimeMillis();
        try {
            Thread.sleep(2659);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        RestUtil.setTransactionWSRes();
        segments = new Segments("incomplete", "flow_control",
            new Segments().getClass_and_method(), LogControlTimeStart,
            new Segments().getLine_number(), null,
            "Validar si consume el servicio de RBA - Onboarding", "es_PE", "Validar si consume el servicio de RBA - Onboarding");
        new Segments().PrintLog(segments);
    }
}
