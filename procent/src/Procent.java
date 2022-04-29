import java.util.Scanner;

public class Procent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        for (int i = 0; i <= 5; i++) {
            double payment = amount * 0.1;
            amount -= Math.ceil(payment);
        }
        System.out.println(amount);
    }
}
