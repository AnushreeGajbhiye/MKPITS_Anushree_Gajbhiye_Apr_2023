class AddNoReturnType{
public void addInt(){
	int number1=10, number2=10;
int number3 = number1+number2;
System.out.println(number3);
}
public static void main(String[] args){
	AddNoReturnType add  = new AddNoReturnType();
	add.addInt();
}
	
}