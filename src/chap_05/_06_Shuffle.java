package chap_05;

public class _06_Shuffle {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i; // 배열을 0~9의 숫자로 초기화한다.
            System.out.print(numArr[i]);
        }
        System.out.println();

        for (int i = 0; i < 100; i++) {
            int n = (int)(Math.random() * 10); // 0~9 중의 한 값을 임의로 얻음.
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp; // numArr[0]과 numArr[n]의 값을 서로 바꾼다.
        }
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i]);
        }
    }
}
