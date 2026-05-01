# 🤖 AI Chatbot System (Java + Swing)

## 📌 Project Description

This project is a **Java-based AI Chatbot** developed using **Swing for GUI** and a **rule-based Natural Language Processing (NLP)** approach.

The chatbot interacts with users through a graphical interface and provides responses based on predefined keywords using simple token matching.

---

## 🎯 Objective

To design and implement a chatbot that:

* Demonstrates basic NLP techniques
* Provides real-time user interaction
* Integrates Java backend logic with a GUI interface

---

## 🛠️ Technologies Used

* **Java**
* **Swing (for GUI development)**
* **AWT (for layout and event handling)**
* **HashMap (for storing responses)**

---

## 🧠 Working Principle

The chatbot works using a **keyword-based matching system**:

1. User enters a message in the input field.
2. Input is converted to lowercase (case normalization).
3. The system checks for specific keywords using `contains()` method.
4. Based on matched keywords, a predefined response is returned.
5. If no keyword matches, a default response is displayed.

---

## 🏗️ Project Structure

```id="projstruct01"
Chatbot System
│
├── ChatbotEngine.java   // Handles NLP logic and response generation
├── ChatbotGUI.java      // Provides graphical user interface
```

---

## 📂 File Description

### 🔹 ChatbotEngine.java

* Acts as the **core logic (brain)** of the chatbot
* Uses `HashMap<String, String>` to store responses
* Implements keyword-based NLP logic
* Method:

  * `generateResponse(String userInput)` → returns chatbot reply

---

### 🔹 ChatbotGUI.java

* Builds the **user interface using Swing**
* Components used:

  * `JFrame`
  * `JTextArea` (chat display)
  * `JTextField` (user input)
  * `JButton` (send message)
  * `JScrollPane`
* Handles user interaction using **ActionListener**
* Displays conversation between user and bot

---

## 🚀 How to Run the Project

### Step 1: Compile

```bash id="compile01"
javac ChatbotEngine.java ChatbotGUI.java
```

### Step 2: Run

```bash id="run01"
java ChatbotGUI
```

---

## 💬 Sample Inputs & Outputs

| User Input   | Bot Response                                                                          |
| ------------ | ------------------------------------------------------------------------------------- |
| Hello / Hi   | Hello! I am your Java AI Assistant. How can I help you today?                         |
| Who are you? | I was created to demonstrate NLP and GUI integration in Java.                         |
| Java         | Java is a versatile, object-oriented language used for mobile and web apps.           |
| NLP          | NLP stands for Natural Language Processing—helping computers understand human speech. |
| Bye          | Goodbye! Have a great day of coding!                                                  |
| Other Input  | I'm still learning! Could you try asking about 'Java', 'NLP', or just say 'Hello'?    |

---

## 🖥️ GUI Overview

* Scrollable chat display area
* Input text field for user messages
* "Send Message" button
* Real-time interaction between user and chatbot
* Simple and clean layout using BorderLayout

---

## 📚 Learning Outcomes

* Understanding of **Java Swing GUI development**
* Implementation of **event-driven programming**
* Basic concept of **Natural Language Processing (NLP)**
* Use of **HashMap for data storage**

---

## 📌 Limitations

* Uses only keyword-based matching (no advanced NLP)
* Limited to predefined responses
* Does not learn dynamically

---

## 👨‍💻 Author

Developed as part of a **CodeAlpha Internship Task**.

---

## 📄 License

This project is for educational purposes only.
