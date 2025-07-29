package com.artikel;

//import jakarta.inject.Named;
//import javax.enterprise.context.SessionScoped;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
//import java.util.ArrayList;
//import java.util.List;

@ManagedBean(name="artikel")
@SessionScoped
public class Artikel implements Serializable {
    
    private String name;
    private double preis;
    private String kategorie;
    private boolean verfuegbarkeit;
    private String bild; 

    public Artikel() {
         // Default constructor
     }

     // Getters and Setters

    public String getBild() {
        return bild;
    }

    public void setBild(String bild) {
        this.bild = bild;
    }

    private static final long serialVersionUID = 1L;

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public String getKategorie() {
        return kategorie;
    }

    public void setKategorie(String kategorie) {
        this.kategorie = kategorie;
    }

    public boolean isVerfuegbarkeit() {
        return verfuegbarkeit;
    }

    public void setVerfuegbarkeit(boolean verfuegbarkeit) {
        this.verfuegbarkeit = verfuegbarkeit;
    }

     public Artikel(String name, double preis, String kategorie, boolean verfuegbarkeit, String bild) {
        this.name = name;
        this.preis = preis;
        this.kategorie = kategorie;
        this.verfuegbarkeit = verfuegbarkeit;
        this.bild = bild;
    }

 

   
}
