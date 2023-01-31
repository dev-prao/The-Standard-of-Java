package chap_04;

import java.util.Scanner;

public class _08_Switch_Overlapped {
    public static void main(String[] args) {
        System.out.print("당신의 주민등록번호를 입력하세요. ex) 123456-1234567 >> ");

        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();
        char gender = regNo.charAt(7);

        if(regNo.charAt(6) == '-' && regNo.length() == 14) {
            switch (gender) {
                case '1': case '3':
                    switch (gender) {
                        case '1':
                            System.out.println("2000년 이전에 태어난 남성");
                            break;
                        case '3':
                            System.out.println("2000년 이후에 태어난 남성");
                    }
                    break;

                case '2': case '4':
                    switch (gender) {
                        case '2':
                            System.out.println("2000년 이전에 태어난 여성");
                            break;
                        case '4':
                            System.out.println("2000년 이후에 태어난 여성");
                    }
                    break;
                default:
                    System.out.println("유효하지 않은 주민등록번호입니다.");
            }
        } else {
            System.out.println("유효하지 않은 주민등록번호입니다.");
        }
    }
}
