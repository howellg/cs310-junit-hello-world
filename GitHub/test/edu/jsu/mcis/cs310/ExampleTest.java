package edu.jsu.mcis.cs310;
import org.junit.*;

import static org.junit.Assert.*;

public class ExampleTest {

    private Main main;
    private StringBuilder expectedGreeting,expectedMessage, expectedReverseGreeting, expectedReverseMessage;
    private StringBuilder expectedReverse1, expectedReverse2, expectedReverse3;
    
    @Before
    public void setUp() {
        main = new Main();
        expectedGreeting = new StringBuilder("Hello, World!");
        expectedReverseGreeting = new StringBuilder("!dlroW ,olleH");
        expectedMessage = new StringBuilder("Hello Everyone!");
        expectedReverseMessage = new StringBuilder("!enoyrevE olleH");
        expectedReverse1 = new StringBuilder("topaeT elttiL a m'I");
        expectedReverse2 = new StringBuilder("elddiD elddiD yeH");
        expectedReverse3 = new StringBuilder("kcoD yrokciD yrokciH");
    }
        
    @Test
    public void testGreeting() {
        StringBuilder actual = main.getGreeting();
        assertEquals(expectedGreeting.toString(), actual.toString());
    }
    
    @Test
    public void testReverseGreeting() {
        StringBuilder actual = main.reverse(expectedGreeting);
        assertEquals(expectedReverseGreeting.toString(), actual.toString());
    }
        @Test
    public void testMessage() {
        StringBuilder actual = main.getUserMessage();
        assertEquals(expectedMessage.toString(), actual.toString());
    }
    
    @Test
    public void testReverseMessage() {
        StringBuilder actual = main.reverse(expectedMessage);
        assertEquals(expectedReverseMessage.toString(), actual.toString());
    }
    
    @Test
    public void testReverseMessage1() {
        StringBuilder actual = main.reverse(new StringBuilder("I'm a Little Teapot"));
        assertEquals(expectedReverse1.toString(), actual.toString());
    }
    
    @Test
    public void testReverseMessage2() {
        StringBuilder actual = main.reverse(new StringBuilder("Hey Diddle Diddle"));
        assertEquals(expectedReverse2.toString(), actual.toString());
    }
    
    @Test
    public void testReverseMessage3() {
        StringBuilder actual = main.reverse(new StringBuilder("Hickory Dickory Dock"));
        assertEquals(expectedReverse3.toString(), actual.toString());
    }
    
}
