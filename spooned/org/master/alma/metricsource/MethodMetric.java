package org.master.alma.metricsource;


/** 
 * Created by Maxime on 14/11/14.
 */
public class MethodMetric extends org.master.alma.metricsource.Metric<java.lang.Double> {
    public MethodMetric(spoon.reflect.factory.Factory factory) {
        super(factory);
    }

    @java.lang.Override
    public java.lang.Double execute() {
        int nb = 0;
        java.lang.Double nbMethod = 0.0;
        for (spoon.reflect.declaration.CtSimpleType s : factory.Class().getAll()) {
            nbMethod += s.getActualClass().getDeclaredMethods().length;
            nb++;
        }
        return nbMethod / nb;
    }
}

