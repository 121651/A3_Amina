// Client Code
public class Main {
    public static void main(String[] args) {
        // Create an instance of the smart home system
        SmartHomeSystem smartHome = new SmartHomeSystem();

        // Create an adapter for the voice assistant
        VoiceAssistant adapter = new SmartHomeToVoiceAssistantAdapter(smartHome);

        // Use the voice assistant to control the smart home system with various commands
        adapter.listenAndExecuteCommand("Turn on the lights");
        adapter.listenAndExecuteCommand("Set thermostat to 72 degrees");
        adapter.listenAndExecuteCommand("Lock the front door");
        adapter.listenAndExecuteCommand("Play your favorite song");
        adapter.listenAndExecuteCommand("Turn off all devices");
    }
}

