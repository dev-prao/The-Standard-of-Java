package chap_04;

import java.util.Scanner;

public class _23_369Game {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 10000 사이의 정수를 입력하세요.");
        String num = sc.next();

        int length = num.length();
        int temp = 0;
        String answer = "";
        int number = Integer.parseInt(num);

        while (length > 0) {
            if (length == 1) {
                temp = number % 10;
                if (temp == 3 || temp == 6 || temp == 9) {
                    answer += "짝";
                }
                length--;
            } else {
                temp = (int) (number / (Math.pow(10, length - 1)));
                // number를 10^length 만큼으로 나눈 것
                if (temp == 3 || temp == 6 || temp == 9) {
                    answer += "짝";
                }
                number = (int) (number - (temp * (Math.pow(10, length - 1))));
                length--;
            }
        }
        System.out.println(answer);
    }
}
