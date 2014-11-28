package org.master.alma.metricsource;

import spoon.reflect.factory.Factory;

/**
 * Created on 14/11/14.
 *
 * @author Maxime
 */
public abstract class Metric<T> {

    protected Factory factory;

    protected Metric() {}

    public Metric(Factory factory) {
        this.factory = factory;
    }

    public abstract T execute();
}
