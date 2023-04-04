package chap_04;

public class _12_Heart {
    public static void main(String[] args) {
        for(int m=0;m<2;m++) {
            for(int i=0;i<6;i++) {
                System.out.print(" ");
            }
            for(int j=0;j<3;j++) {
                System.out.print("*");
            }
        }
        System.out.println();

        for(int a=0; a<3; a++) {
            for(int b=0;b<5-a;b++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int c=0;c<2*a+3;c++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int d=0;d<4-2*a;d++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int c=0;c<2*a+3;c++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

        for(int a=0; a<9; a++) {
            for(int b=0;b<a+3;b++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int c=0;c<16-a*2;c++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

    }
}

//000000***000000***
//00000*000*0000*000*
//0000*00000*00*00000*
//000*0000000**0000000*
//000*0000000000000000*
//0000*00000000000000*
//00000*000000000000*
//000000*0000000000*
//0000000*00000000*
//00000000*000000*
//000000000*0000*
//0000000000*00*
//00000000000**
