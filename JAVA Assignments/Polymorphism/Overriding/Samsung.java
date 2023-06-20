class Samsung extends Tv{
//@Override

public void start(){
System.out.println("Tv color is blue");
}

public static void main(String[] args){
Tv tv = new Tv();
tv.start();

Samsung samsung = new Samsung();
samsung.start();

}
}