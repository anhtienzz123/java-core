package comjava.structure.adapter;

public class Main {

    public static void main(String[] args) {

        // use class adapter
        EmployeeClassAdapter employeeClassAdapter = new EmployeeClassAdapter();
        employeeClassAdapter.setFullName("fullNameClassAdapter");
        employeeClassAdapter.setJobTitle("jobTitleClassAdapter");
        employeeClassAdapter.setOfficeLocation("officeLocationClassAdapter");

        BusinessCardDesigner businessCardDesigner = new BusinessCardDesigner();
        String card = businessCardDesigner.designCard(employeeClassAdapter);
        System.out.println("cardClassAdapter: " + card);

        // use object adapter
        Employee employee = new Employee("fullNameObjectAdapter", "jobTitleObjectAdapter",
                "officeLocationObjectAdapter");
        EmployeeObjectAdapter employeeObjectAdapter = new EmployeeObjectAdapter(employee);

        BusinessCardDesigner businessCardDesigner2 = new BusinessCardDesigner();
        String car2 = businessCardDesigner2.designCard(employeeObjectAdapter);
        System.out.println("cardObjectAdapter: " + car2);
    }
}
