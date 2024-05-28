package Arvore;

public class TreeNode {
    String questionOrDiagnosis; // Pergunta ou diagnóstico
    TreeNode left, right; // Filhos esquerdo e direito

    public TreeNode(String questionOrDiagnosis) {
        this.questionOrDiagnosis = questionOrDiagnosis;
        this.left = this.right = null;
    }
}
