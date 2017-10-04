package testing;

import org.junit.Assert;
import org.junit.Test;
import refactoring.Metrics;

public class MetricsTest {
    @Test
    public void gatherPerformance()  {
        boolean result = Metrics.gatherPerformance();
        Assert.assertTrue(result);
    }

}