package chap_04;

import java.util.Scanner;

public class _17_SumOfNumber {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        System.out.print("숫자를 입력하세요 ex. 12345 >> ");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp);

        for(int i=1;i<tmp.length()-1;i++) {
            sum += num % 10;
        }
        System.out.println("입력하신 숫자의 각 자리수 합계는 " + sum + "입니다.");
    }
}
