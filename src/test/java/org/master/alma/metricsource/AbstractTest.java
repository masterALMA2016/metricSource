package org.master.alma.metricsource;

import org.junit.Before;
import spoon.Launcher;
import spoon.reflect.factory.Factory;
import spoon.support.compiler.FileSystemFolder;

import java.io.File;

/**
 * Created on 28/11/14.
 *
 * @author Maxime
 */
public abstract class AbstractTest {

    protected Factory factory;

    @Before
    public void setUp() throws Exception {
        Launcher spoon = new Launcher();
        spoon.addInputResource(new FileSystemFolder(new File("./src/test/java/test")));
        spoon.run();
        factory = spoon.getFactory();
    }
}
