import java.util.Scanner;
public class weight{
    public static void main(String[] args){
        double kilograms;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Weight in KG:-");
        kilograms= sc.nextDouble();
        ToWeight(kilograms);

    }
public static void ToWeight(double kilograms){
   
    double weight_gms=(kilograms*1000);
   
    double weight_mgs=(weight_gms*1000);
  System.out.println("The weight in grams is:- " + weight_gms);
    System.out.println("The weight in milligrams is:- " + weight_mgs);

}
}



