package org.master.alma.metricsource;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ClassByPackageMetricTest extends AbstractTest{

    private ClassByPackageMetric m;

    @Test
    public void testExecute() throws Exception {
        m = new ClassByPackageMetric(factory);
        Map<String,Integer> result = m.execute();
        Map<String,Integer> test = new HashMap<>();
        test.put("test", 6);
        test.put("test.plop", 2);
        Assert.assertEquals("Average of Class by package", test, result);
    }
}