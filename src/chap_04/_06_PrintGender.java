package chap_04;

import java.util.Scanner;

public class _06_PrintGender {
    public static void main(String[] args) {
        System.out.print("당신의 주민등록번호를 입력하세요. ex) 230129-1234567 >> ");

        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();

        char gender = regNo.charAt(7); // 입력받은 번호의 8번째 문자를 gender에 저장

        if(regNo.charAt(6) == '-') {
            switch(gender) {
                case '1' : case '3' :
                    System.out.println("당신의 성별은 남성입니다.");
                    break;

                case '2' : case '4' :
                    System.out.println("당신의 성별은 여성입니다.");
                    break;
                default:
                    System.out.println("유효하지 않은 주민등록번호입니다.");
            }
        } else {
            System.out.println("유효하지 않은 주민등록번호입니다.");
        }
    }
}
