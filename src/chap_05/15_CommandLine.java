package chap_05;

public class _15_CommandLine {
    public static void main(String[] args) {
        if (args != null) {
            System.out.println("매개변수의 개수:" + args.length);
            for (int i = 0; i < args.length; i++) {
                System.out.println("args[" + i + "] = \"" + args[i] + "\"");
            }
        }
    }
}
