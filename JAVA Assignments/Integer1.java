class Integer{
public int addInt(int number1,int number2){
return(number1+number2);
}
}

class Integer1{
public static void main(String[] args){
Integer integer = new Integer();
int add = integer.addInt(20,20);
System.out.println(add);
}
}