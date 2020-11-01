package java2020_nelio.classes;

public class Rectangle {

   // 31.10.2020 Susi no hospital e Negão tbm...
   double width;
   double height;

   public double area() {
      return width * height;
   }

   public double perimeter() {
      return 2 * (width + height);
   }

   public double diagonal() {
      return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
   }
}
