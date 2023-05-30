class Short2{
public int addShort(int number1, int number2){
return(number1+number2);
}
}

class Short1{
public static void main(String[] args){
Short2 short2 = new Short2();
int add = short2.addShort(10,10);
System.out.println(add);
}
}