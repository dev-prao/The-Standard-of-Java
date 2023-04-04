package chap_04;

public class _24_369Game2 {
    public static void main(String[] args) {
        int tmp = 96;

        do {
            if((tmp % 10) % 3 == 0 && tmp % 10 != 0)
                System.out.print("짝");
        } while ((tmp/=10) != 0);
    }
}
