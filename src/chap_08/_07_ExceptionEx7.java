package chap_08;

public class _07_ExceptionEx7 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0 / 0); // 0으로 나눠서 ArithmeticException 발생
            System.out.println(4); // 실행되지 않는다.
        } catch (ArithmeticException ae) {
            if (ae instanceof ArithmeticException) {
                System.out.println("true");
            }
            System.out.println("ArithmeticException");
        } catch (Exception e) { // ArithmeticException을 제외한 모든 예외 처리
            System.out.println("Exception");
        } // try-catch의 끝
        System.out.println(6);
    }   // main 메서드의 끝
}
