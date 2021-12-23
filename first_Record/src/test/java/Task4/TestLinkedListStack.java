package Task4;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestLinkedListStack {

    private List<Integer> testData;

    @Before
    public void init() {
        testData = Arrays.asList(600, 1200, 1500, 2100);
    }

    @Test
    public void testPushPop() {
        LinkedListStack<Integer> stack = new LinkedListStack<>();
        stack.push(1200);
        stack.push(1500);
        assertEquals("1500,1200,", stack.toString());
        assertEquals(1500, (int) stack.pop());
        assertEquals("1200,", stack.toString());
    }
}
