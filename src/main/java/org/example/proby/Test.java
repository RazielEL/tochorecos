package org.example.proby;

public class Test {
    static Animals.Dog dog = new Animals.Dog();
    static Animals.Cat cat = new Animals.Cat();

    private static < T extends BaseAnimal> void genericMethod(T instance){
        System.out.println("class: " + instance.getClass() + ", Wysokosc: " + instance.getWys());
        System.out.println("class: " + instance.getClass() + ", Dlugosc: " + instance.getDl());
        System.out.println("class: " + instance.getClass() + ", String: " + instance.getDesc());
    }

    public static void main (String[] a){

        genericMethod(dog);
        System.out.println();
        genericMethod(cat);




    }

}
