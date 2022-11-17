package comjava.udemy.designpattern.behavioral.chainofresponsibility;

public class Director extends Employee {

    public Director(LeaveApprover successor) {
        super("Director", successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication leaveApplication) {
        if (leaveApplication.getType().equals(LeaveApplication.Type.PTO)) {
            leaveApplication.approve(getApproverRole());
        }

        return false;
    }
}
