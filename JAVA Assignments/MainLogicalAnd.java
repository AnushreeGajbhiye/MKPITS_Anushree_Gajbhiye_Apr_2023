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

class MainAnd{
public static void main(String[] args){
	
Logical logical = new Logical();

System.out.println("Logical AND true, true is : " +logical.logicalAnd1(true,true));

System.out.println("Logical AND true, true, false is : " +logical.logicalAnd2(true,true,false));

System.out.println("Logical AND true true false false is : " +logical.logicalAnd3(true, true, false, false));

System.out.println("Logical AND false false false true true is : " +logical.logicalAnd4(false ,false ,false,true,true));

}
}