package Flower;

public class FlowerMain implements Blue{
    @Override
    public void color1(){
        System.out.println("Folwer Color");
    }
    public void color2(){
        System.out.println("Flower color is Red");
    }
    public void color3(){
        System.out.println("Flower color is Yellow");
    }
    public void color4(){
        System.out.println("Flower color is Blue");
    }

    public static void main(String[] args) {
        FlowerMain flowerMain = new FlowerMain();
        flowerMain.color1();
        flowerMain.color2();
        flowerMain.color3();
        flowerMain.color4();

    }
}
