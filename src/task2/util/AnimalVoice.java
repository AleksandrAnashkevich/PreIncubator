package task2.util;

public enum AnimalVoice {
    CAT_VOICE("Meow"),
    DOG_VOICE("Gav"),
    COW_VOICE("Mu"),
    CHICKEN_VOICE("Ko");

    private final String voice;

    AnimalVoice(String voice) {
        this.voice = voice;
    }

    public String getVoice() {
        return voice;
    }
}
