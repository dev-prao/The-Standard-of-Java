package chap_08;

public class _13_ExceptionEx13 {
    public static void main(String[] args) {
        method1();  // 같은 클래스 내의 static 멤버이므로 객체 생성없이 직접 호출 가능
    }

    static void method1() {
        try {
            throw new Exception();
        } catch(Exception e) {
            System.out.println("method1 메서드에서 예외가 처리되었습니다.");
            e.printStackTrace();
        }
    }
}
