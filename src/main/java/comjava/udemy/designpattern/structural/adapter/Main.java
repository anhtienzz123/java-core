package comjava.udemy.designpattern.structural.adapter;

public class Main {

    public static void main(String[] args) {

        BusinessCardDesigner businessCardDesigner = new BusinessCardDesigner();

        // Class Adapter
        System.out.println("== Class Adapter");
        EmployeeClassAdapter employeeClassAdapter = new EmployeeClassAdapter();
        initializeData(employeeClassAdapter);
        String card1 = businessCardDesigner.designCard(employeeClassAdapter);
        System.out.println("card1: " + card1);

        System.out.println("== Object Adapter");
        Employee employee = new Employee();
        initializeData(employee);
        EmployeeObjectAdapter employeeObjectAdapter = new EmployeeObjectAdapter(employee);
        String card2 = businessCardDesigner.designCard(employeeObjectAdapter);
        System.out.println("card2: " + card2);
    }

    public static void initializeData(Employee employee) {
        employee.setFullName("full name");
        employee.setJobTitle("job title");
        employee.setOfficeLocation("office location");
    }
}
