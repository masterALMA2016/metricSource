package org.master.alma.metricsource;

import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.factory.Factory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 28/11/14.
 *
 * @author dralagen
 */
public class MethodByClass extends Metric<Map<String, Integer>> {

    public MethodByClass(Factory factory) {
        super(factory);
    }

    @Override
    public Map<String, Integer> execute() {

        Map<String, Integer> map = new HashMap<>();

        for(CtSimpleType s : factory.Class().getAll()) {
            Class cl = s.getActualClass();
            map.put(cl.getCanonicalName(), cl.getDeclaredMethods().length);
        }

        return map;
    }
}
