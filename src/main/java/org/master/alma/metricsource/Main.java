package org.master.alma.metricsource;

import spoon.Launcher;
import spoon.reflect.declaration.CtField;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.factory.Factory;
import spoon.support.compiler.FileSystemFolder;

import java.io.File;
import java.util.List;

/**
 * Created by Maxime on 07/11/14.
 */
public class Main {

    String a;
    int b;

    public static void main(String[] args) {


        try {
            Launcher spoon = new Launcher();
            spoon.addInputResource(new FileSystemFolder(new File("/Users/Maxime/Documents/Fac/Master ALMA/S1/Vérification et Tests/metricSource/src/main/java/org/master/alma/metricsource/")));
            spoon.run();
            Factory factory = spoon.getFactory();
            for(CtPackage p : factory.Package().getAll()) {
                System.out.println("package: "+p.getQualifiedName());
            }
            for(CtSimpleType s : factory.Class().getAll()) {
                System.out.println("class: "+s.getQualifiedName());
                List<CtField> a = s.getFields();
                for(int i=0; i<a.size(); i++) {
                    System.out.println("field: "+a.get(i).getSimpleName()+" "+a.get(i).getType().getQualifiedName());
                }

            }
            MethodMetric m = new MethodMetric(factory);
            m.execut();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
