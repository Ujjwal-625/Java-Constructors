public class Circle {
    double r;
    Circle(){
        r=5.6;
    }
    Circle(double r){
        this.r=r;
    }

    void Area(){
        double area=Math.PI*Math.pow(r,2);
        System.out.println("Area of the circle with radius "+r +" is "+area);
    }
    public static void main(String[] args) {
        Circle c=new Circle();// default parameter

        Circle c1=new Circle(9.8);

        c.Area();
        c1.Area();
    }
}
