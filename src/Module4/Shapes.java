package Module4;


import java.util.Scanner;

    abstract class Shapes {
        abstract double area();
    }

    class Circle extends Shapes {
        double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double area() {
            return Math.PI * radius * radius;
        }
    }

    class Rectangle extends Shapes {
        double length;
        double width;

        Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        double area() {
            return length * width;
        }
    }

   class Main {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter the radius of circle: ");
            double radius=sc.nextDouble();

            System.out.println("Enter the length of rectangle: ");
            double length=sc.nextDouble();
            System.out.println("Enter the width of rectangle: ");
            double width=sc.nextDouble();

            Shapes c = new Circle(radius);
            Shapes r = new Rectangle(length,width);

            System.out.println("Area of Circle: " + c.area());
            System.out.println("Area of Rectangle: " + r.area());
        }
    }

