package javabasava.operatirs;

import java.util.Scanner;

public class assign2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a");
        System.out.println("Enter the numer b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("sum=" + (a += b));
        System.out.println("sub=" + (a -= b));
        System.out.println("mul=" + (a *= b));
        System.out.println("div=" + (a /= b));
        System.out.println("mod=" + (a %= b));
    }
}
    

