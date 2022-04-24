import java.util.Scanner;

public class Lekcja1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.print("Podaj swoje imię: ");
        name = scanner.next();
        //System.out.print("Hello " + name);
        System.out.printf("Hello %s", name);
    }
}
// .next() metoda wczytuje dane do spacji
// .nextLine() metoda wczytuje całą linię
// printf formatowalny ciąg znaków %s string %d decimal %f float