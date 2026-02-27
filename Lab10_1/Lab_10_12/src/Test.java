public class Test {
    public static void main(String[] args) {
        Triangle t1;
        Rectangle r1;
        Circle c1,c2;
        r1 = new Rectangle(3,6);
        t1 = new Triangle(2,5);
        c1 = new Circle(7);
        c2 = new Circle();
        t1.display();
        r1.display();
        c1.display();
        c2.display();
    }
}
