package twoDarray;

import java.util.Scanner;

public class SpiralOrderMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The spiral matrix is : ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int [][] number = new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                number[i][j] = scanner.nextInt();
            }
        }
        int rowStart = 0;
        int rowEnd = n-1;
        int columnStart = 0;
        int columnEnd = m-1;


        //to print spiral matrix
        while (rowStart <= rowEnd && columnStart <= columnEnd){

            //1
            for(int col=columnStart; col<=columnEnd; col++) {
                System.out.print(number[rowStart][col] + " ");
            }
            rowStart++;


            //2
            for(int row=rowStart; row<=rowEnd; row++) {
                System.out.print(number[row][columnEnd] +" ");
            }
            columnEnd--;


            //3
            for(int col=columnEnd; col>=columnStart; col--) {
                System.out.print(number[rowEnd][col] + " ");
            }
            rowEnd--;


            //4
            for(int row=rowEnd; row>=rowStart; row--) {
                System.out.print(number[row][columnStart] + " ");
            }
            columnStart++;


            System.out.println();
        }
    }
}


