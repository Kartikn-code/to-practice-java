import java.util.Scanner;
public class primenumber{
    public static void main(String[] args){
        int prime;
        Scanner sc =new Scanner(System.in);
        System.out.println("Hey !! enter your number:- ");
        prime=sc.nextInt();
        for(int i=1;i<=prime;i++){
            primechecker(i);
        }
        


    }

    public static void primechecker(int prime){
            int count=0;

            for ( int j= 2; j < prime;j++){
                if(j%prime==0){
                    count++;
                }}
    
                if(count==0){
                    System.out.println(prime + " The number is prime number");
                }
                else{
                    System.out.println(prime + " The number is not prime ");
                }
            }
}
    

        
       