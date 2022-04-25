import java.nio.channels.Pipe;

public class Lekcja2 {
    public static void main(String[] args) {
        //Znak charakter
        char zmChar;
        zmChar = 'a'; // tylko jeden znak w apostrofach
        // lub char zmChar = 'B';
        System.out.println(zmChar);
        //String - obiekt w " " dowolna ilość
        String zmString = "Bartek";
        System.out.println(zmString);
        // Boolean true flase
        boolean zmBoolean = true;
        System.out.println(zmBoolean);
        // byte - tylko całkowite
        byte zmByte = Byte.MIN_VALUE;
        byte zmByte2 = Byte.MAX_VALUE;
        // od -128 do 127
        System.out.println("Byte: " + zmByte + " " + zmByte2);
        // short
        short zmShort = Short.MIN_VALUE;
        short zmShort2 = Short.MAX_VALUE;
        System.out.println("Short: " + zmShort + " " + zmShort2);
        // int
        int zmInt = Integer.MIN_VALUE;
        int zmInt2 = Integer.MAX_VALUE;
        System.out.println("Int: " + zmInt + " " + zmInt2);
        // long
        long zmLong = Long.MIN_VALUE;
        long zmLong2 = Long.MAX_VALUE;
        System.out.println("Long: " + zmLong + " " + zmLong2);
        // float na końcu f lub F
        float zmFloat = Float.MIN_VALUE;
        float zmFloat2 = Float.MAX_VALUE;
        float zmFloat3 = 45.76f;
        System.out.println("Float: " + zmFloat + " " + zmFloat2);
        // double
        double zmDouble = Double.MAX_VALUE;
        double zmDouble2 = Double.MIN_VALUE;
        double zmDouble3 = 1238.345623;
        System.out.println("Double: " + zmDouble + " " + zmDouble2);
        // const final na początku
        final int liczba = 256;
    }
}
