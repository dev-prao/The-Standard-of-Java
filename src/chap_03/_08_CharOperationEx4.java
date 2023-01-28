package chap_03;

public class _08_CharOperationEx4 {
    public static void main(String[] args) {
        char c = 'a';
        for(int i=0; i<26; i++) {
            System.out.print(c++); // abcde...xyz
        }
        System.out.println();

        c = 'A';
        for(int i=0; i<26; i++) {
            System.out.print(c++); // ABCDE...XYZ
        }
        System.out.println();

        c='0';
        for(int i=0; i<10; i++) {
            System.out.print(c++); // 0123456789
        }
    }
}
