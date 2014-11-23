package org.master.alma.metricsource;


/** 
 * Created by Maxime on 07/11/14.
 */
public class Main {
    java.lang.String a;

    int b;

    public static void main(java.lang.String[] args) {
        try {
            spoon.Launcher spoon = new spoon.Launcher();
            spoon.addInputResource(new spoon.support.compiler.FileSystemFolder(new java.io.File("/Users/Maxime/Documents/Fac/Master ALMA/S1/Vérification et Tests/metricSource/src/main/java/org/master/alma/metricsource/")));
            spoon.run();
            spoon.reflect.factory.Factory factory = spoon.getFactory();
            for (spoon.reflect.declaration.CtPackage p : factory.Package().getAll()) {
                java.lang.System.out.println(("package: " + (p.getQualifiedName())));
            }
            for (spoon.reflect.declaration.CtSimpleType s : factory.Class().getAll()) {
                java.lang.System.out.println(("class: " + (s.getQualifiedName())));
                java.util.List<spoon.reflect.declaration.CtField> a = s.getFields();
                for (int i = 0 ; i < (a.size()) ; i++) {
                    java.lang.System.out.println(((("field: " + (a.get(i).getSimpleName())) + " ") + (a.get(i).getType().getQualifiedName())));
                }
            }
            org.master.alma.metricsource.MethodMetric m = new org.master.alma.metricsource.MethodMetric(factory);
            java.lang.System.out.println(m.execute());
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}

