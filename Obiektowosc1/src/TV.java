public class TV {
    private int size;
    private String name;
    private boolean onOff;

    //kontruktor

//    public TV(){
//        this.size = size;
//    }
//    to znaczy public nazwa clasy (TV) this.size oznacza paramert size po za konstruktorem i przypisujemy mu wartość size       //

    public TV(int aSize, String name){
        size = aSize;
        this.name = name;
    }

    //getter

    public int getSize() {
        return size;
    }

    public String getName(){
        return name;
    }
    //

    public void setOnOff(boolean a){
        this.onOff = a;
    }

    public void getOnOff(){
        if(onOff){ // onOff ==true
            System.out.println("TV is on");
        } else{
            System.out.println("TV is off");
        }
    }
}
