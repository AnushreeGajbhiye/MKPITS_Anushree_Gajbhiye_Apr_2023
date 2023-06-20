class PolymorphismOverloading8{
public void addition8(long number1, float number2){
System.out.println(number1+number2);
}
public void addition8(double number1, float number2){
System.out.println(number1+number2);
}
public static void main(String[] args){
PolymorphismOverloading8 polymorphismOverloading8 = new PolymorphismOverloading8();
polymorphismOverloading8.addition8(8888888888l,2.0f);
polymorphismOverloading8.addition8(25.5,2.0f);
}
}
