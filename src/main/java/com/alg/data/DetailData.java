package com.alg.data;

public class DetailData {
        private String state;
        private String step;
        private String class_and_method;
        private String line_number;
        private String value;
       
       
        // Getter Methods 
       
        public DetailData(String state, String step, String class_and_method, String line_number, String value) {
            this.state = state;
            this.step = step;
            this.class_and_method = class_and_method;
            this.line_number = line_number;
            this.value = value;
        }

        public String getState() {
         return state;
        }
       
        public String getStep() {
         return step;
        }
       
        public String getClass_and_method() {
         return class_and_method;
        }
       
        public String getLine_number() {
         return line_number;
        }
       
        public String getValue() {
         return value;
        }
       
        // Setter Methods 
       
        public void setState(String state) {
         this.state = state;
        }
       
        public void setStep(String step) {
         this.step = step;
        }
       
        public void setClass_and_method(String class_and_method) {
         this.class_and_method = class_and_method;
        }
       
        public void setLine_number(String line_number) {
         this.line_number = line_number;
        }
       
        public void setValue(String value) {
         this.value = value;
        }
       
}
