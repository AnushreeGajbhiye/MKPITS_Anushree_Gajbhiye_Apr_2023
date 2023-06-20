class PolymorphismOverloading4{
public void multiplication(float number1,float number2, float number3){
System.out.println(number1*number2*number3);
}
public void  multiplication(float number1,double number2){
System.out.println(number1*number2);
}
public void  multiplication(double number1,long number2){
System.out.println(number1*number2);
}
public void  multiplication(long number1,double number2){
System.out.println(number1*number2);
}

public static void main(String[] args){
PolymorphismOverloading4 polymorphismOverloading4 = new PolymorphismOverloading4();	
polymorphismOverloading4.multiplication(1.1f,1.1f,1.1f);
polymorphismOverloading4.multiplication(1.1f,11.1);
polymorphismOverloading4.multiplication(1111111111l,11.1);
}
}