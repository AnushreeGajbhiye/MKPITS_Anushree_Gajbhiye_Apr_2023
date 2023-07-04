package twoDarray;

import java.util.Scanner;

public class TwoArrayRowColumn {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Row and Column : ");
//        int row = scanner.nextInt();
//        int col = scanner.nextInt();
//
//        int [][] matrix = new int [row][col];
//
//     //input
//        //for row
//        for(int i=0;i<=row;i++){
//            //for column
//            for (int j=0;j<=col;j++){
//                matrix[i][j]= scanner.nextInt();
//            }
//        }
//
//        //output
//        for (int i=0;i<=row;i++){
//            for (int j=0;j<=col;j++){
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }



        Scanner scanner = new Scanner(System.in);
        System.out.println("The row and column is : ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        int numbers[][] = new int[row][col];

//        input
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                numbers[i][j] = scanner.nextInt();
            }
        }

        for(int i=0; i<row; i++) {
            for (int j = 0; j <col; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }

}
