class Logical{
	
public boolean logicalAnd1(boolean variable1,boolean variable2){
return variable1 && variable2;
}


public boolean logicalAnd2(boolean variable1, boolean variable2, boolean variable3){
	return variable1 && variable2 && variable3;
}


public boolean logicalAnd3(boolean variable1, boolean variable2, boolean variable3, boolean variable4){
	return variable1 && variable2 && variable3 && variable4;
}

public boolean logicalAnd4(boolean variable1, boolean variable2, boolean variable3, boolean variable4, boolean variable5){
	return variable1 && variable2 && variable3 && variable4 && variable5;
}
}

class MainLogicalAndUsingDifferentParameters{
public static void main(String[] args){
	
Logical logical = new Logical();

//for two variables
System.out.println("Logical AND true, true is : " +logical.logicalAnd1(true, true));
System.out.println("Logical AND false, true is : " +logical.logicalAnd1(false, true));
System.out.println("Logical AND true, false is : " +logical.logicalAnd1(true, false));
System.out.println("Logical AND false, false is : " +logical.logicalAnd1(false, false));



//for three variables

System.out.println("Logical AND true,true,true is : " +logical.logicalAnd2(true,true,true));
System.out.println("Logical AND true,true,false is : " +logical.logicalAnd2(true,true,false));
System.out.println("Logical AND true,false,false is : " +logical.logicalAnd2(true,false,false));
System.out.println("Logical AND true,false,true is : " +logical.logicalAnd2(true,false,true));
System.out.println("Logical ANDfalse,false,false is : " +logical.logicalAnd2(false,false,false));
System.out.println("Logical AND false,false,true is : " +logical.logicalAnd2(false,false,true));
System.out.println("Logical AND false,true,true is : " +logical.logicalAnd2(false,true,true));
System.out.println("Logical AND false,true,false is : " +logical.logicalAnd2(false,true,false));



//for four variables
System.out.println("Logical AND true, true, true, true is : " +logical.logicalAnd3(true, true, true, true));
System.out.println("Logical AND true, true, true, false is : " +logical.logicalAnd3(true, true, true, false));
System.out.println("Logical AND true, true, false, false is : " +logical.logicalAnd3(true, true, false, false));
System.out.println("Logical AND true, false, false, false is : " +logical.logicalAnd3(true, false, false, false));
System.out.println("Logical AND true, false, false, true is : " +logical.logicalAnd3(true, false, false,true));
System.out.println("Logical AND true, false false, true is : " +logical.logicalAnd3(true, false, false, true));
System.out.println("Logical AND false, false, false, false is : " +logical.logicalAnd3(false,false,false,false));
System.out.println("Logical AND false, false, false, true is : " +logical.logicalAnd3(false,false,false,true));
System.out.println("Logical AND false, false, true, true is : " +logical.logicalAnd3(false,false,true,true));
System.out.println("Logical AND false false, true, true, true is : " +logical.logicalAnd3(false,true,true,true));
System.out.println("Logical AND false, true, false, true is : " +logical.logicalAnd3(false,true,false,true));


//for five parameters
System.out.println("Logical AND true,true,true,true,true is " +logical.logicalAnd4(true,true,true,true,true));
System.out.println("Logical AND true,true,true,true,false is " +logical.logicalAnd4(true,true,true,true,false));
System.out.println("Logical AND true,true,true,false,false is " +logical.logicalAnd4(true,true,true,false,false));
System.out.println("Logical AND true,true,false,false,false is " +logical.logicalAnd4(true,true,false,false,false));
System.out.println("Logical AND true,false,false,false is " +logical.logicalAnd4(true,false,false,false,false));
System.out.println("Logical AND true,false,false,false,true is " +logical.logicalAnd4(true,false,false,false,true));
System.out.println("Logical AND true,false,true,false,true is " +logical.logicalAnd4(true,false,true,false,true));
System.out.println("Logical AND true,false,true,true,true is " +logical.logicalAnd4(true,false,true,true,true));
System.out.println("Logical AND true,false,false,true,true is " +logical.logicalAnd4(true,false,false,true,true));
System.out.println("Logical AND true,true,true,false,true is " +logical.logicalAnd4(true,true,true,false,true));
System.out.println("Logical AND true,true,false,false,true is " +logical.logicalAnd4(true,true,false,false,true));

System.out.println("Logical AND false,false,false,false,false is : " +logical.logicalAnd4(false,false,false,false,false));
System.out.println("Logical AND false,false,false,false,true is : " +logical.logicalAnd4(false,false,false,false,true));
System.out.println("Logical AND false,false,false,true,true is : " +logical.logicalAnd4(false,false,false,true,true));
System.out.println("Logical AND false,false,true,true,true is : " +logical.logicalAnd4(false,false,true,true,true));
System.out.println("Logical AND false,true,true,true,true is : " +logical.logicalAnd4(false,true,true,true,true));
System.out.println("Logical AND false,true,true,true,false is : " +logical.logicalAnd4(false,true,true,true,false));
System.out.println("Logical AND false,true,false,ture,false is : " +logical.logicalAnd4(false,true,false,true,false));
System.out.println("Logical AND false,true,false,false,false is : " +logical.logicalAnd4(false,true,false,false,false));
System.out.println("Logical AND false,false,false,false,false is : " +logical.logicalAnd4(false,false,false,false,false));
System.out.println("Logical AND false,true,true,false,false is : " +logical.logicalAnd4(false,true,true,false,false));
System.out.println("Logical AND false,false,false,true,false is : " +logical.logicalAnd4(false,false,false,true,false));
System.out.println("Logical AND false,false,true,true,true is : " +logical.logicalAnd4(false,false,true,true,true));

}
}
