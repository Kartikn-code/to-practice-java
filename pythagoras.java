import java.util.Scanner;
public class pythagoras{
    public static void main(String[] args ){
        double num1;
        double num2;
        double num3;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");
        num1=sc.nextInt();
         System.out.println("Enter the second number");
        num2=sc.nextInt();
         System.out.println("Enter the third number");
        num3=sc.nextInt();
        tripletcalculator(num1,num2,num3);

    }

    public static void tripletcalculator(double num1,double num2,double num3){
        double LHS=(num1)*(num1);
        double RHS=((num2)*(num2)+(num3)*(num3));
        if(LHS== RHS){
            System.out.println("The given numbers are pythagoras Triplets!!");
        }
        else{
            System.out.println("They are not pythagoras Triplets!! ");
        }
    }
}