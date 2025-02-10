import java.util.Scanner;

public class Q5{
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int num1 = Scanner.nextInt(); 

        System.out.println("Enter Second Number: ");
        int num2 = Scanner.nextInt(); 

        int product = num1 * num2 ; 

        System.out.println("The Product of "+ num1 + " and " + num2 + " is "+ product);


    }
}
