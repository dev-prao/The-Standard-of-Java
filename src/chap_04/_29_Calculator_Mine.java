package chap_04;

import java.util.Scanner;

public class _29_Calculator_Mine { // 틀렸지만 열심히 만들어서 남겨둠
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int menu = 0;
        int number = 0;

        Loop1 : while (true) {
                System.out.println("(1) square");
                System.out.println("(2) square root");
                System.out.println("(3) log");
                System.out.print("원하는 메뉴(1~3)를 선택하세요. (종료:0) >>");
                String tmp1 = sc1.nextLine();
                System.out.print("계산할 값을 입력하세요. (계산 종료:0. 전체 종료:99) >> ");
                String tmp2 = sc2.nextLine();
                menu = Integer.parseInt(tmp1);

                while (!(menu>=1 && menu<=3)) {
                    if (menu == 0)
                        break;
                }

                while (!(number > 0 && number < 99 )) {
                    if (number == 0)
                        break;
                    if (number == 99)
                        break Loop1;
                }

                switch (number) {
                    case 1: System.out.printf("result=%d", number*number);
                    case 2: System.out.printf("result=%d", Math.sqrt(number));
                    case 3: System.out.printf("result=%d", Math.log(number));
                }
            System.out.println();
        }
    }
}
