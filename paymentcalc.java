public class paymentcalc{
    public void  payment(String cust_name){
      shop(1000, 0240);
      recharge(500, 500);
       // if(cash<=accbalance){
         //    double rem_balance=accbalance-cash;
           // accbalance=rem_balance;
            //System.out.println("Thank u for shopping have a wonderful day !! your remaining balance is :" + rem_balance);
        //}

                                 }
public void shop(double acc_balance,  double shoppingbalance){
    double rem_balance;
    if(shoppingbalance<=acc_balance){
        rem_balance= acc_balance- shoppingbalance;
        acc_balance=rem_balance;
        System.out.print("Thanks for shopping your balance is :- " + rem_balance );
    } 
   
}
public void recharge(double acc_balance, double recharge_amt){
    acc_balance =acc_balance + recharge_amt;
    System.out.print("Thank u for your recharge , your updated account balance is :-" + acc_balance);
}
}
//public static void even()
  // Scanner sc = new Scanner(System.in);
   //int num1= sc.nextInt();
   //if (num1% 2==0){
    //System.err.println("the number "+ num1+ "is even");
   //}

                
               