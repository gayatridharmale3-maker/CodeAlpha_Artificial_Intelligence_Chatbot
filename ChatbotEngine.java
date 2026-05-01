import java.util.HashMap;
import java.util.Map;

/**
 * DESCRIPTION:
 * This class acts as the 'Brain' of the chatbot.
 * It implements a keyword-based ML logic to classify user intent.
 * NLP Technique: Case-normalization and Token-matching.
 */
public class ChatbotEngine {
    private final Map<String, String> responses;

    public ChatbotEngine() {
        responses = new HashMap<>();
        initializeKnowledgeBase();
    }

    // Task: Train the bot to respond to frequently asked questions
    private void initializeKnowledgeBase() {
        responses.put("greeting", "Hello! I am your Java AI Assistant. How can I help you today?");
        responses.put("purpose", "I was created to demonstrate NLP and GUI integration in Java.");
        responses.put("java", "Java is a versatile, object-oriented language used for mobile and web apps.");
        responses.put("nlp", "NLP stands for Natural Language Processing—helping computers understand human speech.");
        responses.put("bye", "Goodbye! Have a great day of coding!");
    }

    /**
     * Logic: Iterates through defined intents. 
     * If a keyword is found in the user input, the corresponding answer is returned.
     */
    public String generateResponse(String userInput) {
        String input = userInput.toLowerCase();

        if (input.contains("hi") || input.contains("hello")) return responses.get("greeting");
        if (input.contains("who") || input.contains("what are you")) return responses.get("purpose");
        if (input.contains("java")) return responses.get("java");
        if (input.contains("nlp") || input.contains("natural language")) return responses.get("nlp");
        if (input.contains("bye") || input.contains("exit")) return responses.get("bye");

        return "I'm still learning! Could you try asking about 'Java', 'NLP', or just say 'Hello'?";
    }
}