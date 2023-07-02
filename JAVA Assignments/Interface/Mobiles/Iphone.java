package Mobiles;

public class Iphone implements Mobiles,Samsung,Mi {
    @Override
    public void mobileDetails1(){
        System.out.println("i'm a mobile phone");
    }

    public void mobileDetails2(){
        System.out.println("i'm a Samsung");
    }

    public void mobileDetails3(){
        System.out.println("i'm a Mi");
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.mobileDetails1();
        iphone.mobileDetails2();
        iphone.mobileDetails3();
    }

}
