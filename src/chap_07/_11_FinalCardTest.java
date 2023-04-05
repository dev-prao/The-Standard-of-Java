package chap_07;

class Card1 {
    final  int    NUMBER;               // 상수지만 선언과 함께 초기화 하지 않고
    final  String KIND;                 // 생성자에서 단 한번만 초기화할 수 있다
    static int    width  = 100;
    static int    height = 250;

    Card1(String kind, int num) {
        KIND   = kind;                  // 매개변수로 넘겨받은 값응로
        NUMBER = num;                   // KIND와 NUMBER를 초기화
    }

    Card1() {
        this("HEART", 1);
    }

    public String toString() {
        return KIND + " " + NUMBER;
    }
}

public class _11_FinalCardTest {
    public static void main(String[] args) {
        Card1 c = new Card1("HEART", 10);
//        c.NUMBER = 5;         // 에러 발생. final로 선언했기 때문에 변경 불가
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);  // System.out.println(c.toString());
    }
}