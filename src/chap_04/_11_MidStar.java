package chap_04;

public class _11_MidStar {
    public static void main(String[] args) {
        int m = 10;
        for(int i=1;i<=m;i++) {
            for (int j=0;j<m-i;j++) {
                System.out.print(" ");
            }
            for (int k=0;k<2*i-1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// i 줄, j 공백, k 별
//00000*00000
//0000***0000
//000*****000
//00*******00
//0*********0