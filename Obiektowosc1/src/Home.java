public class Home {
    public static void main(String[] args){
        TV nosy = new TV(45, "nosy123");
        TV sama = new TV(32,"sama2345");

        System.out.println(nosy.getName() +" "+ nosy.getSize());
        // null domyslna wartosc zmiennej
        System.out.println(sama.getName() +" "+ sama.getSize());

        sama.getOnOff();
        sama.setOnOff(true);
        sama.getOnOff();

        Dog rex = new Dog();
        rex.speak();
        rex.setSize(5);
        System.out.println(rex.getSize());
    }
}
