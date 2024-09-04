public class numberstowords{
    public static void main(String[] args){
        int number;
        numbertoword(4);
        numbertoword(5);
        numbertoword(6);
        numbertoword(7);
        numbertoword(8);
        numbertoword(9);
        numbertoword(10);
        numbertoword(11);
        numbertoword(12);
        numbertoword(13);

    }

public static void numbertoword(int number){
    switch (number) {
        case 1:
        System.out.println("One");
            break;
            case 2:
        System.out.println("Two");
            break;
            case 3:
        System.out.println("Three");
            break;
            case 4:
        System.out.println("Four");
            break;
            case 5:
        System.out.println("five");
            break;
            case 6:
        System.out.println("Six");
            break;
            case 7:
        System.out.println("Seven");
            break;
            case 8:
        System.out.println("Eight");
            break;
            case 9:
        System.out.println("Nine");
            break;
            
    
        default:
        System.out.println("More than 10!!");

            break;
    } 
        
    


}
}