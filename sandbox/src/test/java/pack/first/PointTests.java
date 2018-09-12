package pack.first;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testDistanceTo() {
        Point a = new Point(1, 1);
        Point b = new Point(2.5, 1);
        Assert.assertEquals(a.distanceTo(b), 1.5);
    }
}
