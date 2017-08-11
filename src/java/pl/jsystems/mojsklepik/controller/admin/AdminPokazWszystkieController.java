
package pl.jsystems.mojsklepik.controller.admin;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.jsystems.mojsklepik.dao.ProduktDao;
import pl.jsystems.mojsklepik.model.Produkt;
import pl.jsystems.mojsklepik.utils.KoszykUtils;

/**
 *
 * @author katarzyna_bialach
 */

@Controller
public class AdminPokazWszystkieController {
    
     @RequestMapping("pokazWszystkieAdmin.go")
    public String pokaz(Model model, HttpServletRequest request) {
        
        Produkt p = new Produkt();
        new KoszykUtils().dodajDoKoszyka(request, p);
        
        model.addAttribute("lista", new ProduktDao().getAll());
        return "pokazWszystkieAdmin";
    }

    
}
