class Division{
	
public int divisionInteger(int integer1,int integer2){
return(integer1/integer2);
}

public long divisionLong(long long1, long long2){
	return(long1/long2);
}

public float divisionFloat(float float1, float float2){
	return(float1/float2);
}

public double divisionDouble(double double1, double double2){
	return(double1/double2);
}

//public short divisionShort(short short1, short short2){//
	//return(short1/short2);//
//}//


}

class MainDivision{
public static void main(String[] args){

Division division = new Division();

System.out.println("Division of integer1 and integer2 are : " +division.divisionInteger(3,27));

System.out.println("Division of long1 and long2 are : " +division.divisionLong(5678,7966));

System.out.println("Division of float1 and float2 are : " +division.divisionFloat(5f,30f));

System.out.println("Division of double1 and double2 are : " +division.divisionDouble(55.5,66.6));

//System.out.println("Division of short1 and short2 are : " +division.divisionShort(6/30));//
}
}

