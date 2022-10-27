import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackImplementationTest {

    @Test
    void stackShouldPopFourFirst() {
        //7,3,4
        var stackImp = new StackImplementation();
        stackImp.push(7);
        stackImp.push(3);
        stackImp.push(4);
        assertEquals(4,stackImp.pop());
    }

    @Test
    void stackShouldPopMinusOneForEmptyStack() {
        var stackImp = new StackImplementation();
        assertEquals(-1,stackImp.pop());
    }
}