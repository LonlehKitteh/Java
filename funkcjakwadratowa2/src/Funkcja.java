import java.util.Scanner;

public class Funkcja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        Dodatnia dod = new Dodatnia(a,b,c);
        System.out.println(dod.solver(a,b,c));
    }
}
