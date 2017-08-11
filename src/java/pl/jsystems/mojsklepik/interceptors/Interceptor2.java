package pl.jsystems.mojsklepik.interceptors;

import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import pl.jsystems.mojsklepik.dao.FiltryCzasDao;


/**
 *
 * @author katarzyna_bialach
 */
public class Interceptor2 implements HandlerInterceptor{

    @Override
    public boolean preHandle(HttpServletRequest hsr, HttpServletResponse hsr1, Object o) throws Exception {
        
        System.out.println("preHandle2 " +" IP: "+hsr.getRemoteAddr() +" URI:" + hsr.getRequestURI() + " czas: "+ new Date());
       if (hsr.getRequestURI().contains("filtruj")){
           System.out.println("sprawdzamy czas pracy filtra");
           FiltryCzasDao fcd = new FiltryCzasDao();
           fcd.zapisz(hsr.getRemoteAddr(), new Date(), hsr.getRequestURI());
       }else
       {System.out.println("tym nie trzeba się zajmować");
       }
       
       return true;
    }

    @Override
    public void postHandle(HttpServletRequest hsr, HttpServletResponse hsr1, Object o, ModelAndView mav) throws Exception {
        System.out.println("postHandle2 " + new Date());   
    }

    @Override
    public void afterCompletion(HttpServletRequest hsr, HttpServletResponse hsr1, Object o, Exception excptn) throws Exception {
           }
}

