import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * DESCRIPTION:
 * Provides a GUI for real-time interaction.
 * Uses a classic 'Chat Bubble' feel with a scrollable text area.
 */
public class ChatbotGUI extends JFrame {
    private JTextArea chatDisplay;
    private JTextField userInputField;
    private JButton sendButton;
    private ChatbotEngine engine;

    public ChatbotGUI() {
        engine = new ChatbotEngine();
        setupLayout();
    }

    private void setupLayout() {
        // Window Settings
        setTitle("AI Chatbot System v1.0");
        setSize(450, 550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center on screen
        setLayout(new BorderLayout(10, 10));

        // Chat Display Area
        chatDisplay = new JTextArea();
        chatDisplay.setEditable(false);
        chatDisplay.setLineWrap(true);
        chatDisplay.setWrapStyleWord(true);
        chatDisplay.setFont(new Font("SansSerif", Font.PLAIN, 14));
        chatDisplay.setBackground(new Color(245, 245, 245));
        
        JScrollPane scrollPane = new JScrollPane(chatDisplay);
        add(scrollPane, BorderLayout.CENTER);

        // Input Panel
        JPanel inputPanel = new JPanel(new BorderLayout(5, 5));
        userInputField = new JTextField();
        sendButton = new JButton("Send Message");
        
        inputPanel.add(userInputField, BorderLayout.CENTER);
        inputPanel.add(sendButton, BorderLayout.EAST);
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(inputPanel, BorderLayout.SOUTH);

        // Event Listeners
        ActionListener sendAction = e -> handleChat();
        sendButton.addActionListener(sendAction);
        userInputField.addActionListener(sendAction);

        // Initial Greeting
        chatDisplay.append("SYSTEM: Connection established. Type 'Hello' to begin.\n\n");
    }

    private void handleChat() {
        String text = userInputField.getText().trim();
        if (!text.isEmpty()) {
            chatDisplay.append("YOU: " + text + "\n");
            
            // Logic Trigger
            String response = engine.generateResponse(text);
            
            chatDisplay.append("BOT: " + response + "\n\n");
            userInputField.setText("");
        }
    }

    public static void main(String[] args) {
        // Ensure UI runs on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            new ChatbotGUI().setVisible(true);
        });
    }
}