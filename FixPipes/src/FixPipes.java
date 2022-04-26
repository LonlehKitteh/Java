public class FixPipes {
    public static int main(String[] args) {
        int mount = 4;
        return (mount <= 3) ? 1 : (mount > 3 && mount <= 6) ? 2 : (mount > 6 && mount <= 9) ? 3 : 4 ;
    }
}
