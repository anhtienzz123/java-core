package comjava.udemy.designpattern.behavioral.visitor;

import java.util.Collection;

public interface Employee {

    int getPerformanceRating();

    void setPerformanceRating(int rating);

    Collection<Employee> getDirectReports();

    int getEmployeeId();

    String getEmployeeName();

    void accept(Visitor visitor);
}
