package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("My app for Users!");
        System.out.println("Develop created 2!");
        System.out.println("Feature created 2!");
        System.out.println("Super Feature created 2!");
        System.out.println("CheckPoint master");

        int a = 8;
        int b = 2;
        int c = add(a, b);
        System.out.println(c);
        int d = multiply(a, b);
        System.out.println(d);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }
}
