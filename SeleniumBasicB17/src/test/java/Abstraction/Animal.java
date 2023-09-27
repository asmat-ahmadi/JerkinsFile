package Abstraction;

public abstract class Animal {

        abstract void speak();
        abstract  void eat();
        abstract void sleep();
    }
     class Dog extends Animal{
        void speak(){
            System.out.println("wuff wuff");
        }
        void eat(){
            System.out.println("eat alot ");
        }
        void sleep(){
            System.out.println("sleeping for 10 hours");
         }
    }
    class Cat extends Animal{
        void speak(){
            System.out.println("can speak well");
        }
        @Override
        void eat() {
            System.out.println("cat can eat");
        }
        @Override
        void sleep() {
            System.out.println("can sleep for 4 hrs");
        }
    }
class tester {
    public static void main(String[] args) {
        Animal [] arr={new Cat(),new Dog()};
        for(Animal a:arr){
            a.speak();
            a.eat();
            a.sleep();


        }

    }
}