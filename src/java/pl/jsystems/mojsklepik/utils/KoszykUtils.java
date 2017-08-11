
package pl.jsystems.mojsklepik.utils;

import javax.servlet.http.HttpServletRequest;
import pl.jsystems.mojsklepik.model.Koszyk;
import pl.jsystems.mojsklepik.model.Produkt;

/**
 *
 * @author katarzyna_bialach
 */
public class KoszykUtils {
    public Koszyk dawajKoszyk(HttpServletRequest request) {
        Koszyk koszyk = new Koszyk();
        if (request.getSession().getAttribute("koszyk") != null) {
            koszyk = (Koszyk) request.getSession().getAttribute("koszyk");
        } else {
            request.getSession().setAttribute("koszyk", koszyk);
        }
        return koszyk;
    }

    public void dodajDoKoszyka(HttpServletRequest request, Produkt p) {
        Koszyk k = dawajKoszyk(request);
        k.getProdukty().add(p);
        request.getSession().setAttribute("koszyk", k);
    }
    
}
