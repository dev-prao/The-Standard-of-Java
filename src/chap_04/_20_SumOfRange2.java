package chap_04;

public class _20_SumOfRange2 {
    public static void main(String[] args) {
        int sum = 0, i = 0;
        // i를 1씩 증가시켜서 sum에 더한다.

        while ((sum += ++i) < 100) {
            System.out.printf("%d - %d%n", i, sum);
        }
    }
}
