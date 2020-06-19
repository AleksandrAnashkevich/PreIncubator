package task2.model;

import java.util.Objects;

public class GenericClass<T extends Animal> {

    T animal;

    public GenericClass(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public String getMessage(){
        return "This animal is " + animal.getType()
                + " and it say \"" + animal.voice()+ "\"";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenericClass<?> that = (GenericClass<?>) o;
        return Objects.equals(animal, that.animal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animal);
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "animal=" + animal +
                '}';
    }
}
