package com.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HUtils {
    static SessionFactory sf;
    static {
        Configuration cfg = new Configuration().configure();
        sf = cfg.buildSessionFactory();
    }

    public static Session session(){
        return  sf.getCurrentSession();
    }
}
