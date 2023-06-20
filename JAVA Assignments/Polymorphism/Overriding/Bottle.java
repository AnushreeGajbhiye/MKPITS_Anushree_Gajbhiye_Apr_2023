class Bottle extends Plastic{
//@Override
public void water(){
System.out.println("Water is non-filter");
}

public static void main(String[] args){
Plastic plastic = new Plastic();
plastic.water();

Bottle bottle = new Bottle();
bottle.water();
}
}