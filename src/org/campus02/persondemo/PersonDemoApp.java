package org.campus02.persondemo;

public class PersonDemoApp {

    public static void main(String[] args) {

        PersonManager pm = new PersonManager();

        try {
            pm.load(".\\data\\persons.txt");
            pm.print();

        } catch (PersonLoadException e) {
            e.printStackTrace();
        }


    }

}
