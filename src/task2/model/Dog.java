package task2.model;

import task2.model.Animal;
import task2.util.AnimalVoice;

public class Dog extends Animal {

    public Dog(String type) {
        super(type);
    }

    @Override
    public String voice() {
        return AnimalVoice.DOG_VOICE.getVoice();
    }
}
