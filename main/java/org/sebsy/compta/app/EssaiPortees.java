package org.sebsy.compta.app;

import org.hibernate.Session;
import org.sebsy.compta.domain.Fournisseur;
import org.sebsy.compta.infra.Jpa;

public class EssaiPortees {

    public static void main(String[] args) {

        Fournisseur f1;
        Fournisseur f2;

        // Première transaction
        try (Session session = Jpa.factory().openSession()) {
            session.beginTransaction();

            f1 = session.find(Fournisseur.class, 1L);

            session.getTransaction().commit();
        }

        // Deuxième transaction
        try (Session session = Jpa.factory().openSession()) {
            session.beginTransaction();

            f2 = session.find(Fournisseur.class, 1L);

            session.getTransaction().commit();
        }

        System.out.println("Même référence (==) : " + (f1 == f2));
        System.out.println("Même contenu (equals) : " + f1.equals(f2));
    }
}