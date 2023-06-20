class PolymorphismOverloading9{
public void addition9(long number1, float number2,int number3,double number4){
System.out.println(number1+number2+number3+number4);
}
public void addition9(double number1, float number2,long number3){
System.out.println(number1+number2+number3);
}
public static void main(String[] args){
PolymorphismOverloading9 polymorphismOverloading9 = new PolymorphismOverloading9();
polymorphismOverloading9.addition9(8888888888l,2.0f,20,33.5);
polymorphismOverloading9.addition9(25.5,2.0f,222222222l);
}
}