package com.alg.model;

import java.util.ArrayList;

import com.alg.config.Config;

public class EtiquetaLog {
    Setup setup;
    Meta meta;
    public ArrayList <Segments> lifeCycle = new ArrayList <Segments>();
    
    // Getter Methods 
    
    
    
    public EtiquetaLog(Segments obj) {
        Config cfg = new Config(obj);
        this.setup = cfg.getSetup();
        this.meta = cfg.getMeta();
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
    public void addSegment(Segments segment) {
        lifeCycle.add(segment);
        
    }
   }