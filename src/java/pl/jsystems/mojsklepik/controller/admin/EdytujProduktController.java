
package pl.jsystems.mojsklepik.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.jsystems.mojsklepik.dao.KategoriaDao;
import pl.jsystems.mojsklepik.dao.ProduktDao;
import pl.jsystems.mojsklepik.model.Produkt;

/**
 *
 * @author katarzyna_bialach
 */
@Controller
public class EdytujProduktController {
 
    ProduktDao dao = new ProduktDao();
    KategoriaDao kDao = new KategoriaDao();

    @RequestMapping(value = "/edytujProdukt.go", method = RequestMethod.GET)
    public String pokaz(@RequestParam Long id, Model model) {
        Produkt p = dao.getOne(id.intValue());
        System.out.println("Będzie edycja produktu: " + p.toString());        
        model.addAttribute("kategorie", kDao.getAll());
        model.addAttribute("produkt", p);
        return "dodajProdukt";
    }

    @RequestMapping(value = "/edytujProdukt.go", method = RequestMethod.POST)
    public String przyjmuj(Produkt produkt) {
        System.out.println("Aktualizacja!!!! Dane=" + produkt.toString());
        dao.update(produkt);
        return "redirect: pokazWszystkieAdmin.go";
    }
   
}