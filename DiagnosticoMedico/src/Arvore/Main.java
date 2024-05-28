package Arvore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de diagnóstico médico.");
        System.out.print("Por favor, insira seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Agora, insira sua data de nascimento (DD/MM/AAAA): ");
        String dataNascimento = scanner.nextLine();

        BinaryTree tree = new BinaryTree();

        // Inserindo perguntas e diagnósticos
//        tree.insert("Sintoma inicial: Febre", "Dor de cabeça?", "Tosse?");
//        tree.insert("Dor de cabeça?", "Gripe", "Resfriado");
//        tree.insert("Tosse?", "Bronquite", "Pneumonia");
//        
        tree.insert("Sintoma inicial: Dor no corpo", "Dor muscular?", "Dor nas articulações?");
        tree.insert("Dor muscular?", "Distensão muscular", "Lesão muscular");
        tree.insert("Dor nas articulações?", "Artrite reumatoide", "Lúpus");

        // Realizando o diagnóstico
        System.out.println("\nIniciando diagnóstico para " + nome + "...");
        tree.diagnose();


        scanner.close();
    }
}
