package main;

import main.Vetor.Vetor;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int size;
        int opcao;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a quantidade de itens da lista: ");
        size = sc.nextInt();
        Vetor vetor = new Vetor(size);

        do {
            System.out.println("\nA lista tem " + vetor.getLastIndex() + " de " + size + " itens!");
            System.out.println("1 - Inserir");
            System.out.println("2 - Remover");
            System.out.println("3 - Ver lista");
            System.out.println("4 - Sair do programa");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("Digite o item a ser inserido: ");
                    String item = sc.next();
                    vetor.add(item);
                    break;
                case 2:
                    System.out.println("Digite o item a ser removido: ");
                    int index = sc.nextInt();
                    vetor.exclude(index);
                    break;
                case 3:
                vetor.print();
                    break;
                case 4:
                    break;
                default:
                System.out.println("Opcao invalida, digite novamente.");
                break;
            }
        } while (opcao != 4);

    }
}
