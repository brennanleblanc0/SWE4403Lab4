package ca.brennanleblanc.SWE4403Lab4.E01;

public class PersonAdapter extends Customer {
    private final Person p;

    public PersonAdapter(Person p) {
        super();
        this.p = p;
        convertName();
    }

    public void setFullName(String fullName) {
        p.setFullName(fullName);
        convertName();
    }

    private void convertName() {
        String temp = p.getFullName();
        String[] name = {"", ""};
        int nfirst_last = 0;
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == ' ') {
                nfirst_last = 1;
            } else {
                name[nfirst_last] += temp.charAt(i);
            }
        }

        super.lastName = name[1];
        super.firstName = name[0];
    }
}
