
package pl.jsystems.mojsklepik.utils;



import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 *
 * @author katarzyna_bialach
 */
public class HibernateUtil {
  
    private static final SessionFactory sessionFactory = buildSessionFactory();
    
    private static SessionFactory buildSessionFactory(){
   
        try {
            return new Configuration().configure().buildSessionFactory();
            
        } catch (Exception ex) {
            // Log the exception. 
            System.err.println(ex.toString());
           
            return null;
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}   

