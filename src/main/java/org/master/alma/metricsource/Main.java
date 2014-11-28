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
 * Created on 07/11/14.
 *
 * @author Maxime
 */
public class Main {

    public static void main(String[] args) {


        try {
            Launcher spoon = new Launcher();
            spoon.addInputResource(new FileSystemFolder(new File("./src/main/java/org/master/alma/metricsource/")));
            spoon.run();
            Factory factory = spoon.getFactory();
            for(CtPackage p : factory.Package().getAll()) {
                System.out.println("package: "+p.getQualifiedName());
            }
            for(CtSimpleType s : factory.Class().getAll()) {
                System.out.println("class: "+s.getQualifiedName());
                List<CtField> a = s.getFields();
                for (CtField anA : a) {
                    System.out.println("field: " + anA.getSimpleName() + " " + anA.getType().getQualifiedName());
                }

            }
            MethodMetric m = new MethodMetric(factory);
            System.out.println(m.execute());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
