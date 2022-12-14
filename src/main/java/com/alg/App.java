package com.alg;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import com.alg.config.Config;
import com.alg.data.Data;
import com.alg.model.Duration;
import com.alg.model.EtiquetaLog;
import com.alg.model.Message_ilgn;

import com.alg.model.Segments;
import com.alg.util.CryproGraph;
import com.alg.vposmm.web.InitialValidation;
import com.google.gson.*;

/**
 * Hello world!
 */
public final class App {
    static Segments segments;
    static long LogControlTimeStart;

    public static void main(String[] args) {
        ArrayList<Segments> arrComplete = new ArrayList<Segments>();
        LogControlTimeStart = System.currentTimeMillis();
        try {
            Thread.sleep(1567);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        InitialValidation.validateData(arrComplete);
        segments = new Segments(arrComplete, "incomplete", "capture", new Segments().getClass_and_method(), LogControlTimeStart,
            new Segments().getLine_number(), null, "Servicio de autorizacion", "es_PE", "Servicio de autorizacion");
        System.out.println("============================================================");
        new Segments().PrintArraySegments(arrComplete);
     
    }
}
