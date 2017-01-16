package test;

/**
 * Created by Alex on 14.01.2017.
 */
public class Test {
    public static void main(String[] args){
        Cat cat = new Cat();
        System.out.println(cat.name);
    }

    public static class Cat {
        String name;
        public Cat() {
        }
        String nameDog = Dog.name;
    }

    public static class Dog {
        static String name;
        Cat cat = new Cat();
    }
}
