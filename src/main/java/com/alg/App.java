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
    static EtiquetaLog log = new EtiquetaLog();
    static ArrayList<Segments> arrSegments;
    static long LogControlTimeStart;

    public static void main(String[] args) {
        //punto de control 1
        LogControlTimeStart = System.currentTimeMillis();
        arrSegments = new ArrayList<Segments>();
        try {
            Thread.sleep(1567);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        segments = new Segments("incomplete", "capture",
        new Segments().getClass_and_method(), LogControlTimeStart,
        new Segments().getLine_number(), null,
        "Servicio de autorizacion", "es_PE", "Servicio de autorizacion");
        arrSegments.add(segments);
        log.lifeCycle = arrSegments;
        InitialValidation.validateData(log.lifeCycle);
        
    }
}
