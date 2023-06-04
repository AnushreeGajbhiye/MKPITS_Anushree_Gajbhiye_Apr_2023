class Multiplication{

public int multiplicationInteger(int integer1, int integer2){
return(integer1*integer2);
}

public long multiplicationLong(long long1, long long2){
	return(long1*long2);
}

public float multiplicationFloat(float float1, float float2){
	return(float1*float2);
}

public double multiplicationDouble(double double1, double double2){
	return(double1*double2);
}

//public short multiplicationShort(short short1, short short2){
	return(short1*short2);
}//



}

class MainMultiplication{
public static void main(String[] args){

Multiplication multiplication = new Multiplication();

System.out.println("Multiplication of integer1 and integer2 are : " +multiplication.multiplicationInteger(3,3));

System.out.println("Multiplication of long1 and long2 are : " +multiplication.multiplicationLong(232423,567676));

System.out.println("Multiplication of float1 and float2 are : " +multiplication. multiplicationFloat(4.7f,3.9f));

System.out.println("Multiplication of double1 and double2 are : " +multiplication.multiplicationDouble(22.2,44.4));

//System.out.println("Multiplication of short1 and short2 are : " +multiplication.multiplicationShort(5,5));//
}
}

