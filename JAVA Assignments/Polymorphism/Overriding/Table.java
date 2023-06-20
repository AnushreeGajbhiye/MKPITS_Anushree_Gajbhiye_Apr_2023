class Table extends Wood{
//@Override
public void sunmica(){
System.out.println("Sunmica color is white");
}

public static void main(String[] args){

Wood wood = new Wood();
wood.sunmica();

Table table = new Table();
table.sunmica();
}
}