package chap_04;

import java.util.Scanner;

public class _07_PrintGrade {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.print("당신의 점수를 입력하세요 >> ");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        score = Integer.parseInt(tmp);

        if(score >= 0 && score <= 100) {
            switch (score/10) {
                case 10: case 9:
                    grade = 'A';
                    break;

                case 8:
                    grade = 'B';
                    break;

                case 7:
                    grade = 'C';
                    break;

                default:
                    grade = 'F';
            }
            System.out.println("당신의 학점은 " + grade + "입니다.");
        } else {
            System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
        }
    }
}
