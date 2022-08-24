package com.alg.model;

import com.google.gson.Gson;

public class Setup {
    private String channel;
    private String id_acquirer;
    private String id_commerce;
    private String id_order_number;
    private String id_session;
    private String debug_level;
    Configuration_object configurationObject;
   
   
    // Getter Methods 
   
    public Setup(String channel, String id_acquirer, String id_commerce, String id_order_number, String id_session,
            String debug_level, Configuration_object configurationObject) {
        this.channel = channel;
        this.id_acquirer = id_acquirer;
        this.id_commerce = id_commerce;
        this.id_order_number = id_order_number;
        this.id_session = id_session;
        this.debug_level = debug_level;
        this.configurationObject = configurationObject;
    }

    public String getChannel() {
     return channel;
    }
   
    public String getId_acquirer() {
     return id_acquirer;
    }
   
    public String getId_commerce() {
     return id_commerce;
    }
   
    public String getId_order_number() {
     return id_order_number;
    }
   
    public String getId_session() {
     return id_session;
    }
   
    public String getDebug_level() {
     return debug_level;
    }
   
    public Configuration_object getConfiguration_object() {
     return configurationObject;
    }
   
    // Setter Methods 
   
    public void setChannel(String channel) {
     this.channel = channel;
    }
   
    public void setId_acquirer(String id_acquirer) {
     this.id_acquirer = id_acquirer;
    }
   
    public void setId_commerce(String id_commerce) {
     this.id_commerce = id_commerce;
    }
   
    public void setId_order_number(String id_order_number) {
     this.id_order_number = id_order_number;
    }
   
    public void setId_session(String id_session) {
     this.id_session = id_session;
    }
   
    public void setDebug_level(String debug_level) {
     this.debug_level = debug_level;
    }
   
    public void setConfiguration_object(Configuration_object configurationObject) {
     this.configurationObject = configurationObject;
    }
    public String getLineNumber() {
        String LineNumber = "";
        try {
            LineNumber = String.valueOf(Thread.currentThread().getStackTrace()[2].getLineNumber());
        } catch (Exception e) {
        } finally {
            String list = new Gson().toJson("");
            // this.listLog.clear();
        }
        return LineNumber;
    }

    public String getMethodName() {
        String className = Thread.currentThread().getStackTrace()[2].getClassName();
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        return className + "." + methodName;
    }



    public String UpdateSequence() {
        Integer seq = 1;
        return seq + "";
    }
   }