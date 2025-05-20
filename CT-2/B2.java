//SmartAssistant Class with Interface Conflict
interface VoiceAssistant {
    void respond();
}

interface ChatAssistant {
    void respond();
}

class SmartAssistant implements VoiceAssistant, ChatAssistant {

    @Override
    public void respond() {
        System.out.println("SmartAssistant responding with text and voice!");
    }
}

public class AssistantApp {
    public static void main(String[] args) {
        SmartAssistant sa = new SmartAssistant();
        sa.respond(); // Resolves conflict by overriding
    }
}
