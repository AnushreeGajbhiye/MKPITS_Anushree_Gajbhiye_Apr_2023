class Plus{
int addInteger(int number1, int number2){
return(number1+number2);
}
}

class Plus1{
public static void main(String[] args){
Plus plus = new Plus();
int sum=plus.addInteger(10,10);
System.out.println(sum);
}
}
