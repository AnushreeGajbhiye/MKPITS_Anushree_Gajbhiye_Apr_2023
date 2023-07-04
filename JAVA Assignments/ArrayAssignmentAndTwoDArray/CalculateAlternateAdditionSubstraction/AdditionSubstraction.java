package CalculateAlternateAdditionSubstraction;

public class AdditionSubstraction implements CalculateAlternateAdditionSubstraction{
    @Override
        public void calculateAdditionSubstraction(){
            //-------------here I store the array length with random value upto 40
            int array[] = {1, 4, 5, 8, 47, 74, 96, 44, 83, 40, 923, 433, 843, 23, 223, 454, 45, 87, 98, 343, 233, 232, 32, 222, 234, 787, 12, 32, 34, 87, 123, 125, 365, 76, 84, 68, 54, 76, 90, 100};
            //------------declare sum and initialize as 0
            int sum = 0;
            //-------------here I run loop from 3 upto array length and update it with a 4 it means it take every 4th element of the array
            for(int counter = 4; counter <= array.length; counter=counter+5){
                //------------condition to take a even element as positive
                if(counter%2 != 0){
                    //----------display sum of cube of every 5th element
                    System.out.print(array[counter]  + "*" + array[counter] + "*" + array[counter]);
                    System.out.print(" + ");
                    //sum of cube of every 5th element
                    sum = sum + (array[counter] * array[counter] * array[counter]);
                }else{//---------else condition to take every odd element as positive
                    //----------display sum of cube of every 5th element
                    System.out.print(array[counter]  + "*" + array[counter] + "*" + array[counter]);
                    System.out.print(" - ");
                    //substract the cube of every 5th element
                    sum = sum - (array[counter]*array[counter]*array[counter]);
                }
            }
            //--------------print sum of square of every 4th element
            System.out.println(" = " + sum);

        }
    }

