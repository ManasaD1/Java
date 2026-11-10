
import java.util.*;

public class test49 {
    public static void main(String[] args) {
        int vertices = 5;
        List<List<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }

        adjList.get(0).add(1);
        adjList.get(1).add(0);
        adjList.get(0).add(2);
        adjList.get(2).add(0);
        adjList.get(1).add(3);
        adjList.get(3).add(1);
        adjList.get(1).add(4);
        adjList.get(4).add(1);

        boolean[] visited = new boolean[vertices];
        Deque<Integer> stack = new ArrayDeque<>();
        int startNode = 0;

        stack.push(startNode);

        while (!stack.isEmpty()) {
            int current = stack.pop();

            if (!visited[current]) {
                visited[current] = true;
                System.out.print(current + " ");

                List<Integer> neighbors = adjList.get(current);
                for (int i = neighbors.size() - 1; i >= 0; i--) {
                    int neighbor = neighbors.get(i);
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }
}
