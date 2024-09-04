//import java.util.Scanner;
//public class multiplication{
  //  public static void main(String[] args){
    //    int i;
      //      for ( i=1; i<13;i++){
        //        squarecal(i);
          //  }
    //}
    //public static void squarecal( int i){
        
      //  int x;
           
        //    Scanner sc=new  Scanner(System.in);
          //  System.out.println("Enter the Number need for multiplication:- ");
          // x= sc.nextInt();
         //double sum= x*i;
        //System.out.println(x +"x" + i + "=" + sum);
    //}
//}

public class multiplication {

    public static void main(String[] args) {
        int i;
        System.out.println("The reversed multiplication of the number  8 is:-");
        for(i=12;i>0;i--){
            multiplier(i);
        }
    }
    public static void multiplier(int i){
        int j= 8*i;
        
        System.out.println(j);
    }
}