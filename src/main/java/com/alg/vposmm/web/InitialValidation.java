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
        //punto de control 2
        LogControlTimeStart = System.currentTimeMillis();
        try {
            Thread.sleep(1567);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        FlowControl.switchProcessing();
        segments = new Segments("incomplete", "business_rules",
            new Segments().getClass_and_method(), LogControlTimeStart,
            new Segments().getLine_number(), null,
            "inicia la creación de la orden", "es_PE", "inicia la creación de la orden");
        new Segments().PrintLog(segments);
    }

}
