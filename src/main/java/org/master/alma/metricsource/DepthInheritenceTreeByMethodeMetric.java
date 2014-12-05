package org.master.alma.metricsource;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.factory.Factory;


import java.util.HashMap;

/**
 * Created on 28/11/14.
 *
 * @author david
 */
public class DepthInheritenceTreeByMethodeMetric extends Metric< HashMap<String,Integer>> {

    public DepthInheritenceTreeByMethodeMetric(Factory factory){ super(factory);}

    @Override
    public HashMap<String,Integer> execute() {
        HashMap<String,Integer>depthRes= new HashMap<>();
           Class parent;

        for(CtSimpleType s: factory.Class().getAll()){
                int profondeur=0;
                parent= s.getActualClass().getSuperclass();

            while( parent != null && parent != java.lang.Object.class && parent !=java.lang.Enum.class){

                profondeur +=1;
                parent = parent.getSuperclass();
            }

            depthRes.put(s.getQualifiedName(),profondeur);
            // System.out.println(s.getQualifiedName()+" de profondeur :"+profondeur);

        }
        return depthRes;
    }
}
