import java.util.Scanner;
public class area{
    public static void main(String[] args){
        double radius;
        double x,y;
        shapearea(50);
        shapearea(20, 30);
    }
public static void shapearea(double radius){
    double areaofcircle= 3.14*(radius*radius);
    if(radius<0){
        System.out.println("The given radius is invalid!!");
    }
    else{
        System.out.println("The area of the circle is:- " + areaofcircle + " !!");
    }

}
public static void shapearea(double x,double y){
    double rectarea= x*y;
    if(x <0){
        System.out.println("The given inputs are invalid!!");
    }
    else if(y <0){
        System.out.println("The given inputs are invalid!!");
    }
    else{
        System.out.println("the area of rectangle is:- " + rectarea + " !!");
    }
}
}
