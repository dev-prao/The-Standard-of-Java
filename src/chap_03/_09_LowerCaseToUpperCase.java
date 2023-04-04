package chap_03;

public class _09_LowerCaseToUpperCase {
    public static void main(String[] args) {
        char lowerCase = 'a';
        char upperCase = (char)(lowerCase - 32);
        System.out.println(upperCase); // 65 -> 'A'
    }
}
