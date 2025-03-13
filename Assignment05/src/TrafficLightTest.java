public class TrafficLightTest {
    public static void main(String[] args) {
        System.out.println("Traffic Light Durations:");

        for (TrafficLight light : TrafficLight.values()) {
            System.out.println(light + " : " + light.getDuration() + " seconds");
        }
    }
}

