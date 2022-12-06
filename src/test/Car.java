package test;

import java.util.ArrayList;
import java.util.List;

public class Car {
    public String title ="";
    public String name ="";
    public String color ="";
    public String size ="";

    public Car(String title, String name, String color, String size) {
        this.title = title;
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public void maxSize(String size){
        System.out.println(size);
    }

}


