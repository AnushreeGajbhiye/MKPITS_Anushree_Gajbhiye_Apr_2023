package Laptop;

public class LaptopNameMain extends LaptopName {
    @Override
    public void laptopCompany(){
        System.out.println("Asus");
    }
    public void laptopDetails(){
        System.out.println("ROM");

    }

    public static void main(String[] args) {
       // LaptopName laptopName = new LaptopNameMain();
        LaptopNameMain laptopNameMain = new LaptopNameMain();
        laptopNameMain.laptopCompany();
        laptopNameMain.laptopDetails();
    }

}
