class PolymorphismOverloading2{
public void addition2(byte number1,short number2){
System.out.println(number1+number2);
}
public void addition2(short number1,short number2, short number3){
System.out.println(number1+number2+number3);
}



public static void main(String[] args){
 PolymorphismOverloading2  polymorphismOverloading2 = new  PolymorphismOverloading2();
polymorphismOverloading2.addition2(1,1);
polymorphismOverloading2.addition2(1,1,2);
}
}

//if we take byte and short its show possible lossy conversation from int to byte