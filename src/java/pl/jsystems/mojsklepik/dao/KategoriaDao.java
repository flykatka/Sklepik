
package pl.jsystems.mojsklepik.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import pl.jsystems.mojsklepik.model.Kategoria;
import pl.jsystems.mojsklepik.utils.HibernateUtil;

/**
 *
 * @author katarzyna_bialach
 */
public class KategoriaDao {
     public Kategoria getOne(int id) {
        Kategoria k = new Kategoria();

        try {
            Session sesja = HibernateUtil.getSessionFactory().openSession();
            String sql = "from Kategoria k where k.idKategorii=" + id;
            k = (Kategoria) sesja.createQuery(sql).uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return k;
    }

    public List<Kategoria> getAll() {
        List<Kategoria> kategorie = new ArrayList<>();

        try {
            Session sesja = HibernateUtil.getSessionFactory().openSession();
            kategorie = (List<Kategoria>) sesja.createQuery("from Kategoria").list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kategorie;
    }
    
     public void save(Kategoria k) {
        Session sesja = HibernateUtil.getSessionFactory().openSession();
        sesja.beginTransaction();
        sesja.save(k);
        sesja.getTransaction().commit();
    }

    public void update(Kategoria k) {
        Session sesja = HibernateUtil.getSessionFactory().openSession();
        sesja.beginTransaction();
        sesja.update(k);
        //sesja.saveOrUpdate(k);
        sesja.getTransaction().commit();

    }

    
}
