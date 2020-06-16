import java.util.Scanner;

public class Calculation {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1=sc.nextInt();
        System.out.println("Enter another number: ");
        int num2=sc.nextInt();

        System.out.println("Sum : " +(num1+num2));
        System.out.println("Product : " + (num1*num2));
        System.out.println("This program will find the square of a number. \nPlease input a number .");
        int num3=sc.nextInt();
        System.out.println("Output:"+(num3*num3));
        System.out.println("Try another number");
        int num5=sc.nextInt();
        System.out.println("Output:"+(num5*num5));
        sc.nextLine();

        System.out.println("This program will get two different string input from user and print them in the same line.");

        System.out.println("First input string");
        String inputString = sc.nextLine();
        System.out.println("Second input string");
        String inputPart = sc.nextLine();
        System.out.println(inputString+ " "+inputPart);









    }
}
