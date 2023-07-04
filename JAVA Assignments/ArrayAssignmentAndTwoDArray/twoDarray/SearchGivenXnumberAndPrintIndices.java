package twoDarray;

import java.util.Scanner;

public class SearchGivenXnumberAndPrintIndices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Row and Columns Number : ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int [] [] number = new int [rows] [cols];

        //input
        //for rows
        for (int i=0;i<rows;i++){
            //for cols
            //compare with x
            for (int j=0;j<cols;j++){
                number[i][j]= scanner.nextInt();
            }
        }
        int x = scanner.nextInt();

        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                if (number[i][j] == x){
                    System.out.println("X found at location ("+ i +","+ j+ ")");
                }
            }
        }

    }
}
