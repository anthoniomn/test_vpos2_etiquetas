package com.alg.vposmm.web;

import com.alg.config.Config;
import com.alg.data.Data;
import com.alg.model.EtiquetaLog;
import com.alg.model.Message_ilgn;
import com.alg.model.Segments;
import com.google.gson.Gson;

import com.alg.vposmm.web.FlowControl;
import java.util.ArrayList;
import java.util.List;

public class InitialValidation {

    static Segments segments;
    static ArrayList<Segments> listState;
    static long LogControlTimeStart;

    public static void validateData(ArrayList<Segments> list) {
        //punto de control 2
        listState = new ArrayList<Segments>();
        LogControlTimeStart = System.currentTimeMillis();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        FlowControl.switchProcessing(list);
        segments = new Segments("incomplete", "business_rules",
        new Segments().getClass_and_method(), LogControlTimeStart, new Segments().getLine_number(), null,
        "inicia la creación de la orden", "es_PE", "inicia la creación de la orden");
        new Segments().PrintSegment(segments, list);
    }
}
