package com.alg.data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;

public class Data {
    ArrayList <DetailData> data = new ArrayList <DetailData>();

    public ArrayList<DetailData> getData() {
        return data;
    }

    public void setData(ArrayList<DetailData> data) {
        this.data = data;
    }

    public Data() {
    }

    public Data(ArrayList<DetailData> data) {
        this.data = data;
    }
    public ArrayList<DetailData> getDataJson() {
        String fichero = "";
        Gson gson = new Gson();
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\Alignet\\etiquetas\\demo_etiquetas_log\\demo\\src\\main\\java\\com\\alg\\data\\data.json"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                fichero += linea;
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        Data data = gson.fromJson(fichero, Data.class);
        return data.getData();
    }

}
