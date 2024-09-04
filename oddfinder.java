 import java.util.Scanner;
 public class oddfinder{
    public static void main(String[] args){
        double odd;
        int i;
        int min_range;
        int max_range;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("number to be checked!:- ");
        odd=sc.nextDouble();
        isodd( odd);
        System.out.println("enter the min range!! ");
        min_range=sc.nextInt();
        System.out.println("enter the max range!! ");
        max_range=sc.nextInt();


        
        while(min_range<max_range){
            min_range++;
            if( (min_range%2)==0){
                continue;}
            System.out.println(min_range + "is odd number");
             }
       
    }
public static void isodd(double odd){
     if(odd%2!=0){
        System.out.println("the number is odd");
     }
     else{
        System.out.println("The number is even!!");
     }
}



}