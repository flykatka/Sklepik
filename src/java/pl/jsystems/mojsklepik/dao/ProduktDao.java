package pl.jsystems.mojsklepik.dao;

import java.util.ArrayList;
import java.util.List;
import pl.jsystems.mojsklepik.utils.HibernateUtil;
import org.hibernate.Session;
import pl.jsystems.mojsklepik.model.Produkt;
import org.hibernate.Query;

/**
 *
 * @author katarzyna_bialach
 */
public class ProduktDao {

    
    public Produkt getOne(int id) {
        Produkt p = new Produkt();

        try {
            Session sesja = HibernateUtil.getSessionFactory().openSession();
            String sql = "from Produkt p where p.idProduktu=" + id;
            p = (Produkt) sesja.createQuery(sql).uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return p;
    }

    public List<Produkt> getAll() {
         List<Produkt> produkty = new ArrayList<>();
        
        try{
        Session sesja = HibernateUtil.getSessionFactory().openSession();
        produkty= ( List<Produkt>) sesja.createQuery("from Produkt p order by p.idProduktu").list();
        }catch (Exception e) {
            e.printStackTrace();}
       
        return produkty;
    
    }
public List<Produkt> getByProducent(String producent){
    List<Produkt>produkty=new ArrayList<>();
    return produkty;
    }
  
    public void save (Produkt p){  
      Session sesja = HibernateUtil.getSessionFactory().openSession();
      sesja.beginTransaction();
      sesja.save(p);
      //sesja.saveOrUpdate(p)
      sesja.getTransaction().commit();
      sesja.close();
}
    
    public void update (Produkt p){  
      Session sesja = HibernateUtil.getSessionFactory().openSession();
      sesja.beginTransaction();
      sesja.update(p);
      sesja.getTransaction().commit();
      sesja.close();
}
    public void delete (Produkt p){ 
      Session sesja = HibernateUtil.getSessionFactory().openSession();
      sesja.beginTransaction();
      sesja.delete(p);
      sesja.getTransaction().commit();
      sesja.close();
    }
    
  public int doDML(String sql){
    int x = -1;
      Session sesja = HibernateUtil.getSessionFactory().openSession();
      sesja.beginTransaction();
      Query query = sesja.createQuery(sql);
      x=query.executeUpdate();//pokazuje ile wierszy było zmienianych
        sesja.getTransaction().commit();
        sesja.close();
        return x;
    }
    
    public List<Produkt> getAllCenyOdDo(Long cenaOd, Long cenaDo){
        List<Produkt> produkty = new ArrayList<>();
        
        try{
        Session sesja = HibernateUtil.getSessionFactory().openSession();
        produkty= ( List<Produkt>) sesja.createQuery("from Produkt p where p.cenaNetto>= "+cenaOd+ " and p.cenaNetto<= "+cenaDo+" order by p.cenaNetto desc").list();        
        }
        catch (Exception e) {
            e.printStackTrace();
}return produkty;
    }  
}
