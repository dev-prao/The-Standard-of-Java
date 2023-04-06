package chap_07;

public class _14_CastingTest1 {
    public static void main(String[] args) {
        Car        car = null;
        FireEngine fe  = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;
//        car.water();  // 컴파일 에러. Car 타입의 참조변수로는 water()을 호출할 수 없음.
        fe2 = (FireEngine) car;  // 자손타입 <- 조상타입
        fe2.water();
    }
}

class Car {
    String color;
    int    door;

    void drive() { // 운전
        System.out.println("drive, Brrr~");
    }

    void stop() {  // 정지
        System.out.println("stop!!!");
    }
}

class FireEngine extends Car { // 소방차
    void water() { // 물 뿌리기
        System.out.println("water!!!");
    }
}

class Ambulance extends Car { // 엠뷸런스
    void siren() { // 사이렌
        System.out.println("siren~~~");
    }
}

