class Appartment extends House{
//@Override
public void floor(){
System.out.println("Third floor");
}

public static void main(String[] args){
	House house = new House();
	house.floor();
	
	Appartment appartment = new Appartment();
	appartment.floor();
}
	
}