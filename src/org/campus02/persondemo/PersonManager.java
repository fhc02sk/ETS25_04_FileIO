package org.campus02.persondemo;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class PersonManager {

    private ArrayList<Person> persons;

    public PersonManager() {
        this.persons = new ArrayList<>();
    }

    public void load(String path) throws PersonLoadException {

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_16BE)
        )) {

            String line;
            br.readLine(); // nicht weglöschen, CSV-Dateien haben immer Kopfzeile, die interessiert uns aber nicht
            int counter=0;
            while ((line = br.readLine()) != null) {
                counter++;

                if (line.isEmpty())
                    continue;

                String[] columns = line.split(",");

                if (columns.length != 3){
                    throw new PersonLoadException("Fehler in Zeile: " + counter + " > " + line);
                }

                Person p = new Person(columns[0], columns[1], columns[2]);
                persons.add(p);
            }

        }
        catch (FileNotFoundException e) {
            throw new PersonLoadException("Datei nicht gefunden: " + path, e);

        } catch (IOException e) {
            throw new PersonLoadException("IOException: " + path, e);
        }


    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void print() {
        System.out.println("print persons");
        for (Person p : persons) {
            System.out.println(p);
        }
    }
}

