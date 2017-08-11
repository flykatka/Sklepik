
package pl.jsystems.mojsklepik.model;

/**
 *
 * @author katarzyna_bialach
 */
public class Produkt {
  private Long idProduktu;
  private String nazwaProduktu;
  private Double cenaNetto;
  private Long stanMagazynowy;
  private String producent;
  private Kategoria kategoria;

    public Produkt(Long idProduktu, String nazwaProduktu, Double cenaNetto, Long stanMagazynowy, String Producent) {
        this.idProduktu = idProduktu;
        this.nazwaProduktu = nazwaProduktu;
        this.cenaNetto = cenaNetto;
        this.stanMagazynowy = stanMagazynowy;
        this.producent = Producent;
    }

    
  
    public Produkt() {
    }

    public Long getIdProduktu() {
        return idProduktu;
    }

    public void setIdProduktu(Long idProduktu) {
        this.idProduktu = idProduktu;
    }

    public String getNazwaProduktu() {
        return nazwaProduktu;
    }

    public void setNazwaProduktu(String nazwaProduktu) {
        this.nazwaProduktu = nazwaProduktu;
    }

    public Double getCenaNetto() {
        return cenaNetto;
    }

    public void setCenaNetto(Double cenaNetto) {
        this.cenaNetto = cenaNetto;
    }

    public Long getStanMagazynowy() {
        return stanMagazynowy;
    }

    public void setStanMagazynowy(Long stanMagazynowy) {
        this.stanMagazynowy = stanMagazynowy;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public Kategoria getKategoria() {
        return kategoria;
    }

    public void setKategoria(Kategoria kategoria) {
        this.kategoria = kategoria;
    }

    @Override
    public String toString() {
        return "Produkt{" + "idProduktu=" + idProduktu + ", nazwaProduktu=" + nazwaProduktu + ", cenaNetto=" + cenaNetto + ", stanMagazynowy=" + stanMagazynowy + ", producent=" + producent + ", kategoria=" + kategoria + '}';
    } 
}
