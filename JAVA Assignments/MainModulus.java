class Modulus{
	
public int modulusInteger(int integer1,int integer2){
return(integer1%integer2);
}

public long modulusLong(long long1, long long2){
	return(long1%long2);
}

public float modulusFloat(float float1, float float2){
	return(float1%float2);
}

public double modulusDouble(double double1, double double2){
	return(double1%double2);
}

//public short modulusShort(short short1, short short2){//
	//return(short1%short2);//
//}//


}

class MainModulus{
public static void main(String[] args){

Modulus modulus = new Modulus();

System.out.println("Modulus of integer1 and integer2 are : " +modulus.modulusInteger(3,27));

System.out.println("Modulus of long1 and long2 are : " +modulus.modulusLong(8,7966));

System.out.println("Modulus of float1 and float2 are : " +modulus.modulusFloat(5f,30f));

System.out.println("Modulus of double1 and double2 are : " +modulus.modulusDouble(55.5,66.6));

//System.out.println("Modulus of short1 and short2 are : " +modulus.modulusShort(6/30));//
}
}

