package com.alg.model;

public class Configuration_object {
    private String compressed_configuration_object;
    private String compression_algorithm;
    private String compressed_configuration_object_md5_checksum;
    private String compressed_configuration_object_size_in_bytes;
   
   
    // Getter Methods 
   
    public Configuration_object(String compressed_configuration_object, String compression_algorithm,
            String compressed_configuration_object_md5_checksum, String compressed_configuration_object_size_in_bytes) {
        this.compressed_configuration_object = compressed_configuration_object;
        this.compression_algorithm = compression_algorithm;
        this.compressed_configuration_object_md5_checksum = compressed_configuration_object_md5_checksum;
        this.compressed_configuration_object_size_in_bytes = compressed_configuration_object_size_in_bytes;
    }

    public String getCompressed_configuration_object() {
     return compressed_configuration_object;
    }
   
    public String getCompression_algorithm() {
     return compression_algorithm;
    }
   
    public String getCompressed_configuration_object_md5_checksum() {
     return compressed_configuration_object_md5_checksum;
    }
   
    public String getCompressed_configuration_object_size_in_bytes() {
     return compressed_configuration_object_size_in_bytes;
    }
   
    // Setter Methods 
   
    public void setCompressed_configuration_object(String compressed_configuration_object) {
     this.compressed_configuration_object = compressed_configuration_object;
    }
   
    public void setCompression_algorithm(String compression_algorithm) {
     this.compression_algorithm = compression_algorithm;
    }
   
    public void setCompressed_configuration_object_md5_checksum(String compressed_configuration_object_md5_checksum) {
     this.compressed_configuration_object_md5_checksum = compressed_configuration_object_md5_checksum;
    }
   
    public void setCompressed_configuration_object_size_in_bytes(String compressed_configuration_object_size_in_bytes) {
     this.compressed_configuration_object_size_in_bytes = compressed_configuration_object_size_in_bytes;
    }
   }