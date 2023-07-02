package SocialMedia;

public class Instagram implements Facebook{
    @Override
    public void mediaType1(){
        System.out.println("it is social Media");
    }
    public void mediaType2(){
        System.out.println("It's Facebook");
    }

    public static void main(String[] args) {
        Instagram instagram = new Instagram();
        instagram.mediaType1();
        instagram.mediaType2();
    }
}
