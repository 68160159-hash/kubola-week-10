public class Person {
    String firstname;
    String lastname;
    int age;

    public Person(String firstname, String lastname, int age) {
        firstname = firstname;
        lastname = lastname;
        age = age;
    }

    public void show() {
        System.out.println("Name : " + firstname + " " + lastname + " Age : " + age);
    }
}
