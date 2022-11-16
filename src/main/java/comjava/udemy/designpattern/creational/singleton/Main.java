package comjava.udemy.designpattern.creational.singleton;

public class Main {

    public static void main(String[] args) {
        System.out.println("== eager");
        EagerRegistry eagerRegistry1 = EagerRegistry.getInstance();
        EagerRegistry eagerRegistry2 = EagerRegistry.getInstance();
        System.out.println(eagerRegistry1.equals(eagerRegistry2));
        
        System.out.println("== lazy with DCL");
        LazyRegisterWithDCL lazyRegisterWithDCL1 = LazyRegisterWithDCL.getInstance(); 
        LazyRegisterWithDCL lazyRegisterWithDCL2 = LazyRegisterWithDCL.getInstance(); 
        System.out.println(lazyRegisterWithDCL1.equals(lazyRegisterWithDCL2));
        
        System.out.println("== lazy IODH");
        LazyRegisterIODH lazyRegisterIODH1 = LazyRegisterIODH.getInstance();
        LazyRegisterIODH lazyRegisterIODH2 = LazyRegisterIODH.getInstance();
        System.out.println(lazyRegisterIODH1.equals(lazyRegisterIODH2));
    }
}
