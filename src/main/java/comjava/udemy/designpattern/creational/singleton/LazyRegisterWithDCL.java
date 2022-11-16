package comjava.udemy.designpattern.creational.singleton;

public class LazyRegisterWithDCL {

    private static volatile LazyRegisterWithDCL INSTANCE;
    
    private LazyRegisterWithDCL() {
        
    }
    
    public static LazyRegisterWithDCL getInstance() {
        if(INSTANCE == null) {
            synchronized (LazyRegisterWithDCL.class) {
                if(INSTANCE == null) {
                    INSTANCE = new LazyRegisterWithDCL();
                }
            }
        }
        
        return INSTANCE;
    }
}
