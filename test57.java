import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node {
    int val;
    Node left, right, next;

    Node(int val) {
        this.val = val;
    }
}

public class test57 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 };
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.print("Linked List: ");
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.print("Tree In-order: ");
        Stack<Node> stack = new Stack<>();
        Node node = root;
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            System.out.print(node.val + " ");
            node = node.right;
        }
        System.out.println();

        System.out.print("Tree Level-order: ");
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            System.out.print(temp.val + " ");
            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
                queue.add(temp.right);
        }
        System.out.println();
    }
}
