package chap_07;

public class _15_CastingTest2 {
    public static void main(String[] args) {
        Car        car  = new FireEngine();
        Car        car2 = null;
        FireEngine fe   = null;

        car.drive();
        fe = (FireEngine) car;  // 컴파일은 OK, 실행 시 에러 발생
        fe.drive();
        car2 = fe;
        car2.drive();
    }
}
