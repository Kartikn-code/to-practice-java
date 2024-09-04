import java.util.Scanner;
public class bytes{
    public static void main(String[] args){
        double kilobytes;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value in Kilo-bytes:-");
        kilobytes=sc.nextDouble();
        byteconverter(kilobytes);
    }
    public static void  byteconverter( double kilobytes){
    double mega_bytes=(kilobytes/1024);
    System.out.println("The No.Of megabytes are:- " + mega_bytes);
    }

}