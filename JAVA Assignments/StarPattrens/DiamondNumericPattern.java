public class DiamondNumericPattern extends StarPattern{
    public int getStarPattern(int number1){
        // upper half
        for(int row=1; row<=number1; row++){
            //SPACES
            for(int space=1; space<=row; space++){
                System.out.print(" ");
            }
            //STARS
            for(int column=row; column<=number1; column++){
                System.out.print(column + " ");
            }
            System.out.println();
        }
//        //LOWER HALF
//        for(int row=number1; row>=1; row--){
//            //SPACES
//            for(int space=1; space<=number1-row; space++){
//                System.out.print(" ");
//            }
//
//            //STARS
//            for(int column=1; column<=2*row-1; column++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        // lower half
        for(int row=number1-1; row>=1; row--){
            //SPACES
            for(int space=1; space<=row; space++){
                System.out.print(" ");
            }

            //STARS
            for(int column=row; column<=number1; column++){
                System.out.print(column + " ");
            }
            System.out.println();
        }
        return 0;


        }
    }
