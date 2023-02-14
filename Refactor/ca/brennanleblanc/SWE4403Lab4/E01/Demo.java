package ca.brennanleblanc.SWE4403Lab4.E01;

public class Demo {
    public static void main(String[] args) {
        Person p = new Person("Brennan Leblanc");
        PersonAdapter c = new PersonAdapter(p);
        System.out.println(c);
        c.setFullName("Brennan LeBlanc");
        System.out.println(c);
    }
}
