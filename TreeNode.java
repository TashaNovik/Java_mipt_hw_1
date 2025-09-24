package hw_1;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    // Найти максимальную глубину дерева
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {

    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static int maxDepthIterative(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root); // Добавляем корень в очередь
        int depth = 0;

        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // Количество узлов на текущем уровне

            // Проходим по всем узлам текущего уровня
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll(); // Извлекаем узел

                // Добавляем дочерние узлы в очередь для обработки на следующем уровне
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            depth++; // Увеличиваем глубину после прохождения уровня
        }
        return depth;
    }

    public static void main(String[] args) {
        // 1. Создаем узлы дерева
        TreeNode root = new TreeNode(3);
        TreeNode node9 = new TreeNode(9);
        TreeNode node20 = new TreeNode(20);
        TreeNode node15 = new TreeNode(15);
        TreeNode node7 = new TreeNode(7);

        // 2. Связываем узлы между собой, чтобы построить структуру дерева
        root.left = node9;
        root.right = node20;
        node20.left = node15;
        node20.right = node7;

        // 3. Теперь, когда дерево создано, передаем его корень в наш метод
        int treeDepth = maxDepthIterative(root);

        // 4. Выводим результат на экран
        System.out.println("Максимальная глубина дерева: " + treeDepth); // Должно вывести 3
        
    }
}