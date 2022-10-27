public class Dodatnia {
    double a1,b2,c3;
    double x1, x2;
    double delta;

    public Dodatnia(double a,double b,double c){
        this.a1 = a;
        this.b2 = b;
        this.c3 = c;
    }
    public String solver(double a1, double b2, double c3){
        delta = (b2 * b2) - (4 * a1 * c3);
        x1 = (-b2 - Math.sqrt(delta)) / (2*a1);
        x2 = (-b2 + Math.sqrt(delta)) / (2*a1);
        String x1S = String.valueOf(x1);
        String x2S = String.valueOf(x2);
        if (x1S.equals("NaN") && (x2S.equals("NaN"))) {
            System.out.println("Nie ma pierwiastków rzeczywistych");
            System.exit(0);
        } else if(x1 == x2){
            System.out.println(x1);
                System.exit(0);
        } else if(a1 == 0){
            x1 = -(c3/b2);
            System.out.println(x1);
            System.exit(0);
        }
        return x1+" "+x2;
    }
}
