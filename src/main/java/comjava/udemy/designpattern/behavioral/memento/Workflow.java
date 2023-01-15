package comjava.udemy.designpattern.behavioral.memento;

import java.util.LinkedList;
import lombok.Data;

@Data
public class Workflow {

    private String name;

    private LinkedList<String> steps;

    public Workflow(String name) {
        this.name = name;
        this.steps = new LinkedList<>();
    }

    public Workflow(String name, LinkedList<String> steps) {
        this.name = name;
        this.steps = steps;
    }

    public void addStep(String step) {
        this.steps.add(step);
    }

    public void removeStep(String step) {
        this.steps.remove(step);
    }
}
