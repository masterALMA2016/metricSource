package org.master.alma.metricsource;

import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.factory.Factory;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Locale;

/**
 * Created by Maxime on 14/11/14.
 */
public class MethodMetric extends Metric<Double>{

    public MethodMetric(Factory factory) {
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
