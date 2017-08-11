
package pl.jsystems.mojsklepik.testy;

import pl.jsystems.mojsklepik.dao.KategoriaDao;
import pl.jsystems.mojsklepik.dao.ProduktDao;
import pl.jsystems.mojsklepik.model.Kategoria;
import pl.jsystems.mojsklepik.model.Produkt;

/**
 *
 * @author katarzyna_bialach
 */
public class Testowa {
     public static void main(String args[]) {
        ProduktDao pDao = new ProduktDao();
        KategoriaDao kDao = new KategoriaDao();
             
       /*for(Produkt p : pDao.getByKategoria(1L)){
           System.out.println(p); 
        }*/
      for (Produkt p : pDao.getAll()){
          System.out.println(p);
        /*Kategoria k = new Kategoria();
        k.setNazwa("odzież damska");
        kDao.save(k);*/
        
       /*Kategoria k = kDao.getOne(1);
        for (Produkt p : pDao.getAll()){
            p.setKategoria(k);
            pDao.update(p);*/
    }
    }
     }
     

