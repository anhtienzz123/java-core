package comjava.udemy.designpattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import lombok.ToString;

@ToString
public class ProjectLead extends AbstractEmployee {

    private List<Employee> directReports = new ArrayList<>();

    public ProjectLead(String name, List<Employee> directReports) {
        super(name);
        this.directReports = directReports;
    }

    @Override
    public Collection<Employee> getDirectReports() {
        return this.directReports;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
