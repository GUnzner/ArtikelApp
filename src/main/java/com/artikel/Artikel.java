package com.artikel;

import javax.faces.bean.SessionScoped;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="artikel")
@SessionScoped
public class Artikel implements Serializable {
    
    private String name;
    private Double preis;
    private String kategorie;
    private boolean verfuegbarkeit;
    private String bild; 

    public Artikel() {
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

    public Double getPreis() {
        return preis;
    }

    public void setPreis(Double preis) {
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

     public Artikel(String name, Double preis, String kategorie, boolean verfuegbarkeit, String bild) {
        this.name = name;
        this.preis = preis;
        this.kategorie = kategorie;
        this.verfuegbarkeit = verfuegbarkeit;
        this.bild = bild;
    }

//     public String getRowClasses() {
//    	    return this.verfuegbarkeit ? "verfuegbar" : "ausverkauft";
//    	}

   
}
