package Arraylistandpractise;

import java.util.HashMap;
import java.util.Map;


public class Book {
     String bookName;
     String authorName;
     float price;

    public Book(String bookName , String authorName , float price){
        this.bookName = bookName;
        this.authorName = authorName;
        this.price = price;


    }
     void Display()
    {
        System.out.println(bookName+" "+authorName+" "+price);
    }

    public static void main(String args[]){
        HashMap<Integer,Book> m = new HashMap<>();
        Book b1 = new Book("Let us C","Yashwant Kanetkar",400);
        Book b2 = new Book("Data communication","Forouzan",600);
        Book b3 = new Book("java complete reference","Herbert Schildt ",900);

        m.put(101,b1);
        m.put(102,b2);
        m.put(103,b3);

        for(Map.Entry<Integer , Book> e :m.entrySet()) {
           System.out.println(e.getKey());
            Book b = e.getValue();
            b.Display();

        }
    }


}
