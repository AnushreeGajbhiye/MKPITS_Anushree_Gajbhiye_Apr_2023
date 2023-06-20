class PolymorphismOverloading5{
public void division(double number1, int number2){
System.out.println(number1/number2);
}
public void division(double number1, float number2){
System.out.println(number1/number2);
}
public static void main(String[] args){
PolymorphismOverloading5 PolymorphismOverloading5 = new PolymorphismOverloading5();
PolymorphismOverloading5.division(25.5,20)	;
PolymorphismOverloading5.division(25.5,2.0f)	;
}
}