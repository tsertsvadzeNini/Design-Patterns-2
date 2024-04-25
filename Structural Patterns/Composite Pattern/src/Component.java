public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void operation();

    public void add(Component component) {
    }

    public void remove(Component component) {
    }
    public Component getChild(int index) {
        return null;
    }
}
