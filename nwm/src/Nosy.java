public class Nosy extends TV{
    @Override
    public void onTV(boolean b) {
        if(b){
            System.out.println("TV is on");
        } else {
            System.out.println("TV is off");
        }
    }

    @Override
    public String toString() {
        return "Metoda toString klasy Nosy";
    }
}
