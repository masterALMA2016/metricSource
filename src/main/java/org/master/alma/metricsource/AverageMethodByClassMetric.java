package org.master.alma.metricsource;

import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.factory.Factory;

/**
 * Created on 14/11/14.
 *
 * @author Maxime
 */
public class AverageMethodByClassMetric extends Metric<Double>{

    public AverageMethodByClassMetric(Factory factory) {
        super(factory);
    }

    @Override
    public Double execute() {
        int nb = 0;
        Double nbMethod = 0.0;
        for(CtSimpleType s : factory.Class().getAll()) {
            nbMethod += s.getActualClass().getDeclaredMethods().length;
            nb++;
        }
        return nbMethod/nb;
    }
}
