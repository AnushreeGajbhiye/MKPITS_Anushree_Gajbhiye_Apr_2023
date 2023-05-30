class Division{
public int divInteger(int number1, int number2){
return(number1/number2);
}
}

class Division2{
public static void main(String[] args){
Division division = new Division();
int divi = division.divInteger(66,2);
System.out.println(divi);
}
}
