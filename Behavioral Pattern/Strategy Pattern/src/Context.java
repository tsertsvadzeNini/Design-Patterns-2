import java.util.List;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public List<Integer> executeStrategy(TreeNode node){
        return strategy.traverse(node);
    }
}
