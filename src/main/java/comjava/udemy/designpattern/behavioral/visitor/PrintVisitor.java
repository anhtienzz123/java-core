package comjava.udemy.designpattern.behavioral.visitor;

public class PrintVisitor implements Visitor {

    @Override
    public void visit(Programmer programmer) {
        System.out.println("programmer: " + programmer);
    }

    @Override
    public void visit(ProjectLead projectLead) {
        System.out.println("projectLead: " + projectLead);
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("manager: " + manager);
    }

    @Override
    public void visit(VicePresident vicePresident) {
        System.out.println("vicePresident: " + vicePresident);
    }
}
