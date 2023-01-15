package comjava.udemy.designpattern.behavioral.memento;

public abstract class AbstractWorkflowCommand implements WorkflowCommand {

    protected WorkflowDesigner.Memento memento;

    protected WorkflowDesigner receiver;

    public AbstractWorkflowCommand(WorkflowDesigner workflowDesigner) {
        this.receiver = workflowDesigner;
    }

    @Override
    public void undo() {
        receiver.setMemento(memento);
    }
}
