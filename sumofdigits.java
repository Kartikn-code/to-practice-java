import java.util.Scanner;
public class sumofdigits{
    public static void main(String[] args){
        int number;
        int rem;
        int sum=0;
        Scanner ab=new Scanner(System.in);
        System.out.print("Number please!!");
        number=ab.nextInt();
        do{
            rem=number%10;
            sum= sum+rem;
            number=number/10;
        }
        while(number>0 );
    System.out.println("The sum is " + sum );
    }
        
    }

    
        
        
   
