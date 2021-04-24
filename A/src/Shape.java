abstract class Shape{
	
 public void draw()
 {
 System.out.println("Draw method in shape class");
 }
 public abstract double calculateArea();
}
class Rectangle extends Shape{
 double length;
 double width;
 public Rectangle(double length, double width) {
 this.length = length;
 this.width = width;
 }
 @Override
 public double calculateArea() {
 return length* width;
 }
}
class Circle extends Shape{
 double radius;
 public Circle(double radius) {
 this.radius = radius;
 }
 @Override
 public double calculateArea() {
 return 3.14*radius*radius;
 }
}
class Test1 {
 public static void main(String[] args)
 {
 Rectangle rec=new Rectangle(3, 4);
 rec.draw();
 System.out.println("Area of rectangle is "+rec.calculateArea());
 System.out.println("============================");
 Circle cir=new Circle(5);
 cir.draw();
 System.out.println("Area of circle is "+cir.calculateArea());
 }
}