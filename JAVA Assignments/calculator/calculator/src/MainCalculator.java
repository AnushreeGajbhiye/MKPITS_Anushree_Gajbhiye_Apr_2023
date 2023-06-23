public class MainCalculator {
    public static void main(String[] args) {
CalculationService calculationservice = new CalculationService();
calculationservice.calculate("+",25.7,34.0);
calculationservice.calculate("-",55.6,77.8);
calculationservice.calculate("*",67.9,99.9);
calculationservice.calculate("%",76.9,97.6);

    }
}
