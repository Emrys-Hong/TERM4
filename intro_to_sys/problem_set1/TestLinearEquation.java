class LinearEquation {
    private double a=0,b=0,c=0,d=0,e=0,f=0;
    LinearEquation(double a1,double b1,double c1,double d1,double e1,double f1){
        a=a1;b=b1;c=c1;d=d1;e=e1;f=f1;
    }
    
    double geta(){return a;}
    double getb(){return b;}
    double getc(){return c;}
    double getd(){return d;}
    double gete(){return e;}
    double getf(){return f;}
    
    boolean isSolvable(){
        if(a*d-b*c==0){return false;}else{return true;}
    }
    float getX(){
        return (float)((e-b*f/d)/(a-b*c/d));
    }
    float getY(){
        return (float)((e-f*a/c)/(b-a*d/c));
    }

}

public class TestLinearEquation {
    public static void main(String[] args) {
      double a = 1.0; double b = 2.0; double c = 3.0; 
      double d = 5.0; double e = 6.0; double f = 7.0;
  
      LinearEquation equation = new LinearEquation(a, b, c, d, e, f);
      if (equation.isSolvable()) {
        System.out.println("x is " +
          equation.getX() + " and y is " + equation.getY());
      }
      else {
        System.out.println("The equation has no solution");
      }
  
      LinearEquation equation2 = new LinearEquation(1.25, 2.0, 2.0, 4.2, 3.0, 6.0);
      if (equation2.isSolvable()) {
          System.out.println("x is " + equation2.getX() + " y is " + equation2.getY());
      }else{System.out.println("The equation has no solution.");}
  
      LinearEquation equation3 = new LinearEquation(1.0, 2.0, 2.0, 4.0, 3.0, 6.0);
      System.out.println(equation3.isSolvable());
    }
  }
  //supposed output x sometime is double...somethimes is float in the HW ps1 description..speechless..so I just cast both getx and gety to float first...
