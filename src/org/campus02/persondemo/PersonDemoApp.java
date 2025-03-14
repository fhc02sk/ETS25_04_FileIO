package org.campus02.persondemo;

import java.util.ArrayList;
import java.util.Collections;

public class PersonDemoApp {

    public static void main(String[] args) {

        PersonManager pm = new PersonManager();

        try {
            pm.load(".\\data\\persons.txt");
            pm.print();

            /*
                ArrayList in PersonManager um getter erweitern
                Schreiben Sie eine Defaultsortierung für die Personenklasse
                    - Nachname - Absteigend
                    - bei Gleichstand - Vorname - Aufsteigend

                Schreiben Sie eine weitere Sortierung nach
                  - Birthplace
             */

            ArrayList<Person> persons = pm.getPersons();

            Collections.sort(persons, new BirthplaceComparator());
            System.out.println("sorting----");
            for (Person p : persons) {
                System.out.println(p);
            }

        } catch (PersonLoadException e) {
            e.printStackTrace();
        }


    }

}
