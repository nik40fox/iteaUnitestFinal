import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Nikolay on 12.07.2016.
 */
public class LoopVerificationTest {

    @Test
    public void testCrazyloop() throws Exception {
        LoopVerification loopVerification = new LoopVerification();

        int [] array = loopVerification.crazyloop();
        Assert.assertEquals("Expected value Y is 19", 19, array [0]);
        Assert.assertEquals("Expected value K is 19", 2, array [1]);
    }
}