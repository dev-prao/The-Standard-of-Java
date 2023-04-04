package chap_04;

import java.util.Scanner;

public class _17_SumOfNumber {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        System.out.print("숫자를 입력하세요 ex. 12345 >> ");

        Scanner scanner = new Scanner(System.in);
        String  tmp     = scanner.nextLine();
        num = Integer.parseInt(tmp);

        while (num != 0) {
            // num을 10으로 나눈 나머지를 sum에 더함
            sum += num % 10;    // sum = sum + num % 10;
            System.out.printf("sum = %3d num = %d\n", sum, num);

            num /= 10;          // num = num / 10; num을 10으로 나눈 값을 다시 num에 저장
        }

        System.out.println("입력하신 숫자의 각 자리수 합계는 " + sum + "입니다.");
    }
}
