public class Main {
    public static void main(String[] args) {
        //
        Circle Circle1 = new Circle(1.0,"Red");
        Circle Circle2 = new Circle(4.5, "Green");
        Circle Circle3 = new Circle(3.2, "Blue");

        System.out.println("===Circle Calculator Program===");

        System.out.println("Circle 1");
        System.out.println( "Radius :"          + Circle1.getRadius());
        System.out.println("Color :"            + Circle1.getColor());
        System.out.println("Area of : "         + Circle1.getArea());
        System.out.println("Circumference of: " + Circle1.getCircumference());
        System.out.println("*************************************************");
        System.out.println("Circle 2");
        System.out.println( "Radius :"          + Circle2.getRadius());
        System.out.println("Color :"            + Circle2.getColor());
        System.out.println("Area of : "         + Circle2.getArea());
        System.out.println("Circumference of: " + Circle2.getCircumference());
        System.out.println("**************************************************");
        System.out.println("Circle 3");
        System.out.println( "Radius :"          + Circle3.getRadius());
        System.out.println("Color :"            + Circle3.getColor());
        System.out.println("Area of : "         + Circle3.getArea());
        System.out.println("Circumference of: " + Circle3.getCircumference());

    }
}