package ca.brennanleblanc.SWE4403Lab4.E01;

public class Customer {
    protected String lastName, firstName;

    public Customer(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    protected Customer() {
        lastName = "";
        firstName = "";
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Customer[lastName=" + lastName + ", firstName=" + firstName + "]";
    }
}
