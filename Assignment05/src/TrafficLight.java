
public enum TrafficLight {
    RED(60),
    GREEN(45),
    YELLOW(5);

    private int duration; // in seconds

    // Constructor
    TrafficLight(int duration) {
        this.duration = duration;
    }

    // Getter
    public int getDuration() {
        return duration;
    }
}

