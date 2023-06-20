class PolymorphismOverloading10{
public void addition10(int number1,long number2,float number3,double number4){
System.out.println(number1+number2+number3+number4);
}
public void addition10(long number1, float number2){
System.out.println(number1+number2);
}
public void addition10(double number1, float number2){
System.out.println(number1+number2);
}
public static void main(String[] args){
PolymorphismOverloading10 polymorphismOverloading10 = new PolymorphismOverloading10();
polymorphismOverloading10.addition10(30,8888888888l,2.0f,44.5);
polymorphismOverloading10.addition10(8888888888l,2.0f);
polymorphismOverloading10.addition10(25.5,2.0f);
}
}
