//class name same method name same but parametrs or argument are diffrent
//and we want different dataType not same
//we take variable name same

class PolymorphismOverloading1{
public void addition1(){
System.out.println("zero argument method");
}
public void addition1(int number1){
System.out.println(number1);
}
public void addition1(int number1, int number2){
System.out.println(number1+number2);	
}

public static void main(String[] args){
PolymorphismOverloading1 polymorphismOverloading1 = new PolymorphismOverloading1();
polymorphismOverloading1.addition1();
polymorphismOverloading1.addition1(10);	
polymorphismOverloading1.addition1(10,30);	

}
} 