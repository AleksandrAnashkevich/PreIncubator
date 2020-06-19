package task2.controller;

import task2.factory.FactorySingleton;
import task2.model.Animal;
import task2.model.GenericClass;

public class Main {
    public static void main(String[] args) {
        String animalType="Dog".toUpperCase();
        Animal animal=FactorySingleton.getInstance().getAnimalFactory().getAnimal(animalType);;
        GenericClass<Animal> genericClass=new GenericClass<>(animal);
        System.out.println(genericClass.getMessage());

    }
}
