package comjava.udemy.designpattern.behavioral.memento;

import java.util.LinkedList;
import lombok.Data;

@Data
public class WorkflowDesigner {

    private Workflow workflow;

    public void createWorkflow(String name) {
        workflow = new Workflow(name);
    }

    public Workflow getWorkflow() {
        return this.workflow;
    }

    public Memento getMemento() {
        if (workflow == null) {
            return new Memento();
        }

        return new Memento(workflow.getName(), new LinkedList<>(workflow.getSteps()));
    }

    public void setMemento(Memento memento) {
        if (memento.isEmpty()) {
            this.workflow = null;
            return;
        }

        this.workflow = new Workflow(memento.getName(), new LinkedList<>(memento.getSteps()));
    }

    public void addStep(String step) {
        workflow.addStep(step);
    }

    public void removeStep(String step) {
        workflow.removeStep(step);
    }

    public void print() {
        System.out.println(workflow);
    }

    @Data
    public class Memento {

        private String name;

        private LinkedList<String> steps;

        private Memento() {}

        private Memento(String name, LinkedList<String> steps) {
            this.name = name;
            this.steps = steps;
        }

        private String getName() {
            return this.name;
        }

        private LinkedList<String> getSteps() {
            return this.steps;
        }

        private boolean isEmpty() {
            return this.name == null && this.steps == null;
        }
    }
}
