package chap_03;

public class _13_Modulus {
    public static void main(String[] args) {
        for (int i=1; i<10000; i=i*3+1) {
            if(i%2 == 0) {
                System.out.printf("%d는 짝수입니다.%n", i);
            } else {
                System.out.printf("%d는 홀수입니다.%n", i);
            }
        }
    }
}
