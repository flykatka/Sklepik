
package pl.jsystems.mojsklepik.controller;

import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.jsystems.mojsklepik.dao.KategoriaDao;
import pl.jsystems.mojsklepik.dao.ProduktDao;

/**
 *
 * @author katarzyna_bialach
 */
@Controller
public class PokazProduktController {
    ProduktDao dao = new ProduktDao();
    KategoriaDao kDao = new KategoriaDao();
    
    @RequestMapping("pokazProdukt.do")
   
    public String show(@RequestParam int id , Model model, HttpServletResponse response){
        model.addAttribute("prod", new ProduktDao().getOne(id));
        System.out.println("Będzie wyciągany produkt o id="+id);
    return "pokazProdukt";
    }
    
}


 