package by.iba.gomel;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class sends to the console question and waits 5 sec for an answer, if the answer is wrong -
 * immediately skips to the next question, if the answer is correct - exits the program.
 */
public class ConcurrencyTask2App {

    private static final Logger   LOGGER          = LoggerFactory
            .getLogger(ConcurrencyTask2App.class);
    private static final int      TEN             = 10;
    private static final int      TIME_FOR_ANSWER = 5000;

    private static QuestionAnswer currentQA       = new QuestionAnswer(null, null);

    /**
     * The method to get the currentQA.
     *
     * @return currentQA.
     */
    public static QuestionAnswer getCurrentQA() {
        return ConcurrencyTask2App.currentQA;
    }

    /**
     * The main method is used to answer the questions from the console.
     *
     * @param args
     *            - input parameters;
     */

    public static void main(final String[] args) {

        final List<QuestionAnswer> rightCombination = new ArrayList<>();
        rightCombination.add(new QuestionAnswer("How much is 2 plus 2?\n", "4"));
        rightCombination.add(new QuestionAnswer("What is paper made of?\n", "Wood"));
        rightCombination.add(new QuestionAnswer("What do we breath with?\n", "Air"));
        rightCombination.add(new QuestionAnswer("Is the Earth round?\n", "Yes"));
        rightCombination.add(new QuestionAnswer("What color the skies are?\n", "Blue"));
        rightCombination.add(new QuestionAnswer("What color the grass is?\n", "Green"));
        rightCombination
                .add(new QuestionAnswer("Which is larger: the Sun or the Earth?\n", "The Sun"));
        rightCombination.add(new QuestionAnswer("Is the Earth a star?\n", "No"));
        rightCombination.add(new QuestionAnswer("Is space endless?\n", "Yes"));
        rightCombination.add(new QuestionAnswer("How many hands do we have?\n", "2"));

        int i = 0;
        while (i < ConcurrencyTask2App.TEN) {

            ConcurrencyTask2App.LOGGER.info(rightCombination.get(i).getQuestion());
            ConcurrencyTask2App.currentQA.setQuestion(rightCombination.get(i).getQuestion());

            final Thread thread = new AnswerThread();
            thread.start();

            try {
                thread.join(ConcurrencyTask2App.TIME_FOR_ANSWER);
            } catch (final InterruptedException e) {
                ConcurrencyTask2App.LOGGER.warn("InterruptedException ", e);
                Thread.currentThread().interrupt();
            }

            thread.interrupt();

            if (rightCombination.get(i).getAnswer()
                    .equals(ConcurrencyTask2App.currentQA.getAnswer())) {
                System.exit(0);
            }

            i++;

        }

    }

    /**
     * This is a thread class for reading the answer.
     */

    public static final class AnswerThread extends Thread {

        /**
         * This method is used to update the answer.
         *
         * @param answer
         *            String parameter - new answer;
         */

        public static void updateAnswer(final String answer) {

            synchronized (ConcurrencyTask2App.class) {
                ConcurrencyTask2App.currentQA.setAnswer(answer);
            }

        }

        @Override
        public void run() {

            final Scanner input = new Scanner(new BufferedInputStream(System.in), "UTF-8");

            if (input.hasNext()) {
                AnswerThread.updateAnswer(input.nextLine());
                this.interrupt();
            } else {
                input.close();
                this.interrupt();
            }

        }

    }

}
