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

import com.google.gson.*;

/**
 * Hello world!
 */
public final class App {
    static Segments segments;

    static long LogControlTimeStart;

    public static void main(String[] args) {
        Segments Segment = new Segments();
        //punto de control 1
        LogControlTimeStart = System.currentTimeMillis();
        try {
            Thread.sleep(1567);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        segments = new Segments("registered", "capture",
            Segment.getClass_and_method(), LogControlTimeStart,
            Segment.getLine_number(), null,
            LogControlTimeStart + "", "es_PE", "data.getDataJson().get(i).getValue()");
        Segment.PrintLog(segments);

    }
}
