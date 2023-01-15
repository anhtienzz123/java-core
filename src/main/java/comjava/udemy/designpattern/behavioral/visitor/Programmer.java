package comjava.udemy.designpattern.behavioral.visitor;

import lombok.ToString;

@ToString
public class Programmer extends AbstractEmployee {

    private String skill;

    public Programmer(String name, String skill) {
        super(name);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
