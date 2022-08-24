package com.alg.model;

import java.util.ArrayList;

public class EtiquetaLog {
    Setup setup;
    Meta meta;
    public ArrayList <Segments> lifeCycle = new ArrayList <Segments>();
   
   
    // Getter Methods 
   
    public EtiquetaLog() {
    }

    public EtiquetaLog(Setup setup, Meta meta, ArrayList<Segments> lifeCycle) {
        this.setup = setup;
        this.meta = meta;
        this.lifeCycle = lifeCycle;
    }

    public Setup getSetup() {
     return setup;
    }
   
    public Meta getMeta() {
     return meta;
    }
   
    // Setter Methods 
   
    public void setSetup(Setup setup) {
     this.setup = setup;
    }
   
    public void setMeta(Meta meta) {
     this.meta = meta;
    }
   }