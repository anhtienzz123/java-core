package comjava.udemy.designpattern.behavioral.chainofresponsibility;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        LeaveApplication leaveApplication = new LeaveApplication(LeaveApplication.Type.SICK,
                LocalDate.now(), LocalDate.now().plusDays(10));
        System.out.println("leaveApplication: " + leaveApplication);

        LeaveApprover approver = createChain();
        approver.processLeaveApplication(leaveApplication);
        System.out.println("after process: " + leaveApplication);
    }

    private static LeaveApprover createChain() {
        Director director = new Director(null);
        Manager manager = new Manager(director);
        ProjectLead projectLead = new ProjectLead(manager);
        return projectLead;
    }
}
