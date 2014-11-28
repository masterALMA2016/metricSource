package org.master.alma.metricsource;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MethodByClassTest extends AbstractTest {

    @Test
    public void testExecute () throws Exception {
        MethodByClass m = new MethodByClass(factory);

        Map<String, Integer> result = m.execute();

        Map<String, Integer> expected = new HashMap<>();
        expected.put("test.Fake", 4);
        expected.put("test.FakeAbstract", 3);
        expected.put("test.FakeBean", 4);
        expected.put("test.FakeEnum", 2);
        expected.put("test.FakeImpl", 3);
        expected.put("test.FakeService", 2);

        expected.put("test.plop.Plop", 0);
        expected.put("test.plop.PlopPlop", 0);


        Assert.assertEquals("Avarage Method by Class", expected, result);

    }
}