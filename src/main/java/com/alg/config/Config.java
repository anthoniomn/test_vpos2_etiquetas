package com.alg.config;

import com.alg.model.Configuration_object;
import com.alg.model.Meta;
import com.alg.model.Segments;
import com.alg.model.Setup;
import com.alg.util.CryproGraph;

public class Config {

    private Setup setup;
    private Meta meta;

    public Setup getSetup() {
        return setup;
    }

    public void setSetup(Setup setup) {
        this.setup = setup;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Config(Segments obj) {
        Configuration_object configurationObject = new Configuration_object(CryproGraph.getStringMD5(obj),
        "MD5", CryproGraph.getStringMD5(obj),
        "128");
    setup = new Setup("REST", "144", "8737", "985696", "3500932", "INFO", configurationObject);
    meta = new Meta("client_ip", "user_agent", System.currentTimeMillis() + "", "GMT-5", System.currentTimeMillis() + "",
        "GMT-4");
    }

    

}
