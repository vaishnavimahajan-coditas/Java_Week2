package Week_2;


import java.util.InputMismatchException;
import java.util.Scanner;


class InvalidAgeException extends RuntimeException
{
    public InvalidAgeException(String str)
    {
        super(str);
    }

}
public class Program_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age : ");
        try {
            int age = sc.nextInt();
            if (age < 18) {
                throw new InvalidAgeException("Less than 18 is not allowed...");
            }

        } catch (InvalidAgeException exception) {
            System.out.println("Exception : "+exception.getMessage());
        }


    }

}



























//public class Program_2 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter age : ");
//        try {
//            int age = sc.nextInt();
//            if (age < 18) {
//                throw new InputMismatchException("Less than 18 is not allowed...");
//            }
//
//        } catch (InputMismatchException exception) {
//            System.out.println("Exception :"+exception.getMessage());
//        }


//    }
//
//}
