package org.master.alma.metricsource;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import spoon.Launcher;
import spoon.reflect.factory.Factory;
import spoon.support.compiler.FileSystemFolder;

import java.io.File;

public class MethodMetricTest {

    private MethodMetric m;

    @Before
    public void setUp() throws Exception {
        Launcher spoon = new Launcher();
        spoon.addInputResource(new FileSystemFolder(new File("./src/test/java/test")));
        spoon.run();
        Factory factory = spoon.getFactory();

        m = new MethodMetric(factory);
    }

    @Test
    public void testBean() {
        double result = m.execute();

        Assert.assertEquals("Number of Method by Class", 4.0, result, 0);
    }
}