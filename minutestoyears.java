import java.util.Scanner;
public class minutestoyears{
    public static void main(String[] args){
        long minutes;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the minutes");
        minutes=sc.nextLong();
        double years= minutes/525600;
        double remainingdays= minutes-(years*525600);
        double days= remainingdays/1440;
    System.out.println("The number of years is "+ years +"  and The number of days is:- " + days + "!!");
    }
    
}
