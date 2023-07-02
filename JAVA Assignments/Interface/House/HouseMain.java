package House;

public class HouseMain implements House,Bhk2 {
    @Override
    public void houseType(){
        System.out.println("Villa");
    }
    public void floorNo(){
        System.out.println("4 ");

    }

    public static void main(String[] args) {
        HouseMain houseMain = new HouseMain();
        houseMain.houseType();
        houseMain.floorNo();
    }

}
