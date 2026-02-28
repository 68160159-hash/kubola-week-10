public class Employee {
    int id;
    Fullname name;
    double salary;

    public void display() {
        System.out.print(id + " ");
        name.display();
        System.out.println(" " + salary);
    }
}

