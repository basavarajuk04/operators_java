package javabasava.operatirs;

public class unary1 {
    public static void main(String[] args) {
        boolean cond = true;

        int a = 20;
        int b = 2;
        System.out.println("Cond is: " + cond);
        System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);

        System.out.println("Now cond is: " + !cond);

        System.out.println("!(a < b) = " + !(a < b));
        System.out.println("!(a > b) = " + !(a > b));

    }
}
