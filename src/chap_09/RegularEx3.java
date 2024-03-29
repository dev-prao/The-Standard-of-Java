package chap_09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx3 {
    public static void main(String[] args) {
        String source = "HP:010-1234-5678, HOME:051-123-4567";
        String pattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(source);

        int i = 0;
        while (m.find()) {
            System.out.println(++i + ": " + m.group() + " -> " + m.group(1) + ", " + m.group(2) + ", " + m.group(3));
        }
    }
}
