class PenMain extends Pen{

//@Override
public void gelPen(){
System.out.println("This get pen color is red");
System.out.println("This get pen color is pink");
}

public static void main(String[] args){
Pen pen = new Pen();
pen.gelPen();

PenMain penMain = new PenMain();
penMain.gelPen();

}
}