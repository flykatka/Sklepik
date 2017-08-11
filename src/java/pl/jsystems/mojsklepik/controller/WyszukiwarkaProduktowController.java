package pl.jsystems.mojsklepik.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author katarzyna_bialach
 */
@Controller
public class WyszukiwarkaProduktowController {

    @RequestMapping("/wyszukaj/{filtry}")
    public String wyszukaj(Model model, @MatrixVariable(pathVar = "filtry") Map<String, List<String>> filtry) {

        Set<String> wf = filtry.keySet();
        System.out.println(wf);
        if (wf.contains("producent")) {
            System.out.println("Jest filtracja po producentach");
            List<String> producenci = filtry.get("producent");
            for (String s : producenci) {
                System.out.println(s);
            }
        } else {
            System.out.println("Nie ma filtracji po producentach");
        }

        if (wf.contains("cenaOd")) {
            System.out.println("Jest filtracja po cenie od");
            List<String> cena = filtry.get("cenaOd");
            for (String c : cena) {
                System.out.println(c);
            }
        } else {
            System.out.println("Nie ma filtracji po cenie od");

        }
        if (wf.contains("cenaDo")) {
            System.out.println("Jest filtracja po cenie do");
            List<String> cena = filtry.get("cenaDo");
            for (String c : cena) {
                System.out.println(c);
            }
        } else {
            System.out.println("Nie ma filtracji po cenie do");

        }
        return "produkty";
    }
}
