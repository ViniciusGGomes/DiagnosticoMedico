package Arvore;

import java.util.Scanner;

public class BinaryTree {
	private TreeNode root; // Raiz da árvore

    public BinaryTree() {
        root = null; // Inicialmente, a árvore está vazia
    }

    // Método para inserir uma pergunta ou diagnóstico na árvore
    public void insert(String parent, String leftChild, String rightChild) {
        if (root == null) {
            root = new TreeNode(parent);
            root.left = new TreeNode(leftChild);
            root.right = new TreeNode(rightChild);
        } else {
            insertRec(root, parent, leftChild, rightChild);
        }
    }

    // Método recursivo para inserir uma pergunta ou diagnóstico na árvore
    private void insertRec(TreeNode root, String parent, String leftChild, String rightChild) {
        if (root == null) {
            return;
        }
        if (root.questionOrDiagnosis.equals(parent)) {
            root.left = new TreeNode(leftChild);
            root.right = new TreeNode(rightChild);
        } else {
            insertRec(root.left, parent, leftChild, rightChild);
            insertRec(root.right, parent, leftChild, rightChild);
        }
    }

    // Método para exibir a árvore de forma mais organizada
    public void display() {
        System.out.println("Árvore de Diagnóstico:");
        displayRec(root, 0);
        System.out.println();
    }

    // Método recursivo para exibir a árvore
    private void displayRec(TreeNode root, int level) {
        if (root != null) {
            displayRec(root.right, level + 1); // Exibe a subárvore da direita
            for (int i = 0; i < level; i++) {
                System.out.print("   "); // Indenta os nós conforme o nível
            }
            System.out.println(root.questionOrDiagnosis); // Exibe o nó atual
            displayRec(root.left, level + 1); // Exibe a subárvore da esquerda
        }
    }

    // Método para realizar o diagnóstico
    public void diagnose() {
        diagnoseRec(root);
    }

    // Método recursivo para realizar o diagnóstico
    private void diagnoseRec(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            System.out.println("Diagnóstico: " + root.questionOrDiagnosis);
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println(root.questionOrDiagnosis + " (Sim/Não)");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Sim")) {
            diagnoseRec(root.left);
        } else {
            diagnoseRec(root.right);
        }
    }

}
