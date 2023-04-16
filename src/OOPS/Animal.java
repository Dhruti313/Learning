package OOPS;

public class Animal {
    void eat() {
        System.out.println("eats");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barks");
    }
}
class Cat extends Animal {
    void meows() {
        System.out.println("Meows");
    }

    public static void main(String args[]) {
        Animal a = new Animal();
        a.eat();
        Dog d = new Dog();
        d.bark();
        d.eat();
        Cat c = new Cat();
        c.meows();
        c.eat();



    }
}




