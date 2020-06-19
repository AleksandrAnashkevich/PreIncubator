package task2.factory;

import task2.factory.impl.AnimalFactoryImpl;

public class FactorySingleton {
    private static FactorySingleton instance;
    private final AnimalFactory animalFactory;

    private FactorySingleton(){
        animalFactory=new AnimalFactoryImpl();
    }

    public static FactorySingleton getInstance() {
        if (instance == null){
            instance=new FactorySingleton();
        }
        return instance;
    }

    public AnimalFactory getAnimalFactory() {
        return animalFactory;
    }
}
