public class Obiektowosc1 {
    public static void main(String[] args){
        Obiektowosc1 nazwa = new Obiektowosc1();
        nazwa.newClass();
        System.out.println(nazwa.sqrt(5));
        System.out.println(nazwa.sqrt(6));
        System.out.println(nazwa.sqrt(7));
        System.out.println(nazwa.sqrt(2.5));
        System.out.println(nazwa.sqrt(3.5));
        System.out.println(nazwa.sqrt(4.5));
    }

    public void newClass(){
        System.out.println("Hello");
    }

    public int sqrt(int a){
        return a*a;
    }

    public double sqrt(double a){
        return a*a;
    }
}
