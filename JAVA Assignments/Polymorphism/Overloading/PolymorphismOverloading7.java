class PolymorphismOverloading7{
public void addition7(long number1, float number2){
System.out.println(number1+number2);
}
public void addition7(double number1, float number2, long number3, float number4){
System.out.println(number1+number2+number3+number4);
}
public static void main(String[] args){
PolymorphismOverloading7 polymorphismOverloading7 = new PolymorphismOverloading7();
polymorphismOverloading7.addition7(8888888888l,2.0f)	;
polymorphismOverloading7.addition7(25.5,2.0f,11111111118l,1.1f)	;
}
}