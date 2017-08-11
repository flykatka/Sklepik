
package pl.jsystems.mojsklepik.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author katarzyna_bialach
 */
public class Koszyk implements Serializable{
    private List<Produkt> produkty  = new ArrayList<>();
    
    public void wyswietlZawartoscKoszyka(){    
        for(Produkt p : produkty){
            System.out.println(p);
        }
    }

    /**
     * @return the produkty
     */
    public List<Produkt> getProdukty() {
        return produkty;
    }

    /**
     * @param produkty the produkty to set
     */
    public void setProdukty(List<Produkt> produkty) {
        this.produkty = produkty;
    }
    
}
