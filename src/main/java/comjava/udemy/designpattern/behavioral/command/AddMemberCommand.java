package comjava.udemy.designpattern.behavioral.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddMemberCommand implements Command {

    private String emailAddress;

    private String listName;

    private EWSService ewsService;

    @Override
    public void execute() {
        ewsService.addMember(emailAddress, listName);
    }
}
