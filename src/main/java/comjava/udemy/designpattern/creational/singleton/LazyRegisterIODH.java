package comjava.udemy.designpattern.creational.singleton;

public class LazyRegisterIODH {

    private LazyRegisterIODH() {
        System.out.println("initialzie LazyRegisterIODH");
    }

    private static class RegistryHolder {
        static LazyRegisterIODH INSTANCE = new LazyRegisterIODH();
    }

    public static LazyRegisterIODH getInstance() {
        return RegistryHolder.INSTANCE;
    }
}
