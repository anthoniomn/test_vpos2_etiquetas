package com.alg.vposmm.web;

import java.util.ArrayList;

import com.alg.model.EtiquetaLog;
import com.alg.model.Segments;
import com.alg.vposmm.rest.util.RestUtil;
import com.google.gson.Gson;

public class FlowControl {
    static Segments segments;
    static EtiquetaLog logState = new EtiquetaLog();
    static ArrayList<Segments> listUnit;
    static long LogControlTimeStart;
    public static void switchProcessing(ArrayList<Segments> list) {
        //punto de control 3
        listUnit = new ArrayList<Segments>();
        LogControlTimeStart = System.currentTimeMillis();
        try {
            Thread.sleep(2659);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        RestUtil.setTransactionWSRes(list);
        segments = new Segments("incomplete", "flow_control",
        new Segments().getClass_and_method(), LogControlTimeStart,
        new Segments().getLine_number(), null,
        "Validar si consume el servicio de RBA - Onboarding", "es_PE", "Validar si consume el servicio de RBA - Onboarding");
        new Segments().PrintSegment(segments);
    }
}
