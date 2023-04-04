package chap_02;

public class _04_PrintfEx1 {
    public static void main(String[] args) {
        int age = 14;
        System.out.printf("age:%d%n", age);
//        %b : 불리언(boolean) 형식 / %d : 10진(decimal) 정수의 형식 / %o : 8진(octal) 정수의 형식 /
//        %x, %X : 16진(hexa-decimal) 정수의 형식 / %f : 부동 소수점(floating-point)의 형식 /
//        %e, %E : 지수(exponent) 표현식의 형식 / %c : 문자(character) / %s : 문자열(string)

        System.out.println("-----------------------");

        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000_000L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        int octNum = 010; // 8진수 10, 10진수 8
        int hexNum = 0x10; // 16진수 10, 10진수 16
        int binNum = 0b10; // 2진수 10, 10진수 2

        System.out.printf("b=%d%n", b);
        System.out.printf("s=%d%n", s);
        System.out.printf("c=%c, %d %n", c, (int)c);
        System.out.printf("finger=[%5d]%n", finger);
        System.out.printf("finger=[%-5d] %n", finger);
        System.out.printf("finger=[%05d] %n", finger);
        System.out.printf("big=%d%n", big);
        System.out.printf("hex=%#x%n", hex); // '#'은 접두사(16진수 0x, 8진수 0)
        System.out.printf("octNum=%o, %d%n", octNum, octNum);
        System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
        System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
        // 10진수를 2진수로 출력해주는 지시자 존재 X, 정수를 2진 문자열로 변환해주는 Integer.toBinaryString(int i)를 사용
    }
}
