package com.alg.config;

import com.alg.model.Configuration_object;
import com.alg.model.Meta;
import com.alg.model.Setup;

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

    public Config() {
    }

    public void initConfLog() {
        Configuration_object configurationObject = new Configuration_object("6f71eb61986f9f89f5dc64051788679fb41b9c4d",
            "compression_algorithm", "compressed_configuration_object_md5_checksum",
            "compressed_configuration_object_size_in_bytes");
        setup = new Setup("REST", "144", "8737", "985696", "3500932", "INFO", configurationObject);
        meta = new Meta("client_ip", "user_agent", System.currentTimeMillis() + "", "GMT-5", System.currentTimeMillis() + "",
            "GMT-4");
    }

}
