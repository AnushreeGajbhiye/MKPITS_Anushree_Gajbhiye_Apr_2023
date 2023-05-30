class Bytee{
public byte addByte(byte number1, byte number2){
return(number1+number2);
}
}

class Byte1{
public static void main(String[] args){
Bytee bytee = new Bytee();
byte add=bytee.addByte(4,4);
System.out.println(add);
}
}
