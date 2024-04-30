import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        helloWorld();
        vars();
    }

    public static void helloWorld() {
        System.out.println("Hello, World!");
    }

    public static void vars() {
        // primitive
        // 8 types, stores data, can hold only one value, less memory, faster
        System.out.println("Program do funkcji kwadratowej");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj a: ");
        String input1 = scanner.nextLine();
        double a = Double.parseDouble(input1);

        System.out.println("Podaj b: ");
        String input2 = scanner.nextLine();
        double b = Double.parseDouble(input2);

        System.out.println("Podaj c: ");
        String input3 = scanner.nextLine();
        double c = Double.parseDouble(input3);

        double delta = Math.pow(b, 2) - 4 * a * c;
        if(delta < 0) System.out.println("Rownanie kwadratowe nie ma rozwiazan!");
        else if(delta == 0) {
            double x1 = (-1 * b) / 2 * a;

            System.out.println("Rozwiazanie to: " + x1);
        }
        else {
            double x1 = (-1 * b - Math.sqrt(delta)) / 2 * a;
            double x2 = (-1 * b + Math.sqrt(delta)) / 2 * a;

            System.out.println("Rozwiazania to: " + x1 + " lub " + x2);
        }

        scanner.close();
    }
}