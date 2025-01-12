class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class SearchBinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null)
            return null;

        if (root.val == val)
            return root;

        if (val < root.val)
            return searchBST(root.left, val);
        return searchBST(root.right, val);
    }

    public static void main(String[] args) {
        // Example BST
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        SearchBinarySearchTree searchTree = new SearchBinarySearchTree();

        int valToSearch = 2;
        TreeNode result = searchTree.searchBST(root, valToSearch);

        // Print the result
        if (result != null) {
            System.out.println("Subtree rooted at value " + valToSearch + ":");
            printInOrder(result);
        } else {
            System.out.println("Value " + valToSearch + " not found in the BST.");
        }
    }

    // Helper method for in-order traversal (prints the subtree)
    public static void printInOrder(TreeNode node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.print(node.val + " ");
            printInOrder(node.right);
        }
    }
}
