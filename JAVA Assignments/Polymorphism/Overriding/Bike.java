class Bike extends Vehical{

//@Override
public void run(){
System.out.println("Bike is kawasaki");
}

public static void main(String[] args){
	
Vehical vehical = new Vehical();
vehical.run();

Bike bike = new Bike();
bike.run();
	
}



}