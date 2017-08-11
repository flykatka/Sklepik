package pl.jsystems.mojsklepik.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.jsystems.mojsklepik.dao.KategoriaDao;
import pl.jsystems.mojsklepik.dao.ProduktDao;
import pl.jsystems.mojsklepik.model.Produkt;

/**
 *
 * @author katarzyna_bialach
 */
@Controller
public class DodajProduktController {
  ProduktDao pDao = new ProduktDao();
  KategoriaDao kDao = new KategoriaDao();
    
    @RequestMapping(value="/dodajProdukt.go", method=RequestMethod.GET)
    public String wyswietlFormularz (Model model){
        Produkt p =new Produkt();
        //p.setStanMagazynowy(0L); żeby zdefiniować pole jako Long
        model.addAttribute("produkt", p);
        model.addAttribute("kategorie", kDao.getAll());
        return "dodajProdukt";
}
    @RequestMapping(value="/dodajProdukt.go", method=RequestMethod.POST)
    public String odbierzFormularz(Produkt p){
        System.out.println("zapisuję do bazy produkt: "+p.toString());
        pDao.save(p);
         return "redirect: pokazWszystkieAdmin.go";

    }
}   

