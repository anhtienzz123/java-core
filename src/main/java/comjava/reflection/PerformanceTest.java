package comjava.reflection;

import comjava.reflection.gp.Cat;
import comjava.reflection.gp.Excel;

public class PerformanceTest {

    public static void main(String[] args) throws Exception {
        doRegular();
        doReflection();
    }

    public static void doRegular() throws Exception {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            Cat a = new Cat();
            a.someThing();
        }
        System.out.println("doRegular: " + (System.currentTimeMillis() - start));
    }

    public static void doReflection() throws Exception {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            Class<Cat> a = Cat.class;
            System.out.println( a.getAnnotation(Excel.class).name());
           
        }
        System.out.println("doReflection: " + (System.currentTimeMillis() - start));
    }
}
