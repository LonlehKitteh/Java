import java.util.EventListener;

public class Main {
    public static void main(String[] args) {
        int a = 4, b = 5;
        // != > < >= <= && ||
        // and jest pierwszy w kolejności wykonywania
        boolean log = 5 >= 7 && 6 < 1;
        System.out.println(log);
        System.out.println("---------------------------------------------");
        int wiek = 16;
        if (wiek >= 18) {
            System.out.println("osoba pełnoletnia");
        }
        else if(wiek >= 16){
            System.out.println("osoba niepełnoletnia");
        }
        else{
            System.out.println("nie możesz nic!");
        }
        String imie = wiek >= 18 ? "Krzysiek" : "Krzysiuś";
    System.out.println(imie);
    }
}
