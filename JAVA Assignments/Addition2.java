class Addition1{
public int addInteger(int number1, int number2){
return(number1+number2);
}
}


class Addition2{

 public static void main(String[] args){
 Addition1 addition1 = new Addition1();
 int sum = addition1.addInteger(10,10);
 System.out.println(sum);
 }
} 