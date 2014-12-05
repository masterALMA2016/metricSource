package org.master.alma.metricsource;

import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.factory.Factory;

/**
 * Created on 28/11/14.
 *
 * @author Maxime
 */
public class AverageClassByPackageMetric extends Metric<Double> {

    public AverageClassByPackageMetric(Factory factory) {
        super(factory);
    }

    @Override
    public Double execute() {
        int nb = 0;
        Double nbMethod = 0.0;
        for(CtPackage p : factory.Package().getAll()) {
            if(p.getTypes().size() != 0) {
                nbMethod += p.getTypes().size();
                nb++;
            }
        }
        return nbMethod/nb;
    }
}
