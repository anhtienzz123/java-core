package comjava.udemy.designpattern.behavioral.command;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        EWSService ewsService = new EWSService();

        Command command1 = new AddMemberCommand("email1@gmail.com", "listname1", ewsService);
        MailTasksRunner.getInstance().addCommand(command1);

        Command command2 = new AddMemberCommand("email2@gmail.com", "listname2", ewsService);
        MailTasksRunner.getInstance().addCommand(command2);

        Thread.sleep(3000);
        MailTasksRunner.getInstance().shutdown();
    }
}
