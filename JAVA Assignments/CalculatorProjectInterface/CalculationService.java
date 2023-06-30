public class CalculationService {
    public void calculate(String operator, double operand1, double operand2) {

        switch (operator) {

            case "+":
                CalculationAddition addition = new CalculationAddition();
                System.out.println("Addition of "+operand1+"+"+operand2+" = "+addition.getCalculatedValue(operand1,operand2));
                break;
            case "-":
                CalculationSubstraction substraction = new CalculationSubstraction();
                System.out.println("Substraction of "+operand1+"-"+operand2+" = "+substraction.getCalculatedValue(operand1,operand2));
                break;
            case "*":
                CalculationMultiplication multiplication = new CalculationMultiplication();
                System.out.println( "Multiplication of "+operand1+"*"+operand2+" = "+multiplication.getCalculatedValue(operand1,operand2));

                break;
            case "/":
                CalculationDivision division = new CalculationDivision();
                System.out.println("Division of "+operand1+ "/"+operand2+" = "+division.getCalculatedValue(operand1,operand2));
                break;
        }

    }

}
