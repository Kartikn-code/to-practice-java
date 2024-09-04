 import java.util.Scanner;
 public class palindrome{
    public static void main(String[] args) {
        int number;
        int temp;
        int sum=0;
        int rem;
        Scanner sc= new Scanner(System.in);
        System.out.print("Number Bhaiii!!! ");
        number=sc.nextInt();

        
            temp=number;
            rem=0;
            sum=number%10;
            rem=rem*10+sum;
            number=(number/10);
            if(temp==rem){
                System.out.println("the number is palindrome");
            }
            else{
                System.out.println("The number is not a palindrome number !!");
            }
        
        while(number>0);
            
        }

 }