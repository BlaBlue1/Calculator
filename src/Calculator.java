import java.util.Scanner;

public class Calculator {
    public static void main(String [] args) {


        Addittion();
        System.out.println("Addition ended \n");
        System.out.println("************************ \n");
        Multiplication();
        System.out.println("Multiplication ended \n");
        System.out.println("************************ \n");
        Subtraction();
        System.out.println("Subtraction ended \n");


    }
    public static void Addittion(){

        Scanner input = new Scanner(System.in);

        int a, b, sum;
        System.out.println("Enter the first number");
        a = input.nextInt();
        System.out.println("Enter the second number");
        b = input.nextInt();
        sum = a + b;
        System.out.println("The sum of a and b is " + sum);

    }
    public static void Multiplication() {

        Scanner input = new Scanner(System.in);

        int a, b, product;
        System.out.println("Enter the first number");
        a = input.nextInt();
        System.out.println("Enter the second number");
        b = input.nextInt();
        product = a * b;
        System.out.println("The product of a and b is " + product);
    }
    public static void Subtraction() {

        Scanner input = new Scanner(System.in);

        int a, b, difference;
        System.out.println("Enter the first number");
        a = input.nextInt();
        System.out.println("Enter the second number");
        b = input.nextInt();
        difference = a - b;
        System.out.println("The difference of a and b is " + difference);

    }



}
