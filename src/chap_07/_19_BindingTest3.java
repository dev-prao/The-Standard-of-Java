package chap_07;

public class _19_BindingTest3 {
    public static void main(String[] args) {
        Parentx p = new Childx();
        Childx  c = new Childx();

        System.out.println("p.x = " + p.x);
        p.method();
        System.out.println();
        System.out.println("c.x = " + c.x);
        c.method();
    }


}

class Parentx {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}

class Childx extends Parentx {
    int x = 200;

    void method() {
        System.out.println("x = " + x);
        System.out.println("super.x = " + super.x);
        System.out.println("this.x = " + this.x);
    }
}
