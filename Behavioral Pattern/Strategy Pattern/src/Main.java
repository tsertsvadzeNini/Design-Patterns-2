public class Main {
    public static void main(String[] args) {
        Strategy strategy1 = new DepthFirstSearch();
        Context context = new Context(strategy1);

        Strategy strategy2 = new DepthFirstSearch();
        Context context1 = new Context(strategy1);

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.right = new TreeNode(6);
        root.left.right.right.right = new TreeNode(7);

        context.executeStrategy(root);
        context1.executeStrategy(root);
    }
}