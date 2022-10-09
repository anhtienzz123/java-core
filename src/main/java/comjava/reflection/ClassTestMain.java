package comjava.reflection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClassTestMain {

    public static void main(String[] args) throws ClassNotFoundException {

        // // way obtain Class<?>
        // Product product1 = new Product();
        // Class<? extends Product> productClass1 = product1.getClass();
        // String string1 = "hello word";
        // Class<? extends String> stringClass1 = string1.getClass();
        //
        // Class<Product> productClass2 = Product.class;
        // Class<String> stringClass2 = String.class;
        // Class<Integer> intClass2 = int.class;
        //
        // // only use case: allow user custom class without recomplier: file config logger
        // Class<?> productClass3 = Class.forName("comjava.entity.product");


        // ===========
        Class<String> stringClass = String.class;

        Map<String, Integer> mapObject = new HashMap<>();

        Class<?> hashMapClass = mapObject.getClass();

        Class<?> squareClass = Class.forName("comjava.reflection.ClassTestMain$Square");

        printClassInfo(stringClass, hashMapClass, squareClass);

        var circleObject = new Drawable() {
            @Override
            public int getNumberOfCorners() {
                return 0;
            }
        };


        printClassInfo(Collection.class, boolean.class, int[][].class, Color.class,
                circleObject.getClass());
    }

    private static void printClassInfo(Class<?>... classes) {

        for (Class<?> clazz : classes) {

            System.out.println(String.format("class name : %s, class package name : %s",
                    clazz.getSimpleName(), clazz.getPackageName()));

            Class<?>[] implementedInterfaces = clazz.getInterfaces();

            for (Class<?> implementedInterface : implementedInterfaces) {
                System.out.println(String.format("class %s implements : %s", clazz.getSimpleName(),
                        implementedInterface.getSimpleName()));
            }

            System.out.println("Is array : " + clazz.isArray());
            System.out.println("Is primitive : " + clazz.isPrimitive());
            System.out.println("Is enum : " + clazz.isEnum());
            System.out.println("Is interface : " + clazz.isInterface());
            System.out.println("Is anonymous :" + clazz.isAnonymousClass());

            System.out.println();
            System.out.println();
        }
    }

    private enum Color {
        BLUE, RED, GREEN
    }

    private static interface Drawable {
        int getNumberOfCorners();
    }

    static class Square implements Drawable {

        @Override
        public int getNumberOfCorners() {
            return 4;
        }
    }
}
