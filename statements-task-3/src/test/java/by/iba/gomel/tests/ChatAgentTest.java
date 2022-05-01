package by.iba.gomel.tests;

import org.junit.Assert;
import org.junit.Test;

import by.iba.gomel.ChatAgent;

/**
 * "ChatAgentTest" is a test for a "ChatAgent". It creates two objects and simulates a chat.
 */
public class ChatAgentTest {
    final ChatAgent agent1 = new ChatAgent();
    final ChatAgent agent2 = new ChatAgent();

    /**
     * "testReply" method takes two objects and sents a string text to a "reply" method, in return
     * expects a correct answer.
     */
    @Test
    public void testReply() {
        Assert.assertEquals("The answer to a Hahahah should be Bye-bye", "I don't understand",
                this.agent1.reply("Hahahah"));
        Assert.assertEquals("The answer to a Hello should be Hi!", "Hi!",
                this.agent1.reply("Hello"));
        Assert.assertEquals("The answer to a How are you? should be Been better", "Been better",
                this.agent2.reply("How are you?"));
        Assert.assertEquals("The answer to a Bye-bye should be Bye-bye", "Bye-bye",
                this.agent1.reply("Bye-bye"));
    }
}
