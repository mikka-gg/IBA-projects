package by.iba.gomel;

/**
 * ChatAgent is a class that contains a "reply" method. This method takes phrases and returns
 * answers to it.
 */
public class ChatAgent {
    /**
     * "reply" is a method that takes string variable and returns an answer to it.
     *
     * @param phrase
     *            - string variable
     * @return - a string variable
     */
    public String reply(final String phrase) {
        String answer;
        switch (phrase) {
            case "Hello":
                answer = "Hi!";
                break;
            case "How are you?":
                answer = "Been better";
                break;
            case "Bye-bye":
                answer = "Bye-bye";
                break;
            default:
                answer = "I don't understand";
                break;
        }
        return answer;
    }
}
