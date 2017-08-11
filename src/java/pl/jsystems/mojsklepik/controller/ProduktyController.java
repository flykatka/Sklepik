
package pl.jsystems.mojsklepik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.jsystems.mojsklepik.dao.ProduktDao;

/**
 *
 * @author katarzyna_bialach
 */
@Controller
public class ProduktyController {
@RequestMapping("/produkty.do")
public String show(Model model){
    ProduktDao pDao = new ProduktDao();
    model.addAttribute("lista", pDao.getAll());
    return "produkty";
}
     
}
