package chap_04;

public class _10_RightStar {
    public static void main(String[] args) {
        for(int i=1;i<6;i++) {
            for(int j=0;j<5-i;j++) {
                System.out.print(" ");
            }
            for(int k=0;k<i;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// i : 줄, j : 공백, k : 별

