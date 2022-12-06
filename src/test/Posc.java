package test;

public class Posc extends Car {
    public String colorPost;
    public String titlePost;
    public String sizePost;

    public Posc(String title, String name, String color, String size) {
        super(title, name, color, size);
    }


    @Override
    public void maxSize(String size) {
        super.maxSize(sizePost);
    }
}
