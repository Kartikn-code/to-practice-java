import java.util.Scanner;
public class noofdays {
    public static void main (String[] args){
        dayscalculator(12,2015);
        
    }
public static void dayscalculator(int month,int year){
    month=0;
    
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the month:-");
         month=sc.nextInt();
        System.out.println("Enter the year:-");
         year=sc.nextInt();
   switch (month) {
    case 1:
        System.out.println("It has 31 days");
        break;
    case 2:
        System.out.println("It has 28 days");
        break;
    case 3:
        System.out.println("It has 31 days");
        break;
    case 4:
        System.out.println("It has 30 days");
        break;
    case 5:
        System.out.println("It has 31 days");
        break;
    case 6:
        System.out.println("It has 30 days");
        break;
    case 7:
        System.out.println("It has 31 days");
        break;
    case 8:
        System.out.println("It has 31 days");
        break;
    case 9:
        System.out.println("It has 30 days");
        break;
    case 10:
        System.out.println("It has 31 days");
        break;
    case 11:
        System.out.println("It has 30 days");
        break;
    case 12:
        System.out.println("It has 31 days");
        break;
   
    default:
        break;
   }


} 
}
