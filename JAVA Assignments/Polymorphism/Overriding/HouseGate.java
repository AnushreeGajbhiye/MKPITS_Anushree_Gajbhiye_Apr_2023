class HouseGate{
//@Override
public void socket(){
System.out.println("Gate color is red");
}

public static void main(String[] args){
Gate gate = new Gate();
gate.socket();
HouseGate houseGate = new HouseGate();
houseGate.socket();
}

}