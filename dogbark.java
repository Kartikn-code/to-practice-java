public class dogbark{
    public static void main(String[] args){
       dogalarm(24,false);
    }
    public static void dogalarm(int hourofbark, boolean isitbarking){
        if((hourofbark<8)&&( isitbarking==true)){
            System.out.println("You need to Wake up!!");
        }
        else if((hourofbark>22)&&(isitbarking==true)){
            System.out.println("You need to Wake up!!");
        }
        else if((hourofbark<8)&&(isitbarking==false)){
            System.out.println("You are mistaken dog is Barking!!");
        }
        else if((hourofbark>22)&&(isitbarking==false)){
            System.out.println("You are mistaken dog is Barking!!");
        }
        else if(hourofbark<0){
            System.out.println("Invalid input!!");
        }
        else if((hourofbark>8)&&(isitbarking==true)&&(hourofbark<22)){
            System.out.println("Time is above 8 don't worry!!");
        }
    }
}