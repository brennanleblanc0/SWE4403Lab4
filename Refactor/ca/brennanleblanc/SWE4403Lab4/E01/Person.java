package ca.brennanleblanc.SWE4403Lab4.E01;

public class Person {
    private String fullName;

    public Person(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Person [fullName=" + fullName + "]";
    }
}