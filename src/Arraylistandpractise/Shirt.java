package Arraylistandpractise;

import java.util.ArrayList;

public class Shirt {
    String type;
    String name;
    float price;
    public Shirt(String type ,String name , float price){
        this.type = type;
        this.name = name;
        this.price = price;
    }
    void Display(){
        System.out.print(type+" "+name+" "+price);
    }
    public static void main(String ars[]){
        ArrayList<Shirt> arrayListShirt= new ArrayList<>();
        Shirt t1 = new Shirt("denim", "casual wear" , 1000);
        arrayListShirt.add(t1);

        for(Shirt ts :arrayListShirt){
           ts.Display();
        }
    }
}
