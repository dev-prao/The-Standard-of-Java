package chap_04;

import java.util.Scanner;

public class _05_RockPaperScissors {
    public static void main(String[] args) {
        System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요 >> ");

        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();
        int com = (int) (Math.random() * 3) + 1; // Math.random -> 0 ~ 1 구간에서 부동소수점의 난수 생성

        if(user >= 1 && user <= 3 && com >= 1 && com <= 3) {
            System.out.println("당신은 " + user + "입니다.");
            System.out.println("컴퓨터는 " + com + "입니다.");

            switch (user-com) {
                case 2 : case -1 :
                    System.out.println("당신은 패배했습니다.");
                    break;

                case 1 : case -2 :
                    System.out.println("당신은 승리했습니다.");
                    break;

                case 0 :
                    System.out.println("당신은 비기셨습니다.");
                    break;
                }
            } else {
            System.out.println("오류가 발생했습니다. 게임을 종료합니다.");
        }
    }
}
