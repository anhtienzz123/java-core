package comjava.udemy.designpattern.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class UIMediator {

    private List<UIControl> colleagues = new ArrayList<>();

    public void register(UIControl uiControl) {
        colleagues.add(uiControl);
    }

    public void valueChanged(UIControl uiControl) {
        this.colleagues.stream().filter(ele -> !ele.equals(uiControl))
                .forEach(ele -> ele.controlChanged(uiControl));
    }
}
