package chap_04;

import java.util.Scanner;

public class _22_DoWhileEx {
    public static void main(String[] args) {
        int input = 0, answer = 0;

        answer = (int)(Math.random() * 100) + 1; // 1 ~ 100 사이의 임의의 수
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("1 과 100 사이의 임의의 정수를 입력하세요 >> ");
            input = scanner.nextInt();

            if (input > answer) {
                System.out.println("down");
            } else if (input < answer) {
                System.out.println("up");
            }
        } while (input != answer);
        System.out.print("짝짝짝! 정답입니다!");

    }
}




// 내가 만든 오답
/*    int answer = (int)(Math.random() * 100);
        System.out.print("1~100 사이의 숫자 중 정답은 뭘까요? >> ");
                Scanner scanner = new Scanner(System.in);
                String tmp = scanner.nextLine();
                int user = Integer.parseInt(tmp);


                do {
                System.out.println("오답입니다");
                scanner = new Scanner(System.in);
                } while (user != answer);*/
