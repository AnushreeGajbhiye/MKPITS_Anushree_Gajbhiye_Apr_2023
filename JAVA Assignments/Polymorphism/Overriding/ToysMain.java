class ToysMain extends Toys{
//@Override
public void electronicsToy(){
System.out.println("Battery");
}

public static void main(String[] args){
	
Toys toys = new Toys();
toys.electronicsToy();

ToysMain toysMain = new ToysMain();
toysMain.electronicsToy(); 
}
}
