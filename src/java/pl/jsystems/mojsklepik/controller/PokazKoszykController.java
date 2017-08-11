
package pl.jsystems.mojsklepik.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.jsystems.mojsklepik.model.Produkt;
import pl.jsystems.mojsklepik.utils.KoszykUtils;

/**
 *
 * @author katarzyna_bialach
 */
@Controller
public class PokazKoszykController {
    
    @RequestMapping("pokazKoszyk.go")
    public String pokazKoszyk(HttpServletRequest request, Model model) {
       
        KoszykUtils ku = new KoszykUtils();
        List<Produkt> k = ku.dawajKoszyk(request).getProdukty();       
        model.addAttribute("kosz", k);     
        return "koszyk";
}
    
    
}
