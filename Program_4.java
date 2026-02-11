package Week_2;

import java.util.Scanner;

//4. Create a class BankAccount with: -
//        • A private variable balance
//• An inner class Transaction that can: -
//o Deposit money
//o Withdraw money
//Demonstrate how the inner class accesses private members of the outer class.
class BankAccount
{
    private double balance=1_00_000.00;
    class Inner{
        Scanner sc= new Scanner(System.in);
        void Deposit_money(){
            System.out.println("Enter amount :");
            double deposit_amount = sc.nextDouble();
            double updated_amount = balance + deposit_amount ;
            System.out.println("Updated amount is : " + updated_amount);

        }

        void Withdraw_money(){
            System.out.println("Enter amount :");
            double withdraw_amount = sc.nextDouble();
            if( balance < withdraw_amount)
            {
                System.out.println("Insufficient Amount... ");
            }
            else {
                double updated_amount = balance - withdraw_amount;
                System.out.println("Updated amount is : " + updated_amount);
            }


        }
    }
}
public class Program_4 {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        BankAccount.Inner inner = bankAccount.new Inner();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Deposit money and 2 for withdraw money :");
        int choice = sc.nextInt();
        if (choice == 1)
        {
            inner.Deposit_money();
        }
        else
        {
            inner.Withdraw_money();
        }
    }
}