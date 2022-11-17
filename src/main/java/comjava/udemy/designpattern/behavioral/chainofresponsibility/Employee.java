package comjava.udemy.designpattern.behavioral.chainofresponsibility;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Employee implements LeaveApprover {

    private String role;

    private LeaveApprover successor;

    @Override
    public void processLeaveApplication(LeaveApplication leaveApplication) {
        if (!processRequest(leaveApplication) && successor != null) {
            successor.processLeaveApplication(leaveApplication);
        }
    }

    protected abstract boolean processRequest(LeaveApplication leaveApplication);

    @Override
    public String getApproverRole() {
        return role;
    }
}
