public class MyRectangle2D {

    private double x;
    private double y;
    private double height;
    private double width;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public MyRectangle2D() {
        this.height = 1;
        this.width = 1;
        this.x = 0;
        this.y = 0;
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return width*2 + height*2;
    }

    boolean contains(int x1, int y1) {
        if ((x1<=x+width/2 && x1>=x-width/2) && (y1<=y+height/2 && y1>=y-height/2)) {
            return true;
        } else {
            return false;
        }
    }

    boolean contains(MyRectangle2D r) {
        if ( ((r.x-r.width/2 >= x-width/2) && (r.y-r.height/2 <= y-height/2))
                && ((r.x+r.width/2 <= x+width/2) && (r.y+r.height/2 <= y+height/2)) ){
            return true;
        } else {
            return false;
        }
    }

    boolean overlaps(MyRectangle2D r) {
        if (( (r.x+r.width/2>=x-width/2) && (r.x-r.width/2>=x+width/2)) |
                ((r.y+r.height/2>=y-height/2)) && (r.y-r.height/2<=y+height/2)) {
            return true;
        } else {
            return false;
        }
    }
}




    //yy ans:
    public class MyRectangle2D{
        //datafield x,y(center),height,width
        double x=0,y=0,width=1,height=1;
        //constructor (0,0) w 1 h1
        MyRectangle2D(){}
        MyRectangle2D(double x1,double y1,double width1,double height1){
            x=x1;y=y1;width=width1;height=height1;
        }
        //getter,setter:x,y,h,w,
        double getX(){return x;}
        void setX(double x1){x=x1;}
        
        double getY(){return y;}
        void setY(double y1){y=y1;}
        
        double getWidth(){return width;}
        void setWidth(double width1){width=width1;}
        
        double getHeight(){return height;}
        void setHeight(double height1){height=height1;}
       
        //method getArea getPerimeter PointInRec(double x1,double y1),RecInRec(MyRectangle2D r),overlapRec(MyRectangle2D r)
        double getArea(){
            return height*width;
        }
        double getPerimeter(){
            return 2*(height+width);
        }
        boolean PointInRec(double x1,double y1){
            double up,down,left,right;
            up=y+height/2;
            down=y-height/2;
            left=x+width/2;
            right=x-width/2;
            if(x1>=left&&x1<=right&&y1>=down&&y1<=up){
                return true;
            }else{return false;}
        }
        boolean RecInRec(MyRectangle2D r){
            double x1,y1,width1,height1;
            x1=r.getX();
            y1=r.getY();
            width1=r.getWidth();
            height1=r.getHeight();
            double p1x,p1y,p2x,p2y,p3x,p3y,p4x,p4y;
            p1x=x1+width1/2;
            p1y=y1+height1/2;

            p2x=x1-width1/2;
            p2y=y1+height1/2;

            p3x=x1+width1/2;
            p3y=y1-height1/2;

            p4x=x1-width1/2;
            p4y=y1-height1/2;

            if(PointInRec(p1x,p1y)==true&&PointInRec(p2x,p2y)==true&&PointInRec(p3x,p3y)==true&&PointInRec(p4x,p4y)==true){
                return true;
            }else{return false;}
        }
        boolean overlapRec(MyRectangle2D r){
            boolean ans=false;
            

                double x1,y1,width1,height1;
                x1=r.getX();
                y1=r.getY();
                width1=r.getWidth();
                height1=r.getHeight();
                double p1x,p1y,p2x,p2y,p3x,p3y,p4x,p4y;
                p1x=x1+width1/2;
                p1y=y1+height1/2;

                p2x=x1-width1/2;
                p2y=y1+height1/2;

                p3x=x1+width1/2;
                p3y=y1-height1/2;

                p4x=x1-width1/2;
                p4y=y1-height1/2;
                
                
                if(PointInRec(p1x,p1y)==true||PointInRec(p2x,p2y)==true||PointInRec(p3x,p3y)==true||PointInRec(p4x,p4y)==true){
                    if(PointInRec(p1x,p1y)==true&&PointInRec(p2x,p2y)==true&&PointInRec(p3x,p3y)==true&&PointInRec(p4x,p4y)==true){ans=false;}
                    else{ans=true;}

                }
            return ans;
        }
    }
