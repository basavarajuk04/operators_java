package javabasava.operatirs;
import java.util.Scanner;

public class relational2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the num2: ");
        int num2 = sc.nextInt();

        System.out.println("Relational Operators are: ");
        System.out.println(num1 + " < " + num2 + " : " + (num1 < num2));
        System.out.println(num1 + " <= " + num2 + " : " + (num1 <= num2));
        System.out.println(num1 + " > " + num2 + " : " + (num1 > num2));
        System.out.println(num1 + " >= " + num2 + " : " + (num1 >= num2));
        System.out.println(num1 + " != " + num2 + " : " + (num1 != num2));
        System.out.println(num1 + " == " + num2 + " : " + (num1 == num2));
    }
}

