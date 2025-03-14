package org.campus02.persondemo;

public class Person {

    private String firstname;
    private String lastname;
    private String birthplace;

    public Person(String firstname, String lastname, String birthplace) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthplace = birthplace;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthplace='" + birthplace + '\'' +
                '}';
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }
}
