package org.master.alma.metricsource;


/** 
 * Created by Maxime on 14/11/14.
 */
public abstract class Metric<T> {
    protected spoon.reflect.factory.Factory factory;

    protected Metric() {
    }

    public Metric(spoon.reflect.factory.Factory factory) {
        this.factory = factory;
    }

    public abstract T execute();
}

