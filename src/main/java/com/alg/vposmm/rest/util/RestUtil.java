package com.alg.vposmm.rest.util;

import java.util.ArrayList;

import com.alg.model.EtiquetaLog;
import com.alg.model.Segments;
import com.alg.vposmm.web.FlowControl;
import com.google.gson.Gson;

public class RestUtil {
    static Segments segments;
    //static EtiquetaLog log = new EtiquetaLog();
    static EtiquetaLog logUnit = new EtiquetaLog();
    static ArrayList<Segments> listUnit; 
    static long LogControlTimeStart;

    public static void setTransactionWSRes(ArrayList<Segments> list) {
        //punto de control 4
        listUnit = new ArrayList<Segments>();
        LogControlTimeStart = System.currentTimeMillis();
        try {
            Thread.sleep(1567);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        segments = new Segments("authorized", "authorization",
            new Segments().getClass_and_method(), LogControlTimeStart,
            new Segments().getLine_number(), null,
            "uso de RBA para confirmación", "es_PE", "uso de RBA para confirmación");
        list.add(segments);
        listUnit.add(segments);
        logUnit.lifeCycle = listUnit;
        System.out.println("Punto de control 4 => " + new Gson().toJson(logUnit));
        //log.lifeCycle = list;
        
    }
}
