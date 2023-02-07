package chap_05;

public class _13_CharToString {
    public static void main(String[] args) {
        String src = "ABCDE";

        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);  // src의 i번째 문자를 ch에 저장
            System.out.println("src.charAt(" + i + "):" + ch);
        }
    }
}
