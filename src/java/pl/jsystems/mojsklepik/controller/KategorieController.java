
package pl.jsystems.mojsklepik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author katarzyna_bialach
 */
@Controller
public class KategorieController {
    
    @RequestMapping("/{kategoria}")
    public String pokaz (Model model, @PathVariable String kategoria){
        System.out.println("kategoria="+kategoria);
        return "kategorie";
    }  
    @RequestMapping("/{kategoria}/{podkategoria}")
    public String pokaz2 (Model model, @PathVariable String kategoria,@PathVariable String podkategoria){
        System.out.println("kategoria="+kategoria);
         System.out.println("podkategoria="+podkategoria);
        return "kategorie";
    }
}
