class Float1{
public float addFloat(float number1,float number2){
return(number1+number2);
}
}

class Float2{
public static void main(String[] args){
Float1 float1 = new Float1();
float add = float1.addFloat(2.2f,3.2f);
System.out.println(add);
}
}