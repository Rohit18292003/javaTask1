import java.util.Scanner;

public class bank extends Thread{
  static   int total_balance;

  void menu(){
      System.out.println("do you continue 1. yes 2. no ");
      Scanner SC = new Scanner(System.in);
      int n = SC.nextInt();

      if(n==1){
          System.out.println("1.deposit  2.withdraw ");
          Scanner sc = new Scanner(System.in);
          int c =sc.nextInt();
          if (c==1){
              deposit();
          }
          else {
              withdraw();
          }
      }
  }
    void deposit(){
        System.out.println("how much money do want to deposit");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        total_balance = total_balance+amount;
        System.out.println("money deposited successfully");
       menu();


    }
    void withdraw(){
        System.out.println("how much money withdraw");
        Scanner sc= new Scanner(System.in);
        int withdraw_amunt = sc.nextInt();
      if(withdraw_amunt>=total_balance){
          System.out.println("insufficient fund ");
          menu();
      }
      else {
          total_balance= total_balance-withdraw_amunt;
          System.out.println("withdrawal successfully ");
          System.out.println("remaining balance "+total_balance);
          menu();
      }


    }
    public void run(){
        System.out.println("Select =");
        System.out.println("1.deposit 2.withdraw ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice==1){
            //deposit
            deposit();

        }
        else {
            //withdraw
            withdraw();
        }

    }

    public static void main(String[] args){
   bank b = new bank();
        b.start();



    }
}
