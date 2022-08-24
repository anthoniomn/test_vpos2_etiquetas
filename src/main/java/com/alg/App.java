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
    static Config cfg = new Config();
    static Data data = new Data();

    static Duration duracion;
    static Message_ilgn messageIlgn;
    static Segments segments;

    public static void main(String[] args) {
        cfg.initConfLog();
        ArrayList<Segments> segmentsArr = new ArrayList<Segments>();
        EtiquetaLog log = new EtiquetaLog(cfg.getSetup(), cfg.getMeta(), segmentsArr);
        //add test git
        //for (int i = 0; i < data.getDataJson().size(); i++) {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
            //punto de control 1
            messageIlgn = new Message_ilgn("es_PE", "data.getDataJson().get(i).getValue()");
            duracion = new Duration();
            duracion.setMilliseconds("100001");
            duracion.setSeconds("1");
            segments = new Segments("data.getDataJson().get(i).getState()", "data.getDataJson().get(i).getStep()",
                    "data.getDataJson().get(i).getClass_and_method()", duracion, "start", "end",
                    "data.getDataJson().get(i).getLine_number()", messageIlgn, null, "1614875661001");
            segmentsArr.add(segments);
            }
            
         }, 1000);

         new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
            //punto de control 2
            messageIlgn = new Message_ilgn("es_PE", "data.getDataJson().get(i).getValue()");
            duracion = new Duration();
            duracion.setMilliseconds("100001");
            duracion.setSeconds("1");
            segments = new Segments("data.getDataJson().get(i).getState()", "data.getDataJson().get(i).getStep()",
                    "data.getDataJson().get(i).getClass_and_method()", duracion, "start", "end",
                    "data.getDataJson().get(i).getLine_number()", messageIlgn, null, "1614875661001");
            segmentsArr.add(segments);
            getJson(log);
            }
            
         }, 2000);
    
    }

    public static void getJson(Object obj) {
        System.out.println("json => " + new Gson().toJson(obj));
    }
}
