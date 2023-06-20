class PolymorphismOverloading6{
public void addition6(double number1,long number2){
System.out.println(number1+number2);	
}


public static void main(String[] args){
PolymorphismOverloading6 polymorphismOverloading6 = new PolymorphismOverloading6();
polymorphismOverloading6.addition6(2.5f,20)	;
//here we make type promotion
}
}