// Adapter Class: SmartHomeToVoiceAssistantAdapter
class SmartHomeToVoiceAssistantAdapter implements VoiceAssistant {
    private SmartHomeSystem smartHomeSystem;

    public SmartHomeToVoiceAssistantAdapter(SmartHomeSystem smartHomeSystem) {
        this.smartHomeSystem = smartHomeSystem;
    }

    @Override
    public void listenAndExecuteCommand(String command) {
        String translatedCommand = translateCommand(command);

        smartHomeSystem.executeCustomProtocolCommand(translatedCommand);
    }

    private String translateCommand(String command) {
        return command;
    }
}
