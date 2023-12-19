package at.ran.test;

public class Person {
    private String firstname;
    private String lastname;


    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String printName(){
        return firstname + " " + lastname;
    }
}
