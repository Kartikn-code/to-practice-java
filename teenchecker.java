import java.util.Scanner;
public class teenchecker{
    public static void main(String[] args){
        int age1,age2,age3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  first age!") ;
        age1=sc.nextInt();
       
        System.out.println("Enter the  Second age!");
        age2=sc.nextInt();
        
        System.out.println("Enter the  Third age!");
        age3=sc.nextInt();
        
        teenchecker(age1,age2,age3);

    }
    public static void teenchecker(int age1, int age2,int age3){
        if(age1>18||age2>18||age3>=18){
            System.out.println("False,They are not Teenagers!!");
        }
        else{
            System.out.println("True, They are Teenagers!!");
        }
    }
}