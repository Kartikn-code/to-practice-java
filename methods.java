import java.util.Scanner;

public class methods{
    public static void main(String[] args){
        String Student_name; 
        double mark;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the Student name:-");
        Student_name=sc.nextLine();
        System.out.println("Enter the Student mark:-");
         mark=sc.nextDouble();
        Student_mark(mark);
         

    }


public static void Student_mark(double mark){
    
    char division;
    if(mark>=80){
       division ='A';
       System.out.println(division);
    }
    else if((mark>=60)&&(mark<=80)){
        division='B';
       System.out.println(division);
    }
    else if((mark>=40)&&(mark<=60)){
        division='C';
        System.out.println(division);
        
    }
    else if(mark<=40){
        division='D';
        System.out.println(division);
        
    }
    
}
} 
   



