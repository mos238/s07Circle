public class Circle {
    //list all attributes

    // create method constructor
    // create getter and setter methods for each of the attributes
    private String color;
    private double radius;
    private double area;
    private double circumference;

    //==================================================================================
    //create method constructor

    public Circle(double radius, String color){ //*******this is the method constructor
            setRadius(radius);
            setColor(color);
    }
    //==================================================================================
    // create getter and setter

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        // formula to calc area of circle
        area = Math.PI*this.radius*this.radius; // or use getRadius() * getRadius()
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCircumference() {

        circumference = 2*Math.PI*this.radius;
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }
}
