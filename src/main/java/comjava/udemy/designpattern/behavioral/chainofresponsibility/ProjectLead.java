package comjava.udemy.designpattern.behavioral.chainofresponsibility;

public class ProjectLead extends Employee {

    public ProjectLead(LeaveApprover successor) {
        super("Project Lead", successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication leaveApplication) {
        if (leaveApplication.getType().equals(LeaveApplication.Type.SICK)) {
            if (leaveApplication.getNoOfDays() <= 2) {
                leaveApplication.approve(getApproverRole());
                return true;
            }
        }

        return false;
    }
}
