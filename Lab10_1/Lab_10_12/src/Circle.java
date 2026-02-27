public class Circle {
   int radius;

   Circle() {
       radius = 1;
   }
   Circle(int r){
       radius = r;
   }
   double area(){
       return 3.1416 * radius * radius;
   }
    double circumference(){
        return 2 * 3.1416 * radius;
}
    void display() {
        System.out.println("Circle:");
        System.out.println("Radius:" + radius);
        System.out.println("Area = " + String.format("%.2f", area()));
        System.out.println("Circumference = " + String.format("%.2f", circumference()));
   }
}
