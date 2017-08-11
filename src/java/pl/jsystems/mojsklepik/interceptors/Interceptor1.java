
package pl.jsystems.mojsklepik.interceptors;


import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author katarzyna_bialach
 */
public class Interceptor1 implements HandlerInterceptor{

    @Override
    public boolean preHandle(HttpServletRequest hsr, HttpServletResponse hsr1, Object o) throws Exception {
       System.out.println("preHandle " + new Date()+" IP: "+hsr.getRemoteAddr());
       if (hsr.getRequestURI().contains("pokaz")){
           System.out.println("to jest jakiś pokaz");
       }else
       {System.out.println("to jest coś innego");
       }
       
       return true;
    }

    @Override
    public void postHandle(HttpServletRequest hsr, HttpServletResponse hsr1, Object o, ModelAndView mav) throws Exception {
      System.out.println("postHandle " + new Date());   
    }

    @Override
    public void afterCompletion(HttpServletRequest hsr, HttpServletResponse hsr1, Object o, Exception excptn) throws Exception {
       System.out.println("afterCompletion " + new Date());  
    }
    
}
