interface VoiceAssistant {
    // Method declaration for voice response
    void respond();
}

interface ChatAssistant {
    // Method declaration for chat response
    void respond();
}

class SmartAssistant implements VoiceAssistant, ChatAssistant {
    // Overriding the respond() method to resolve conflict
    @Override
    public void respond() {
        System.out.println("SmartAssistant responding with voice and chat...");
    }

    public static void main(String[] args) {
        // Creating object of SmartAssistant
        SmartAssistant assistant = new SmartAssistant();

        // Calling the respond() method
        assistant.respond();
    }
}
