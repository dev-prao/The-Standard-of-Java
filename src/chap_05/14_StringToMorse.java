package chap_05;

public class _14_StringToMorse {
    public static void main(String[] args) {
        String source = "SOSHELP";
//        1A  2Bb  3C  4D  5E  6F  7G  8H  9I  10J
//       11K  12L 13M 14N 15O 16P 17Q 18R 19S  20T
//       21U  22V 23W 24X 25Y 26Z
        String[] morse = {".-", "-...", "-.-.", "-..", "."
                , "..-.", "--.", "....", "..", ".---"
                , "-.-", ".-..", "--", "-.", "---"
                , ".--.", "--.-", ".-.", "...", "-"
                , "..-", "...-", ".--", "-..-", "-.--"
                , "--.."};
        String result = "";

        for (int i = 0; i < source.length(); i++) {
            result += morse[source.charAt(i) - 'A'];
        }
        System.out.println("source:" + source);
        System.out.println("morse:" + result);
    }
}
