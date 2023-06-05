class Logical{
	
public boolean logicalOR1(boolean variable1,boolean variable2){
return variable1 || variable2;
}


public boolean logicalOR2(boolean variable1, boolean variable2, boolean variable3){
	return variable1 || variable2 || variable3;
}


public boolean logicalOR3(boolean variable1, boolean variable2, boolean variable3, boolean variable4){
	return variable1 || variable2 || variable3 || variable4;
}

public boolean logicalOR4(boolean variable1, boolean variable2, boolean variable3, boolean variable4, boolean variable5){
	return variable1 || variable2 || variable3 || variable4 || variable5;
}
}

class MainLogicalORUsingDifferentParameters{
public static void main(String[] args){
	
Logical logical = new Logical();

//for two variables
System.out.println("Logical OR true, true is : " +logical.logicalOR1(true, true));
System.out.println("Logical OR false, true is : " +logical.logicalOR1(false, true));
System.out.println("Logical OR true, false is : " +logical.logicalOR1(true, false));
System.out.println("Logical OR false, false is : " +logical.logicalOR1(false, false));



//for three variables

System.out.println("Logical OR true,true,true is : " +logical.logicalOR2(true,true,true));
System.out.println("Logical OR true,true,false is : " +logical.logicalOR2(true,true,false));
System.out.println("Logical OR true,false,false is : " +logical.logicalOR2(true,false,false));
System.out.println("Logical OR true,false,true is : " +logical.logicalOR2(true,false,true));
System.out.println("Logical ORfalse,false,false is : " +logical.logicalOR2(false,false,false));
System.out.println("Logical OR false,false,true is : " +logical.logicalOR2(false,false,true));
System.out.println("Logical OR false,true,true is : " +logical.logicalOR2(false,true,true));
System.out.println("Logical OR false,true,false is : " +logical.logicalOR2(false,true,false));



//for four variables
System.out.println("Logical OR true, true, true, true is : " +logical.logicalOR3(true, true, true, true));
System.out.println("Logical OR true, true, true, false is : " +logical.logicalOR3(true, true, true, false));
System.out.println("Logical OR true, true, false, false is : " +logical.logicalOR3(true, true, false, false));
System.out.println("Logical OR true, false, false, false is : " +logical.logicalOR3(true, false, false, false));
System.out.println("Logical OR true, false, false, true is : " +logical.logicalOR3(true, false, false,true));
System.out.println("Logical OR true, false false, true is : " +logical.logicalOR3(true, false, false, true));
System.out.println("Logical OR false, false, false, false is : " +logical.logicalOR3(false,false,false,false));
System.out.println("Logical OR false, false, false, true is : " +logical.logicalOR3(false,false,false,true));
System.out.println("Logical OR false, false, true, true is : " +logical.logicalOR3(false,false,true,true));
System.out.println("Logical OR false false, true, true, true is : " +logical.logicalOR3(false,true,true,true));
System.out.println("Logical OR false, true, false, true is : " +logical.logicalOR3(false,true,false,true));


//for five parameters
System.out.println("Logical OR true,true,true,true,true is " +logical.logicalOR4(true,true,true,true,true));
System.out.println("Logical OR true,true,true,true,false is " +logical.logicalOR4(true,true,true,true,false));
System.out.println("Logical OR true,true,true,false,false is " +logical.logicalOR4(true,true,true,false,false));
System.out.println("Logical OR true,true,false,false,false is " +logical.logicalOR4(true,true,false,false,false));
System.out.println("Logical OR true,false,false,false is " +logical.logicalOR4(true,false,false,false,false));
System.out.println("Logical OR true,false,false,false,true is " +logical.logicalOR4(true,false,false,false,true));
System.out.println("Logical OR true,false,true,false,true is " +logical.logicalOR4(true,false,true,false,true));
System.out.println("Logical OR true,false,true,true,true is " +logical.logicalOR4(true,false,true,true,true));
System.out.println("Logical OR true,false,false,true,true is " +logical.logicalOR4(true,false,false,true,true));
System.out.println("Logical OR true,true,true,false,true is " +logical.logicalOR4(true,true,true,false,true));
System.out.println("Logical OR true,true,false,false,true is " +logical.logicalOR4(true,true,false,false,true));

System.out.println("Logical OR false,false,false,false,false is : " +logical.logicalOR4(false,false,false,false,false));
System.out.println("Logical OR false,false,false,false,true is : " +logical.logicalOR4(false,false,false,false,true));
System.out.println("Logical OR false,false,false,true,true is : " +logical.logicalOR4(false,false,false,true,true));
System.out.println("Logical OR false,false,true,true,true is : " +logical.logicalOR4(false,false,true,true,true));
System.out.println("Logical OR false,true,true,true,true is : " +logical.logicalOR4(false,true,true,true,true));
System.out.println("Logical OR false,true,true,true,false is : " +logical.logicalOR4(false,true,true,true,false));
System.out.println("Logical OR false,true,false,ture,false is : " +logical.logicalOR4(false,true,false,true,false));
System.out.println("Logical OR false,true,false,false,false is : " +logical.logicalOR4(false,true,false,false,false));
System.out.println("Logical OR false,false,false,false,false is : " +logical.logicalOR4(false,false,false,false,false));
System.out.println("Logical OR false,true,true,false,false is : " +logical.logicalOR4(false,true,true,false,false));
System.out.println("Logical OR false,false,false,true,false is : " +logical.logicalOR4(false,false,false,true,false));
System.out.println("Logical OR false,false,true,true,true is : " +logical.logicalOR4(false,false,true,true,true));

}
}
