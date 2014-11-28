package org.master.alma.metricsource;

import org.junit.Assert;
import org.junit.Test;

public class AverageClassByPackageMetricTest extends AbstractTest{

    private AverageClassByPackageMetric m;

    @Test
    public void testExecute() throws Exception {
        m = new AverageClassByPackageMetric(factory);
        double result = m.execute();
        Assert.assertEquals("Average of Class by package", 4.0, result, 0);
    }
}