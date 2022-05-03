import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class delta {
    public static void main(String[] args) {
        double x1;
        double x2;
        int a, b, c;
        List<Number> dzielneA = new ArrayList<>();
        List<Number> dzielneC = new ArrayList<>();
        String znak3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj a: ");
        a = scanner.nextInt();
        System.out.println("Podaj b: ");
        b = scanner.nextInt();
        System.out.println("Podaj c: ");
        c = scanner.nextInt();
        System.out.println("Wybierz niewiadomą równania");
        znak3 = scanner.next();
        System.out.println("a: " + a + ", b: " + b + ", c: " + c);
        if ((a == 1) || (a == -1)){
            if (b == 0) {
                System.out.println("Równanie to: f(" + znak3 + ")= " + znak3 + "^2 + " + c);
            } else if((b == 1) || (b == -1)){
                System.out.println("Równanie to: f(" + znak3 + ")= " + znak3 + "^2 + " + znak3 + " + " + c);
            }
            else{
                System.out.println("Równanie to: f(" + znak3 + ")= " + znak3 + "^2 + " + b + znak3 + " + " + c);
            }
        } else if(a == 0){
            if (b == 0) {
                System.out.println("Równanie to: f(" + znak3 + ")= "+ c);
            } else if ((b == 1) || (b == -1)){
                System.out.println("Równanie to: f(" + znak3 + ")= "+ znak3 + " + " + c);
            } else{
                System.out.println("Równanie to: f(" + znak3 + ")= " + b + znak3 + " + " + c);
            }
        }
        else {
            System.out.println("Równanie to: f(" + znak3 + ")= " + a + znak3 + "^2 + " + b + znak3 + " + " + c);
        }
        if (a > 0) {
            int counter = 0;
            for (int i = -a; i <= a; i++) {
                if (i == 0) {
                    System.out.print("");
                } else {
                    if (a % i == 0) {
                        dzielneA.add(i);
                        Number a1 = dzielneA.get(counter);
                        counter++;

                        if (c > 0) {
                            int counter1 = 0;
                            for (int j = -c; j <= c; j++) {
                                if (j == 0) {
                                    System.out.print("");
                                } else {
                                    if (c % j == 0) {
                                        dzielneC.add(j);
                                        Number c1 = dzielneC.get(counter1);
                                        counter1++;
                                        double c1f = c1.doubleValue();
                                        double a1f = a1.doubleValue();
                                        if (a * Math.pow(c1f / a1f, 2) + b * (c1f / a1f) + c == 0) {
                                            x1 = c1f / a1f;
                                            x2 = c / (a * x1);
                                            System.out.println("Roziwiązania to: " + x1 + " " + x2);
                                            System.exit(0);
                                        }
                                    }
                                }
                            }
                        } else if (c < 0) {
                            int counter1 = 0;
                            for (int j = c; j <= -c; j++) {
                                if (j == 0) {
                                    System.out.print("");
                                } else {
                                    if (c % j == 0) {
                                        dzielneC.add(j);
                                        Number c1 = dzielneC.get(counter1);
                                        counter1++;
                                        double c1f = c1.doubleValue();
                                        double a1f = a1.doubleValue();
                                        if (a * Math.pow(c1f / a1f, 2) + b * (c1f / a1f) + c == 0) {
                                            x1 = c1f / a1f;
                                            x2 = c / (a * x1);
                                            System.out.println("Roziwiązania to: " + x1 + " " + x2);
                                            System.exit(0);
                                        }
                                    }
                                }
                            }
                        } else{
                            x1 = 0;
                            x2 = -b / (double) a;
                            System.out.println("Roziwiązania to: " + (int) x1 + " " + x2);
                            System.exit(0);
                        }
                    }
                }
            }
        } else if (a < 0) {
            int counter = 0;
            for (int i = a; i <= Math.abs(a); i++) {
                if (i == 0) {
                    System.out.print("");

                } else {
                    if (a % i == 0) {
                        dzielneC.add(i);
                        Number a1 = dzielneC.get(counter);
                        counter++;

                        if (c > 0) {
                            int counter1 = 0;
                            for (int j = -c; j <= c; j++) {
                                if (j == 0) {
                                    System.out.print("");
                                } else {
                                    if (c % j == 0) {
                                        dzielneC.add(j);
                                        Number c1 = dzielneC.get(counter1);
                                        counter1++;
                                        double c1f = c1.doubleValue();
                                        double a1f = a1.doubleValue();
                                        if (a * Math.pow(c1f / a1f, 2) + b * (c1f / a1f) + c == 0) {
                                            x1 = c1f / a1f;
                                            x2 = c / (a * x1);
                                            System.out.println("Roziwiązania to: " + x1 + " " + x2);
                                            System.exit(0);
                                        }
                                    }
                                }
                            }
                        } else if (c < 0) {
                            int counter1 = 0;
                            for (int j = c; j <= -c; j++) {
                                if (j == 0) {
                                    System.out.print("");
                                } else {
                                    if (c % j == 0) {
                                        dzielneC.add(j);
                                        Number c1 = dzielneC.get(counter1);
                                        System.out.println(c1);
                                        counter1++;
                                        double c1f = c1.doubleValue();
                                        double a1f = a1.doubleValue();
                                        if (a * Math.pow(c1f / a1f, 2) + b * (c1f / a1f) + c == 0) {
                                            x1 = c1f / a1f;
                                            x2 = c / (a * x1);
                                            System.out.println("Roziwiązania to: " + x1 + " " + x2);
                                            System.exit(0);
                                        }
                                    }
                                }
                            }
                        } else {
                            x1 = 0;
                            x2 = -b / (double) a;
                            System.out.println("Roziwiązania to: " + (int) x1 + " " + x2);
                            System.exit(0);
                        }
                    }
                }
            }
        } else {
            if(b == 0){
                System.out.println("Funkcja stała: "+ znak3+ " = " + c);
            } else{
                x1 = -c / (double) b;
                System.out.println("To nie jest funkcja kwadratowa ale rozwiązanie to: " + x1);
            }
            System.exit(0);
        }
        System.out.println("Funckja kwadratowa nie posiada rozwiązań rzeczywistych lub posiada rozwiązania niewymierne");
    }
}