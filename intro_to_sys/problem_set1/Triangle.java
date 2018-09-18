public class Triangle extends GeometricObject {
    // data
    double side1 = 1;
    double side2 = 1;
    double side3 = 1;

    // constructor
    Triangle() {

    }

    // get Area
    double getArea() {
        double s = (side1+side2+side3)/2;
        double area = Math.pow(s*(s-side1)*(s-side2)*(s-side3), 0.5);
        return area;
    }

    double getPerimeter() {
        return side1+side2+side3;
    }

    public String toString() {
        String rep = "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
        return rep;
    }
}
