class HouseMain extends House{
//@Override
public void appartment(){
System.out.println("3bhk");
}

public static void main(String[] args){
House house = new House();
house.appartment();

HouseMain houseMain = new HouseMain();
houseMain.appartment();
}
}