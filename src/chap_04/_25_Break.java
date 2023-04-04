package chap_04;

public class _25_Break {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (true) {
            if (sum > 5049)
                break;
            ++i;
            sum += i;
        }

        System.out.println("i=" + i);
        System.out.println("sum=" + sum);
    }
}
