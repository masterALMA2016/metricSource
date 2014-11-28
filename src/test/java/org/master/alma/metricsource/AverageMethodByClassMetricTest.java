package org.master.alma.metricsource;

import org.junit.Assert;
import org.junit.Test;

public class AverageMethodByClassMetricTest extends AbstractTest{

    private AverageMethodByClassMetric m;

    @Test
    public void testExecute() throws Exception {
        m = new AverageMethodByClassMetric(factory);
        double result = m.execute();
        Assert.assertEquals("Average of Method by Class", 3.2, result, 0);
    }
}