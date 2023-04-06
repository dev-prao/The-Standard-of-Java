package chap_07;

public class _18_BindingTest2 {
    public static void main(String[] args) {
        Parent0 p = new Child0();
        Child0  c = new Child0();

        System.out.println("p.x = " + p.x);
        p.method();

        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class Parent0 {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}

class Child0 extends Parent0 {
}