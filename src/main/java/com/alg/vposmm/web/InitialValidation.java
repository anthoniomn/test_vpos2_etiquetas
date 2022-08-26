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
    static EtiquetaLog logUnit = new EtiquetaLog();
    static ArrayList<Segments> listUnit;
    static long LogControlTimeStart;

    public static void validateData(ArrayList<Segments> list) {
        //punto de control 2
        listUnit = new ArrayList<Segments>();
        LogControlTimeStart = System.currentTimeMillis();
        try {
            Thread.sleep(1567);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        segments = new Segments("incomplete", "business_rules",
        new Segments().getClass_and_method(), LogControlTimeStart,
        new Segments().getLine_number(), null,
        "inicia la creación de la orden", "es_PE", "inicia la creación de la orden");
        FlowControl.switchProcessing(list);
        list.add(segments);
        listUnit.add(segments);
        logUnit.lifeCycle = listUnit;
        System.out.println("Punto de control 2 => " + new Gson().toJson(logUnit));

        
    }

}
