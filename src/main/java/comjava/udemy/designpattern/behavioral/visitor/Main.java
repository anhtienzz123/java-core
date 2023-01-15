package comjava.udemy.designpattern.behavioral.visitor;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee employee = buildOrganization();
        Visitor visitor = new PrintVisitor();
        visitOrganizationStructure(employee, visitor);
    }

    private static Employee buildOrganization() {
        Programmer p1 = new Programmer("p1", "skill1");
        Programmer p2 = new Programmer("p2", "skill2");

        Programmer p3 = new Programmer("p3", "skill3");
        Programmer p4 = new Programmer("p4", "skill4");

        ProjectLead pl1 = new ProjectLead("pl1", Arrays.asList(p1, p2));
        ProjectLead pl2 = new ProjectLead("pl2", Arrays.asList(p3, p4));

        Manager m1 = new Manager("m1", Arrays.asList(pl1));
        Manager m2 = new Manager("m2", Arrays.asList(pl2));

        VicePresident vp = new VicePresident("vp", Arrays.asList(m1, m2));

        return vp;
    }

    private static void visitOrganizationStructure(Employee employee, Visitor visitor) {
        employee.accept(visitor);
        employee.getDirectReports().forEach(ele -> visitOrganizationStructure(ele, visitor));
    }
}
