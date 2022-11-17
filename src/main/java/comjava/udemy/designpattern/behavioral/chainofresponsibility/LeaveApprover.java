package comjava.udemy.designpattern.behavioral.chainofresponsibility;

public interface LeaveApprover {

    void processLeaveApplication(LeaveApplication leaveApplication);

    String getApproverRole();
}
