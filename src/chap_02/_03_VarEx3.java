package chap_02;

public class _03_VarEx3 {
    public static void main(String[] args) {
//        final int MAX_SPEED = 10; // 상수 MAX_SPEED 를 선언 & 초기화
//        변수 (variable) : 하나의 값을 저장하기 위한 공간
//        상수 (constant) : 값을 한번만 저장할 수 있는 공간
//        리터럴 (literal) : 그 자체로 값을 의미하는 것

//        삼각형 / 사각형의 면적을 구하는 공식
        int triangleArea = (20 * 10) / 2;
        int rectangleArea = 20 * 10;
        System.out.println(triangleArea);
        System.out.println(rectangleArea);

        System.out.println("-----------------------");

        final int WIDTH = 20; // 폭
        final int HEIGHT = 10; // 높이

        triangleArea = (WIDTH * HEIGHT) / 2;
        rectangleArea = WIDTH * HEIGHT;
        System.out.println(triangleArea);
        System.out.println(rectangleArea);

        System.out.println("-----------------------");

//        리터럴의 타입과 접미사
//        논리형 (false, true) : 없음
//        정수형 (123, 0b0101, 077, 0xFF, 100L) : L
//        실수형 (3.14, 3.0e8, 1.4f, 0x1.0p-1) : f, d
//        문자형 ('A', '1', '\n') : 없음
//        문자열 ("ABC", "123", "A", "true") : 없음

//        16진수 접두사 : 0x or 0X // 8진수 접두사 : 0
        int octNum = 010; // 8진수 10, 10진수로 8
        int hexNum = 0x10; // 16진수 10, 10진수로 16
        int binNum = 0b10; // 2진수 10, 10진수로 2

        System.out.println(octNum);
        System.out.println(hexNum);
        System.out.println(binNum);

        System.out.println("-----------------------");

        long big = 100_000_000_000L;
        long hex = 0xFFFF_FFFF_FFFFL;

        System.out.println(big);
        System.out.println(hex);

        System.out.println("-----------------------");

        float pi = 3.14f;
        double rate = 1.618d;

        System.out.println(pi);
        System.out.println(rate);

        System.out.println("-----------------------");

        double d_ex1 = 1e1;
        System.out.println(d_ex1);

        double d_ex2 = 1e-3;
        System.out.println(d_ex2);

        float f_ex1 = 3.14e3f;
        System.out.println(f_ex1);

        System.out.println("-----------------------");

        int i = 'A';
        System.out.println(i); // 문자 'A'의 유니코드인 65가 변수 i에 저장된다.
        long l = 123;
        System.out.println(l); // int 보다 long 타입이 범위가 더 넓다.
        double d = 3.14f;
        System.out.println(d); // float 보다 double 타입이 범위가 더 넓다.

        System.out.println("-----------------------");

//        i = 0x123456789; // int 타입의 범위를 넘는 값을 저장
//        System.out.println(i);
//        float f = 3.14; // float 타입보다 double 타입의 범위가 넓다.
//        System.out.println(f);

        char ch = 'J';
        String name = "Java";
        System.out.println(ch);
        System.out.println(name);

        System.out.println("-----------------------");

//        문자열 리터럴은 "" 안에 아무런 문자도 넣지 않는 것을 허용하며, 이를 빈 문자열이라고 한다.
//        그러나 문자 리터럴은 반드시 '' 안에 하나의 문자가 있어야 한다.
//        String str = ""; // 가능
//        char ch1 = ''; // 에러
//        char ch2 = ' '; // 공백 (blank) 로 변수 ch를 초기화
//        원래 String 은 클래스이므로 객체를 생성하는 연산자 new 를 사용해야 하지만 특별히 위와 같은 표현 허용

        String name1 = new String("Java");
        System.out.println(name1);
        String name2 = "Ja" + "va";
        System.out.println(name2);
        String name3 = name2 + 8.0;
        System.out.println(name3);
    }
}
