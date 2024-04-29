import java.util.*;

public class DepthFirstSearch implements Strategy{

    @Override
    public List<Integer> traverse(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.val);
            if (node.right != null)
                stack.push(node.right);
            if (node.left != null)
                stack.push(node.left);
        }
        display(result);
        return result;
    }

    @Override
    public void display(List<Integer> node){
        System.out.println("Traverse using DFS strategy");
        for(Integer num : node){
            System.out.print(num);
            System.out.print(", ");
        }
        System.out.println();
    }
}
