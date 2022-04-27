public class tablice {
    public static void main(String[] args){
        int[] tab = new int[5];
        tab[0] = 6;
        tab[1] = 8;
        tab[2] = 1;
        tab[3] = 2;
        tab[4] = 4;
        System.out.println(tab[0]);
        int i =0;
        for(; i<tab.length;){
            System.out.println("Element tablicy: " + tab[i]);
            i++;
        }
        System.out.println("-----------------------------------------");
        for (int j : tab) {
            System.out.println("Element tablicy: " + j);
        }
    }
}
