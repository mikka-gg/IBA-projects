package by.iba.gomel;

/**
 * This class contains a question and answer.
 */
public class QuestionAnswer {
    private String question;
    private String answer;

    /**
     * Default constructor to take the question and answer.
     *
     * @param question
     *            String parameter - question;
     * @param answer
     *            String parameter - answer;
     */
    public QuestionAnswer(final String question, final String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getAnswer() {
        return this.answer;
    }

    public String getQuestion() {
        return this.question;
    }

    public void setAnswer(final String answer) {
        this.answer = answer;
    }

    public void setQuestion(final String question) {
        this.question = question;
    }

}
