package Week_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        try{
            System.out.println("Enter 1st number :");
            int first = sc.nextInt();
            System.out.println("Enter 2nd number :");
            int second = sc.nextInt();
            int result = first/second;
            System.out.println("Division result is : " + result);
        }
        catch (ArithmeticException arithmeticException)
        {
            System.out.println("An expection occur: "+ arithmeticException);
        }
        catch (InputMismatchException inputMismatchException)
        {
            System.out.println("Expection occur : "+ inputMismatchException);
        }
        finally
        {
            System.out.println("Program execution completed...");
        }


    }

}

