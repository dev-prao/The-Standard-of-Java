package chap_03;

public class _12_MathRound {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = Math.round(pi*1000)/1000.0;

        System.out.println(shortPi); // 3.142
    }
}
