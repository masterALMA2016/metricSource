package org.master.alma.metricsource;

import spoon.reflect.factory.Factory;

/**
 * Created by Maxime on 14/11/14.
 */
public abstract class Metric<T> {

    protected Factory factory;

    protected Metric() {}

    public Metric(Factory factory) {
        this.factory = factory;
    }

    public abstract T execute();
}
