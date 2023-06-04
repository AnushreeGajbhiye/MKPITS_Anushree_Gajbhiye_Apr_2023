class Logical{
	
public boolean logicalOr1(boolean variable1,boolean variable2){
return variable1 || variable2;
}

public boolean logicalOr2(boolean variable1, boolean variable2, boolean variable3){
	return variable1 || variable2 || variable3;
}

public boolean logicalOr3(boolean variable1, boolean variable2, boolean variable3, boolean variable4){
	return variable1 || variable2 || variable3 || variable4;
}

public boolean logicalOr4(boolean variable1, boolean variable2, boolean variable3, boolean variable4, boolean variable5){
	return variable1 || variable2 || variable3 || variable4 || variable5;
}
}

class MainLogicalOr{
public static void main(String[] args){
	
Logical logical = new Logical();

System.out.println("Logical OR true, true is : " +logical.logicalOr1(true,true));

System.out.println("Logical OR true, true, false is : " +logical.logicalOr2(true,true,false));

System.out.println("Logical OR true true false false is : " +logical.logicalOr3(true, true, false, false));

System.out.println("Logical OR false false false true true is : " +logical.logicalOr4(false ,false ,false,true,true));

}
}