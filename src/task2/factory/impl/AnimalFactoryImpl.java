package task2.factory.impl;

import task2.factory.AnimalFactory;
import task2.factory.AnimalType;
import task2.model.Animal;
import task2.model.Cat;
import task2.model.Chicken;
import task2.model.Cow;
import task2.model.Dog;

public class AnimalFactoryImpl implements AnimalFactory {
    @Override
    public Animal getAnimal(String nameAnimal) {

        AnimalType animalType = AnimalType.valueOf(nameAnimal);
        switch (animalType) {
            case DOG:return new Dog(animalType.toString());
            case CAT:return new Cat(animalType.toString());
            case COW:return new Cow(animalType.toString());
            case CHICKEN:return new Chicken(animalType.toString());
        }
        return null;
    }
}
