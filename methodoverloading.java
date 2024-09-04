public class methodoverloading{
    public static void main(String[] args) {

    double length;
    double breadth;
    double height;
    
   
    

        squarearea(20);
        rectanglearea(20,30);
        trianglearea(30,40);
        trapeziumarea(40, 50);
        
 
    }

public static void squarearea(double length){
    double sq_area=(length)*(length);
System.out.println("The area of the square is:-" + sq_area);

}
public static void rectanglearea(double length,double breadth){
     double rect_area=length*breadth;
System.out.println("The area of the rectangle is:-" + rect_area);
}
public static void trianglearea(double breadth,double height){
    double tri_area=(height*breadth)/2;
System.out.println("The area of the triangle is:-" + tri_area);
}
public static void  trapeziumarea(double length, double breadth){
    double trapeziumarea=0.5*(length*breadth);
    System.out.println("The trapezium area is:-" + trapeziumarea);
}
}