package comjava.udemy.designpattern.behavioral.memento;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        WorkflowDesigner design = new WorkflowDesigner();
        LinkedList<WorkflowCommand> commands = runCommands(design);
        design.print();
        commands.removeLast().undo();
        design.print();
        commands.removeLast().undo();
        design.print();
        commands.removeLast().undo();
        design.print();
    }

    private static LinkedList<WorkflowCommand> runCommands(WorkflowDesigner workflowDesigner) {
        LinkedList<WorkflowCommand> commands = new LinkedList<>();

        WorkflowCommand cmd = new CreateCommand(workflowDesigner, "Leave workflow");
        commands.addLast(cmd);
        cmd.execute();

        cmd = new AddStepCommand(workflowDesigner, "Create Leave Application");
        commands.addLast(cmd);
        cmd.execute();

        cmd = new AddStepCommand(workflowDesigner, "Submit Application");
        commands.addLast(cmd);
        cmd.execute();

        cmd = new AddStepCommand(workflowDesigner, "Application Approved");
        commands.addLast(cmd);
        cmd.execute();

        return commands;
    }
}
