package chap_05;

public class _20_Matrix {
    public static void main(String[] args) {
        int[][] m1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] m2 = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        final int ROW = m1.length;      // m1의 행 길이 = 2
        final int COL = m2[0].length;   // m2의 열 길이 = 2
        final int M2_ROW = m2.length;   // m2의 행 길이 = 3

        int[][] m3 = new int[ROW][COL];


        // 행렬곱 m1 x m2의 결과를 m3에 저장
        for (int i = 0; i < ROW; i++)               // 0~1
            for (int j = 0; j < COL; j++)           // 0~1
                for (int k = 0; k < M2_ROW; k++)    // 0~2
                    m3[i][j] += m1[i][k] * m2[k][j];

//      00 = 00 x 00 + 01 x 10 + 02 x 20 = 1  +  6  +  15  =  22
//      01 = 00 x 01 + 01 x 11 + 02 x 21 = 2  +  8  +  18  =  28
//      10 = 10 x 00 + 11 x 10 + 12 x 21 = 4  + 15  +  30  =  49
//      11 = 10 x 01 + 11 x 11 + 12 x 21 = 8  + 20  +  36  =  64

        // 행렬 m3 출력
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                System.out.printf("%3d ", m3[i][j]);
            }
            System.out.println();
        }
    }
}
