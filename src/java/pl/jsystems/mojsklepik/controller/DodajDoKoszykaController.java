
package pl.jsystems.mojsklepik.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.jsystems.mojsklepik.dao.ProduktDao;
import pl.jsystems.mojsklepik.model.Produkt;
import pl.jsystems.mojsklepik.utils.KoszykUtils;

/**
 *
 * @author katarzyna_bialach
 */
@Controller
public class DodajDoKoszykaController {
 
    @RequestMapping("dodajDoKoszyka.go")
    public String dodajDoKoszyka(@RequestParam Long id, HttpServletRequest request, Model model) {
        ProduktDao dao = new ProduktDao();        
        Produkt p = dao.getOne(id.intValue());
        KoszykUtils ku = new KoszykUtils();
        ku.dodajDoKoszyka(request, p);
        List<Produkt> k = ku.dawajKoszyk(request).getProdukty();
        //  model.addAttribute("prods", new ProduktDao().getAll());
        model.addAttribute("kosz", k);
     
        return "koszyk";
}    
}    

