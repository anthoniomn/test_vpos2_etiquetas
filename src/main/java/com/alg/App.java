package com.alg;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import com.alg.config.Config;
import com.alg.data.Data;
import com.alg.model.Duration;
import com.alg.model.EtiquetaLog;
import com.alg.model.Message_ilgn;

import com.alg.model.Segments;

import com.alg.vposmm.web.InitialValidation;
import com.google.gson.*;

/**
 * Hello world!
 */
public final class App {
    static Segments segments;
    static EtiquetaLog logGeneral = new EtiquetaLog();
    static EtiquetaLog logState = new EtiquetaLog();
    static ArrayList<Segments> arrComplete;
    static ArrayList<Segments> arrState;
    static long LogControlTimeStart;

    public static void main(String[] args) {
        //punto de control 1
        LogControlTimeStart = System.currentTimeMillis();
        arrComplete = new ArrayList<Segments>();
        arrState = new ArrayList<Segments>();
        try {
            Thread.sleep(1567);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // codigo y +codigo
        //va al configurador();
        segments = new Segments("incomplete", "capture",
        new Segments().getClass_and_method(), LogControlTimeStart,
        new Segments().getLine_number(), null,
        "Servicio de autorizacion", "es_PE", "Servicio de autorizacion");
        System.out.println("arr"+arrComplete);
        InitialValidation.validateData(arrComplete);
        
        //segments.setEnd("0000");
        arrComplete.add(segments);
        arrState.add(segments);
        logGeneral.lifeCycle = arrComplete;
        logState.lifeCycle = arrState;
        System.out.println("Punto de control 1 => " + new Gson().toJson(logState));
        System.out.println("============================================================");
        System.out.println("json General => " + new Gson().toJson(logGeneral));
        
    }
}
