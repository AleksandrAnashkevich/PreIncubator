package task2.model;

import task2.model.Animal;
import task2.util.AnimalVoice;

public class Cow extends Animal {

    public Cow(String type) {
        super(type);
    }

    @Override
    public String voice() {
        return AnimalVoice.COW_VOICE.getVoice();
    }
}
