package chap_02;

import java.util.*;

public class _06_ScannerEx {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in); // Scanner 클래스의 객체를 생성
//        String input = scanner.nextLine(); // 입력받은 내용을 input 에 저장
//        int num = Integer.parseInt(input); // 입력받은 내용을 int 타입의 값으로 변환
//        int num1 = scanner.nextInt(); // 정수를 입력받아서 변수 num 에 저장

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("두자리 정수를 하나 입력해주세요. >> ");
            String input = scanner.nextLine();
            int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환
            if (num >= 100 || num < 10) {
                System.out.println("올바르지 않은 숫자를 입력하셨습니다. 다시 입력하세요.");
                continue;
            } else {
                System.out.println("입력 내용 : " + input);
                System.out.printf("num = %d%n", num);
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }

    }
}
