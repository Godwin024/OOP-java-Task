package buildQueue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BuildQueueTest {

    BuildQueue myQueue;
    @BeforeEach
    void  setUp(){
        myQueue = new BuildQueue();
    }

    @Test
    public void testThatMyQueue_IsEmpty(){
        assertTrue(myQueue.isEmpty());
    }

    @Test
    public void testThatWhenIAdd_TheQueueSizeIncreases(){
        assertEquals(0, myQueue.size());

        myQueue.offer("Godwin");
        assertEquals(1, myQueue.size());


    }

    @Test
    public void testThatWhenIAddTwoMoreElement_TheQueueSizeIncreases(){
        assertEquals(0, myQueue.size());

        myQueue.offer("Godwin");
        myQueue.offer("Buju");
        myQueue.offer("AG");
        assertEquals(3, myQueue.size());


    }

    @Test
    public void testThatPeekReturnsTheHeadOfTheQueue(){
        assertEquals(0, myQueue.size());

        myQueue.offer("Godwin");
        myQueue.offer("Buju");
        myQueue.offer("AG");
        assertEquals("Godwin", myQueue.peek());


    }


    @Test
    public void testThatPollsRemovedAndReturnsTheHeadOfTheQueue(){
        assertEquals(0, myQueue.size());

        myQueue.offer("Godwin");
        myQueue.offer("Buju");
        myQueue.offer("AG");

        assertEquals("Godwin", myQueue.poll());
        assertEquals("Buju", myQueue.peek());
        assertEquals(2, myQueue.size());



    }


}
