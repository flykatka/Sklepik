
package pl.jsystems.mojsklepik.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.jsystems.mojsklepik.dao.ProduktDao;
import pl.jsystems.mojsklepik.model.Produkt;

/**
 *
 * @author katarzyna_bialach
 */
@Controller
public class KasujProduktController {
  
    @RequestMapping("kasujTo.go")
    public String kasujTo(@RequestParam Long id, Model model){
        ProduktDao dao = new ProduktDao();
        Produkt p = dao.getOne(id.intValue());
       
        dao.delete(p);
        return "redirect:pokazWszystkieAdmin.go";
  
}

}