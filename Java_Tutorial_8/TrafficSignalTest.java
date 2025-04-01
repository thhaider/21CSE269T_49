enum TrafficSignal {
    RED("Stop"),
    YELLOW("Slow down"),
    GREEN("Go");

    private final String action;
    TrafficSignal(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}

public class TrafficSignalTest {
    public static void main(String[] args) {
        TrafficSignal signal = TrafficSignal.RED;
        System.out.println(signal + ": " + signal.getAction());
    }
}
