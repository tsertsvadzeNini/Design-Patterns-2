public class Leaf extends Component {
    private int size;

    public Leaf(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public void operation() {
        System.out.println("File: " + name + ", Size: " + size + "kb");
    }
}
