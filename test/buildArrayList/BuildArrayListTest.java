package buildArrayList;

import builArrayList.BuildArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BuildArrayListTest {

    BuildArrayList myList;

    @BeforeEach
    void setUp(){
        myList = new BuildArrayList();
    }

    @Test
    public void testThatGetSizeReturnsTheCorrectSize(){
        assertEquals(0,myList.size());

    }

    @Test
    public void testThatAddElementInArrayReturnsTrue(){
        assertTrue(myList.add("Godwin"));
    }

    @Test
    public void testThatAddElement_IncreasesSize_AndReturnOne(){
        assertEquals(0, myList.size());

        myList.add("Godwin");
        assertEquals(1, myList.size());

    }

    @Test
    public void testThatRemoveElement_DecreasesTheSize(){
        assertEquals(0, myList.size());

        myList.add("Godwin");
        myList.remove("Godwin");
        assertEquals(0, myList.size());

    }
    @Test
    public void testThatRemovedElement_AndItReturns_TheRemovedElement(){
        assertEquals(0, myList.size());

        myList.add("Godwin");
        myList.remove("Godwin");
        assertEquals("Godwin", myList.remove("Godwin"));

    }

    @Test
    public void testIRemovedByIndex_DecreaseSize(){
        assertEquals(0, myList.size());

        myList.add("Godwin");
        myList.add("Buju");
        myList.add("AJ");
        myList.remove(1);
        assertEquals(2, myList.size());

    }

    @Test
    public void testThat_IRemoveByIndex_ItReturnsTheRemovedElement(){
        assertEquals(0, myList.size());

        myList.add("Buju");
        myList.add("AJ");
        myList.add("Godwin");
        assertEquals("Godwin", myList.remove(2));


    }



}
