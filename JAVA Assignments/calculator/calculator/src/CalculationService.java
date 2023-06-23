public class CalculationService {
    public void calculate(String operator, double operand1, double operand2) {

        switch (operator) {

            case "+":
                CalculationAddition addition = new CalculationAddition();
                System.out.println("The addition of numbers "+operand1+" and "+operand2+" is "+addition.getCalculatedValue(operand1,operand2));
                break;
            case "-":
                CalculationSubstraction substraction = new CalculationSubstraction();
                System.out.println("The substraction of numbers "+operand1+" and "+operand2+" is "+substraction.getCalculatedValue(operand1,operand2));
                break;
            case "*":
                CalculationMultiplication multiplication = new CalculationMultiplication();
                System.out.println( "The multiplication of numbers "+operand1+" and "+operand2+" is "+multiplication.getCalculatedValue(operand1,operand2));

                break;
            case "/":
                CalculationDivision division = new CalculationDivision();
                System.out.println("The division of numbers "+operand1+" and "+operand2+" is "+division.getCalculatedValue(operand1,operand2));
                break;
        }

    }

}
