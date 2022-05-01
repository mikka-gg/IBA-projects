package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import by.iba.gomel.UserActions;

public class ConcurrencyTask2AppTest {
    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    public void testNoCorrectAnswer() {
        UserActions.main(new String[] {});
        Assert.assertEquals("Should print all the questions, as there is no correct answers",
                "How much is 2 plus 2?\n" + "What is paper made of?\n" + "What do we breath with?\n"
                        + "Is the Earth round?\n" + "What color the skies are?\n"
                        + "What color the grass is?\n" + "Which is larger: the Sun or the Earth?\n"
                        + "Is the Earth a star?\n" + "Is space endless?\n"
                        + "How many hands do we have?\n",
                this.log.getLog());
    }
}
