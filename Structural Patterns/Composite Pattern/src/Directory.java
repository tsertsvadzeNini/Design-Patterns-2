import java.util.ArrayList;
import java.util.List;

public class Directory extends Component {
    private List<Component> contents = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    @Override
    public void operation() {
        System.out.println("Directory: " + name);
        for (Component component : contents) {
            component.operation();
        }
    }

    @Override
    public void add(Component component) {
        contents.add(component);
    }

    @Override
    public void remove(Component component) {
        contents.remove(component);
    }

    @Override
    public Component getChild(int index) {
        if (index >= 0 && index < contents.size()) {
            return contents.get(index);
        }
        return null;
    }
}
