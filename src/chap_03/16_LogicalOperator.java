package chap_03;

import java.util.*;

public class _16_LogicalOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = ' ';

        System.out.print("문자를 하나 입력하세요 : ");

        String input = scanner.nextLine();
        ch = input.charAt(0);

        if ('0' <= ch && ch <= '9') {
            System.out.printf("숫자입니다.%n");
        } else if ('A' <= ch && ch <= 'Z') {
            System.out.printf("영문자(대문자)입니다.%n");
        } else if ('a' <= ch && ch <= 'z') {
            System.out.printf("영문자(소문자)입니다.%n");
        } else {
            System.out.println("잘못된 값을 입력하셨습니다. 프로그램을 종료합니다.");
        }
    }
}
