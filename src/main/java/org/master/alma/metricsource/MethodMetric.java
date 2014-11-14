package org.master.alma.metricsource;

import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.factory.Factory;

import java.lang.reflect.Method;

/**
 * Created by Maxime on 14/11/14.
 */
public class MethodMetric implements Metric{

    private Factory factory;

    public MethodMetric(Factory factory) {
        this.factory = factory;
    }


    @Override
    public void execut() {
        for(CtSimpleType s : factory.Class().getAll()) {
            int a = s.getActualClass().getMethods().length;
            System.out.println(a);
        }
    }
}
