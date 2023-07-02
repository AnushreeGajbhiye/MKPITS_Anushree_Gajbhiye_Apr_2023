package Bikes;

public class BikeMain implements Bmw{
    @Override
    public void bikePrice1(){
        System.out.println("Bike Names");
    }
    public void bikePrice2(){
        System.out.println("i'm Kawasaki");
    }
    public void bikePrice3(){
        System.out.println("i'm Duke");
    }
    public void bikePrice4(){
        System.out.println("i'm Bmw RR");
    }


    public static void main(String[] args) {
        BikeMain bikeMain = new BikeMain();
        bikeMain.bikePrice1();
        bikeMain.bikePrice2();
        bikeMain.bikePrice3();
        bikeMain.bikePrice4();
    }
}
