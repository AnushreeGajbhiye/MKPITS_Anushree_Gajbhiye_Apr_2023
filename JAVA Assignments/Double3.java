class Double1{
public double addDouble( double number1,double number2){
return(number1+number2);
}
}
class Double3{
public static void main(String[] args){
Double1 double1 = new Double1();
double add = double1.addDouble(12.2,13.2);
System.out.println(add);
}
}