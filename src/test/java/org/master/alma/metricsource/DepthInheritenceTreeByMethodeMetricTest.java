package org.master.alma.metricsource;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by david on 28/11/14.
 */
public class DepthInheritenceTreeByMethodeMetricTest extends AbstractTest {
       private DepthInheritenceTreeByMethodeMetric dit;

    @Test
    public void testExecute() throws Exception {
            dit = new DepthInheritenceTreeByMethodeMetric(factory);

            Map<String, Integer> result = dit.execute();

            Map<String, Integer> expected = new HashMap<>();
            expected.put("test.FakeAbstract", 0);
            expected.put("test.FakeImpl", 0);
            expected.put("test.FakeBean", 0);
            expected.put("test.FakeService", 0);
            expected.put("test.FakeImpl", 1);
            expected.put("test.FakeEnum", 1);
            expected.put("test.Fake",0);
            expected.put("test.plop.Plop", 0);
            expected.put("test.plop.PlopPlop", 0);


            Assert.assertEquals("depth in tree ", expected, result);
    }
}
