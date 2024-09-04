public class switchcase{
    public static void main(String[] args){
        int num=5;
        switch(num){
            case 3:
            System.out.println("value is 3");
            break;
            case 4:
            System.out.println("value is 4");
            break;
            case 5: case 6: case 7:
            System.out.println("value is 5 or 6 or 7");
            break;
            default:
            System.out.println("Unknown value");
            break;
        }
    }
}