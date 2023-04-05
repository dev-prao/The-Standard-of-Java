package chap_07;

final class Singleton {
    private static Singleton s = new Singleton();

    private Singleton() {
        // ...
    }

    public static Singleton getInstance() {
        if (s == null) {
            s = new Singleton();
        }
        return s;
    }
}


class _13_SingletonTest {
    public static void main(String[] args) {
//        Singleton s = new Singleton();    // 에러. Singleton의 접근 제어자가 private임
        Singleton s = Singleton.getInstance();
    }
}