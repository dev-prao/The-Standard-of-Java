package chap_08;

public class _06_ExceptionEx6 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);// 0으로 나눠서 ArithmeticException 발생
            System.out.println(4);  // 실행되지 않는다.
        } catch (Exception e) {     // ArithmeticException 대신 Exception 사용
            System.out.println(5);  // 실행되지 않는다.
        } // try-catch의 끝
        System.out.println(6);
    }   // main 메서드의 끝
}
