class PolymorphismOverloading3{
public void susbtraction(int number1, int number2,float number3){
System.out.println(number1-number2-number3);
}
public void susbtraction(int number1,int number2,int number3){
System.out.println(number1-number3-number3);
}

//if we take long and and after int its show compile time error and say possible lossy conversion from long to int
public void susbtraction(int number1,int number2,long number3){
System.out.println(number1-number2-number3);
}

public static void main(String[] args){
PolymorphismOverloading3 polymorphismOverloading3 = new PolymorphismOverloading3();
polymorphismOverloading3.susbtraction(10,20,2.0f);
polymorphismOverloading3.susbtraction(1,1,1);
polymorphismOverloading3.susbtraction(2,2,2222222222l);
}
}