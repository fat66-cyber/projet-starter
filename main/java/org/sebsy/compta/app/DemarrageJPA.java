package org.sebsy.compta.app;

import org.hibernate.SessionFactory;
import org.sebsy.compta.infra.Jpa;

public class DemarrageJPA {
    public static void main(String[] args) {
        SessionFactory factory = Jpa.factory();
        System.out.println(factory.getClass().getName());

    }
}
