package buildStack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BuildStackTest {

    BuildStack myStack = new BuildStack();
    @Test
    public void testThatMyStackIsEmpty(){
        assertTrue(myStack.isEmpty());
    }

    @Test
    public void testThatTheNewStackSize_HasSizeZero(){
        BuildStack myStack = new BuildStack();

        assertEquals(0, myStack.size());

    }

    @Test
    public void testThatPushIncreasesTheStackSizeToOne(){
        BuildStack myStack = new BuildStack();

        myStack.push("Godwin");

        assertEquals(1, myStack.size());

    }

    @Test
    public void testThatPushingTwoElementIncreases_TheStackSizeToTwo(){
        BuildStack myStack = new BuildStack();

        myStack.push("Godwin");
        myStack.push("Buju");

        assertEquals(2, myStack.size());

    }

    @Test
    public void testThatPushingThreeElementIncreases_TheStackSizeToThree(){
        BuildStack myStack = new BuildStack();

        myStack.push("Godwin");
        myStack.push("Buju");
        myStack.push("AG");

        assertEquals(3, myStack.size());

    }

    @Test
    public void testThatPeekReturnsElementAtTheTop(){
        BuildStack myStack = new BuildStack();

        myStack.push("Godwin");
        myStack.push("Buju");
        myStack.push("AG");

        assertEquals("AG", myStack.peek());

    }

    @Test
    public void testThatWhenIPopItRemovesTheElementAtTheTop(){
        BuildStack myStack = new BuildStack();

        myStack.push("Godwin");
        myStack.push("Buju");
        myStack.push("AG");

        assertEquals("AG", myStack.pop());

        assertEquals(2, myStack.size());

    }


    @Test
    public void testThatAfterPopTheNextElementBecomesTheTop(){
        BuildStack myStack = new BuildStack();

        myStack.push("Godwin");
        myStack.push("Buju");
        myStack.push("AG");

        assertEquals("AG", myStack.pop() );

        assertEquals("Buju", myStack.peek());

        assertEquals(2, myStack.size());

    }
}


