package comjava.reflection.loda;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@SuppressWarnings("deprecation")
@Deprecated
public class GirlAnnotation {

    private String name;

    public GirlAnnotation() {

    }

    public GirlAnnotation(String name) {
        this.name = name;
    }

    @Deprecated
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Girl{" + "name='" + name + '\'' + '}';
    }

    public static void main(String[] args) {
        Class<GirlAnnotation> girlClass = GirlAnnotation.class;
        System.out.println("Class: " + girlClass.getSimpleName()); // Lấy ra tên Class
        for (Annotation annotation : girlClass.getDeclaredAnnotations()) {
            System.out.println("Annotation: " + annotation.annotationType()); // Lấy ra tên các
                                                                              // Annatation trên
                                                                              // class này
        }

        for (Method method : girlClass.getDeclaredMethods()) { // Lấy ra các method của class
            System.out.println("\nMethod: " + method.getName()); // Tên method
            for (Annotation annotation : method.getAnnotations()) {
                System.out.println("Annotation: " + annotation.annotationType()); // Lấy ra tên các
                                                                                  // Annatation trên
                                                                                  // method này
            }
        }
    }
}
