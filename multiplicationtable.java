import java.util.Scanner;
public class multiplicationtable{
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        System.out.println("what multiples u require?");
        int number = sc.nextInt();
        int i=1;
        
        while(i<=12){
            
            int table= number* i;
            System.out.println(number + " x " + i +" = " + table);
            i++;
        }
    }
}
