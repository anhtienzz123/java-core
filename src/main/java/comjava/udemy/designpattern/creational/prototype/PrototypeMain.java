package comjava.udemy.designpattern.creational.prototype;

public class PrototypeMain {

    public static void main(String[] args) throws CloneNotSupportedException {
        SwordsMan swordsMan = new SwordsMan();
        System.out.println("default swordsMan: " + swordsMan);
        
        swordsMan.move(1, 1);
        swordsMan.setState(CombatMechanism.ATTACK);
        System.out.println("change swordsMan: " + swordsMan);
        
        SwordsMan cloneSwordsMan = (SwordsMan) swordsMan.clone();
        System.out.println("cloneSwordsMan: " + cloneSwordsMan);
      
    }
}
