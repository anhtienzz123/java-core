package comjava.udemy.designpattern.behavioral.chainofresponsibility;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import lombok.Data;

@Data
public class LeaveApplication {

    public enum Type {
        SICK, PTO, LOP
    }

    public enum Status {
        PENDING, APPROVED, REJECETED
    }

    private Type type;

    private LocalDate from;

    private LocalDate to;

    private String processedBy;

    private Status status;

    public LeaveApplication(Type type, LocalDate from, LocalDate to) {
        this.type = type;
        this.from = from;
        this.to = to;
        this.status = Status.PENDING;
    }

    public int getNoOfDays() {
        return (int) ChronoUnit.DAYS.between(from, to);
    }

    public void approve(String processedBy) {
        this.processedBy = processedBy;
        this.status = Status.APPROVED;
    }
}
