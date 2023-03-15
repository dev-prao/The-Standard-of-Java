package chap_04;

import java.util.Scanner;

public class _19_SumOfRange {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        System.out.print("숫자를 선택하세요 >> ");
        Scanner scanner = new Scanner(System.in);
        String  tmp     = scanner.nextLine();
        num = Integer.parseInt(tmp);

        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.println("1부터 " + num + "까지의 합계는 " + sum + "입니다.");
    }
}
