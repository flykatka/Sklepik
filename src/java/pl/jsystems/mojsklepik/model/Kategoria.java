
package pl.jsystems.mojsklepik.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author katarzyna_bialach
 */
public class Kategoria {
  
    private Long idKategorii;
    private String nazwa;
    private List<Produkt> produkty= new ArrayList<>();
    
    
    
    public Kategoria() {
    }

    public Kategoria(Long idKategorii, String nazwa) {
        this.idKategorii = idKategorii;
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "Kategoria{" + "idKategorii=" + idKategorii + ", nazwa=" + nazwa + ", produkty=" + produkty + '}';
    }

    
    
 

    /**
     * @return the idKategorii
     */
    public Long getIdKategorii() {
        return idKategorii;
    }

    /**
     * @param idKategorii the idKategorii to set
     */
    public void setIdKategorii(Long idKategorii) {
        this.idKategorii = idKategorii;
    }

    /**
     * @return the nazwa
     */
    public String getNazwa() {
        return nazwa;
    }

    /**
     * @param nazwa the nazwa to set
     */
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
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
