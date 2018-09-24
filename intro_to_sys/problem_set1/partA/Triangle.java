/**
 * Yunyi method
 */
public class TestTriangle {
	public static void main(String[] args) {
		Triangle myTri = new Triangle();
		myTri.setColor("red");
		myTri.setFilled(true);
		System.out.println(myTri);
		System.out.println(myTri.isFilled());

		Triangle myTri2 = new Triangle(2.0, 4.0, 5.5);
		System.out.println(myTri2);
		System.out.println("area : " + myTri2.getArea() + " perimeter: " + myTri2.getPerimeter());
		
	}
}
class Triangle extends GeometricObject {
    double side1=1.0,side2=1.0,side3=1.0;
    Triangle(){};
    Triangle(double side1,double side2,double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public double getArea(){
        double p=(side1+side2+side3)/2;
        double k=p*(p-side1)*(p-side2)*(p-side3);
        return Math.sqrt(k);
    }
    public double getPerimeter(){
        return side1+side2+side3;
    }
    public String toString(){
        return "Triangle: side1="+side1+" side2="+side2+" side3="+side3;
    }



}
class GeometricObject{
    boolean Filled=true;
    String color="yellow";
    GeometricObject(){};
    void setColor(String color){
        this.color=color;
    }
    boolean isFilled(){
        return Filled;
    }
    void setFilled(boolean isfilled){
        Filled=isfilled;
    }

}

/**
 * Pengfei method
 */
public class Triangle extends GeometricObject {
    // data
    double side1 = 1;
    double side2 = 1;
    double side3 = 1;

    // constructor
    Triangle() {

    }
    // must have this constructor also as it will not inherit
    // from the previous class
    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
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
