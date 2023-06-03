class Addition{
public int addInteger(int int1, int int2){
return(int1+int2);
}
}
class Addition1{
	public long addLong( long long1,long long2){
		return(long1+long2);
	}
}
class Addition22{
	public double addDouble(double double1,double double2){
		return(double1+double2);
	} 
}
class Addition3{
	public float addFloat(float float1, float float2){
		return(float1+float2);
	}
	
} 
/*class Addition4{
	public short addShort(short short1, short short2){
		return(short1+short2);
	}
}*/


class Mains{
public static void main (String[] args){

Addition addition = new Addition();
int sum = addition.addInteger(10,10);
System.out.println("Addition of int1 and int2 are : " +sum);
//////////////// OR ////////////////////
System.out.println("Addition of int1 and int2 are : " + addition.addInteger(10,10));

Addition1 addition1 = new Addition1();
long sum1 = addition1.addLong(123l,123l);
System.out.println("Addition of long1 and long2 are : " +sum1);
System.out.println("Addition of long1 and long2 are : " + addition1.addLong(0000000000l,0000000000l));

Addition22 addition22 = new Addition22();
double sum2 = addition22.addDouble(22.2,33.3);
System.out.println("Addition of double1 and double2 are : " +sum2); 
System.out.println("Addition of double1 and double2 are : " + addition22.addDouble(99.9,88.8));


Addition3 addition3 = new Addition3();
float sum3 = addition3.addFloat(2.2f,3.3f);
System.out.println("Addition of float1 and float2 are : " + sum3);
System.out.println("Addition of float1 and float2 are : " + addition3.addFloat(3.3f,3.3f));

/*Addition4 addition4 = new Addition4();
short sum4 = addition4.addShort(1,1);
System.out.println("Addition of short1 and short2 are : " +sum4);
System.out.println("Addition of short1 and short2 are : " + addition4.addShort(1,1));*/
}
}
 
