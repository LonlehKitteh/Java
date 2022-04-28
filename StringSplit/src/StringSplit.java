import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[arr.length - 1 - i]);
        }
    }
}
