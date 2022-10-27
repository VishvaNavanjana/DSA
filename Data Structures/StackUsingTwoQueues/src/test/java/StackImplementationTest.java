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

    @Test
    void twoPopOperationsTesting() {
        //34,234,6,-345,64
        var stackImp = new StackImplementation();
        stackImp.push(34);
        stackImp.push(234);
        stackImp.push(6);
        stackImp.push(-345);
        stackImp.push(64);
        assertEquals(64,stackImp.pop());
        assertEquals(-345,stackImp.pop());
    }
}