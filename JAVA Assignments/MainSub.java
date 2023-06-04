class Substraction1{
	
public int subInteger(int integer1,int integer2){
return(integer1-integer2);
}

public long  subLong( long long1, long long2){
	return(long1-long2);
}

public double subDouble(double double1, double double2){
	return(double1-double2);
}	

public float subFloat(float float1, float float2){
	return(float1-float2);
}

/*public short subShort(short short1, short short2){
	return(short1-short2);
}*/
}



	


class MainSub{
public static void main (String[] args){

Substraction1 substraction1 = new Substraction1();
int sub = substraction1.subInteger(33,55);
System.out.println("Substration of integer1 and integer2 are : " +sub);
System.out.println("Substration of integer1 and integer2 are : " +substraction1.subInteger(22,55));

System.out.println("Substraction of long1 and long2 are : " +substraction1.subLong(1234,1234));

System.out.println("Substraction of double1 and double2 are : " +substraction1.subDouble(34.5,78.6));

System.out.println("substraction of float1 and float2 are : " +substraction1.subFloat(4.4f,7.7f));

/*System.out.println("Substraction of short1 and short2 are : " +substraction1.subShort(3,3));*/
}
}
