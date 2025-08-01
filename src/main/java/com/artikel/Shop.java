package com.artikel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@ManagedBean(name="shop")
@SessionScoped
public class Shop {
	
    private List<Artikel> sortiment = new ArrayList<>();
    
    public Shop(){        
        sortiment.add(new Artikel("Filzpantoffeln Rudolph", 29.95, "Hausschuhe", true, "resources/images/rudolph.png"));
        sortiment.add(new Artikel("Winterstiefel Alaska", 49.95, "Stiefel", false, "resources/images/alaska.png"));
        sortiment.add(new Artikel("Sommersandalen Capri", 19.95, "Sandalen", true, "resources/images/capri.png"));
        sortiment.add(new Artikel("Gummistiefel Sven", 39.95, "Stiefel", false, "resources/images/sven.png"));
    }
    
    public List<Artikel> getSortiment() {
        return sortiment;
    }
    
     public String addArtikel(Artikel artikel) {
    	 FacesContext context = FacesContext.getCurrentInstance();
    	 
         if (sortiment.size() < 10) {
             sortiment.add(new Artikel(
            	        artikel.getName(),
            	        artikel.getPreis(),
            	        artikel.getKategorie(),
            	        artikel.isVerfuegbarkeit(),
            	        artikel.getBild()
            	    ));
         } else {
             context.addMessage(null, new FacesMessage(
                 FacesMessage.SEVERITY_ERROR,
                 "Maximale Anzahl von Artikeln erreicht (10).",
                 null
             ));
             return null;
         }
         return "index?faces-redirect=true";
     	}
   
     public String getRowClasses() {
    	 return sortiment.stream()
                 .map(artikel -> artikel.isVerfuegbarkeit() ? "verfuegbar" : "ausverkauft")
                 .collect(Collectors.joining(","));
    	}

     
     }    
