package chap_02;

public class _02_VarEx2 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int tmp = 0;

        System.out.println("x : " + x + "     y : " + y);

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x : " + x + "     y : " + y);

//  예약어 (keyword or reserved word)
//  abstract / assert / boolean / break / byte / case / catch / char / class / const / continue
//  default / do / double / else / enum / extends / false / final / finally / float / for
//  if / goto / implements / import / instanceof / int / interface / long / native / new / null
//  package / private / protected / public / return / short / static / strictfp / super / switch / synchronized
//  this / throw / throws / transient / true / try / void / volatile / while
    }
}
