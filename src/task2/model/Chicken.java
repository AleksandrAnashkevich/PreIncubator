package task2.model;

import task2.model.Animal;
import task2.util.AnimalVoice;

public class Chicken extends Animal {

    public Chicken(String type) {
        super(type);
    }

    @Override
    public String voice() {
        return AnimalVoice.CHICKEN_VOICE.getVoice();
    }
}
