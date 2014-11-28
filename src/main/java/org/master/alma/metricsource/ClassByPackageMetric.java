package org.master.alma.metricsource;

import spoon.reflect.declaration.CtPackage;
import spoon.reflect.factory.Factory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Maxime on 28/11/14.
 */
public class ClassByPackageMetric extends Metric<Map<String, Integer>> {

    public ClassByPackageMetric(Factory factory) {
        super(factory);
    }

    @Override
    public Map<String, Integer> execute() {
        Map<String, Integer> result = new HashMap<String, Integer>();
        for(CtPackage p : factory.Package().getAll()) {
            if(p.getTypes().size() != 0) {
                result.put(p.getQualifiedName(),p.getTypes().size());
            }
        }
        return result;
    }
}
