package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("persistense");

        // you might create as Entitymanager as you wish
        EntityManager em = emf.createEntityManager();

        


    }
}
