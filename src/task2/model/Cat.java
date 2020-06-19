package task2.model;

import task2.model.Animal;
import task2.util.AnimalVoice;

public class Cat extends Animal {

    public Cat(String type) {
        super(type);
    }

    @Override
    public String voice() {
        return AnimalVoice.CAT_VOICE.getVoice();
    }
}
