package org.campus02.persondemo;

import java.util.Comparator;

public class BirthplaceComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getBirthplace().compareTo(o2.getBirthplace());
    }
}
