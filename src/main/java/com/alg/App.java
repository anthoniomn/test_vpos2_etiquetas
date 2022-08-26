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
    static EtiquetaLog logUnit = new EtiquetaLog();
    static ArrayList<Segments> arrSegments;
    static ArrayList<Segments> arrSegment;
    static long LogControlTimeStart;

    public static void main(String[] args) {
        //punto de control 1
        LogControlTimeStart = System.currentTimeMillis();
        arrSegments = new ArrayList<Segments>();
        arrSegment = new ArrayList<Segments>();
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
        System.out.println("arr"+arrSegments);
        InitialValidation.validateData(arrSegments);
        
        //segments.setEnd("0000");
        arrSegments.add(segments);
        arrSegment.add(segments);
        logGeneral.lifeCycle = arrSegments;
        logUnit.lifeCycle = arrSegment;
        System.out.println("Punto de control 1 => " + new Gson().toJson(logUnit));
        System.out.println("============================================================");
        System.out.println("json General => " + new Gson().toJson(logGeneral));
        
    }
}
