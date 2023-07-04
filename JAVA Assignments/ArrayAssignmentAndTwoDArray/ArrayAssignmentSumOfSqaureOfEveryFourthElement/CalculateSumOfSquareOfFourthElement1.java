package ArrayAssignmentSumOfSqaureOfEveryFourthElement;
/**
 * here we take class name(CalculateSumOfSquareOfFourthElement1) and implements CalculateSumOfSquareOfFourthElement
 * and override interface method
 */

public class CalculateSumOfSquareOfFourthElement1 implements CalculateSumOfSquareOfFourthElement{
    public void getSquareOfElement() {
        //--------here i store the array length with random value upto 40
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40};
        //-----------declare sum and initialize as 0
        int sum = 0;
        //---------here i run loop from 3 upto array length and update it with a 4 it means it take every 4th element of the array
        for (int counter = 3; counter <= array.length; counter = counter + 4) {
        //-----------here practically show that how it square every 4th element and add
            System.out.print(array[counter] + "*" + array[counter] + " ");
        //------------here i take a operator (+) with add every square value and print addition
            System.out.print("+" + " ");
        //-------------store sum in sum variable and print final addition
            sum = sum + (array[counter] * array[counter]);
        }
        //----------print sum of square of every 4th element
        System.out.println(" = " + sum);
    }
    }



