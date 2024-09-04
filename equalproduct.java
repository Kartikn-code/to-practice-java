import java.util.Scanner;
public class equalproduct{
    public static void main(String[] args){
         double num1;
         double num2;
         double num3;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first value:-");
        num1=sc.nextDouble();
        System.out.println("enter the Second value:-");
        num2=sc.nextDouble();
        System.out.println("enter the Third value:-");
        num3=sc.nextDouble();
        equalproduct(num1,num2,num3);
        
        


    }
    public static void equalproduct( double num1,double num2,double num3){
        double LHS=num3;
        double RHS=(num2)*(num1);
        if(LHS==RHS){
            System.out.println("These have equal product!!");
        }
        else{
            System.out.println("They are not equal!!");
        }
    }
}