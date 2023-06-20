class TravelsMain extends Travels{
@Override
public void saini(){
System.out.println("This bus is Ac");
}


public static void main(String[] args){
	
Travels travels = new Travels();
travels.saini();

TravelsMain travelsMain = new TravelsMain();
travelsMain.saini();

}
}