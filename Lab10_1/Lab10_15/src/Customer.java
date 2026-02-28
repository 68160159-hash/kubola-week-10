public class Customer {
    int id;
    Fullname name;
    String tel;

    public void display() {
        System.out.print(id + " ");
        name.display();
        System.out.println(" " + tel);
    }
}

