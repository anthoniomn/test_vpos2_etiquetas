package com.alg.model;

public class Meta {
    private String client_ip;
    private String user_agent;
    private String client_timestamp;
    private String client_time_zone;
    private String server_timestamp;
    private String server_time_zone;
   
   
    // Getter Methods 
   
    public Meta(String client_ip, String user_agent, String client_timestamp, String client_time_zone,
            String server_timestamp, String server_time_zone) {
        this.client_ip = client_ip;
        this.user_agent = user_agent;
        this.client_timestamp = client_timestamp;
        this.client_time_zone = client_time_zone;
        this.server_timestamp = server_timestamp;
        this.server_time_zone = server_time_zone;
    }

    public String getClient_ip() {
     return client_ip;
    }
   
    public String getUser_agent() {
     return user_agent;
    }
   
    public String getClient_timestamp() {
     return client_timestamp;
    }
   
    public String getClient_time_zone() {
     return client_time_zone;
    }
   
    public String getServer_timestamp() {
     return server_timestamp;
    }
   
    public String getServer_time_zone() {
     return server_time_zone;
    }
   
    // Setter Methods 
   
    public void setClient_ip(String client_ip) {
     this.client_ip = client_ip;
    }
   
    public void setUser_agent(String user_agent) {
     this.user_agent = user_agent;
    }
   
    public void setClient_timestamp(String client_timestamp) {
     this.client_timestamp = client_timestamp;
    }
   
    public void setClient_time_zone(String client_time_zone) {
     this.client_time_zone = client_time_zone;
    }
   
    public void setServer_timestamp(String server_timestamp) {
     this.server_timestamp = server_timestamp;
    }
   
    public void setServer_time_zone(String server_time_zone) {
     this.server_time_zone = server_time_zone;
    }
   }