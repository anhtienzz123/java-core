package comjava.udemy.designpattern.behavioral.chainofresponsibility;

public class Manager extends Employee {

    public Manager(LeaveApprover successor) {
        super("Manager", successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication leaveApplication) {

        switch (leaveApplication.getType()) {
            case SICK:
                leaveApplication.approve(getApproverRole());
                return true;
            case PTO:
                if (leaveApplication.getNoOfDays() <= 5) {
                    leaveApplication.approve(getApproverRole());
                    return true;
                }
            default:
                break;
        }

        return false;
    }
}
