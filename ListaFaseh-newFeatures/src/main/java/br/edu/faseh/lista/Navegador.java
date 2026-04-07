package br.edu.faseh.lista;

import java.util.Scanner;
import java.util.Stack;

//Navegador utilizando o LIFO fist in first out
//uma pilha representa o botão voltar e outra avançar

public class Navegador {

    static Scanner scanner = new Scanner(System.in);

    // Pilha que guarda páginas anteriores
    static Stack<String> pilhaVoltar = new Stack<>();

    // Pilha que guarda páginas que podem ser avançadas
    static Stack<String> pilhaAvancar = new Stack<>();

    // Guarda qual página está aberta no momento
    static String paginaAtual = null;

    public static void menu() {

        int op;
//menu do navegador, simulando a realidade
        do {
            System.out.println("\n--- NAVEGADOR ---");
            System.out.println("Página atual: " + paginaAtual);
            System.out.println("1 - Acessar nova página");
            System.out.println("2 - Voltar");
            System.out.println("3 - Avançar");
            System.out.println("0 - Voltar");

            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1 -> acessarPagina();
                case 2 -> voltarPagina();
                case 3 -> avancarPagina();
            }

        } while (op != 0);
    }

    //Quando o usuário acessa uma nova página a página atual vai para a pilha VOLTAR, a nova página vira a página atual, a pilha AVANÇAR é limpa
    static void acessarPagina() {

        System.out.print("Digite o endereço: ");
        String novaPagina = scanner.nextLine();

        // guarda página anterior na pilha voltar
        if (paginaAtual != null) {
            pilhaVoltar.push(paginaAtual);
        }

        paginaAtual = novaPagina;

        // limpa histórico de avanço
        pilhaAvancar.clear();
    }

    static void voltarPagina() {

        if (!pilhaVoltar.isEmpty()) {

            // Guarda página atual na pilha avançar
            pilhaAvancar.push(paginaAtual);

            // Remove o topo da pilha voltar
            paginaAtual = pilhaVoltar.pop();

        } else {
            System.out.println("Não há páginas para voltar.");
        }
    }


    //Simula o botão AVANÇAR,recupera páginas que foram voltadas anteriormente.
    static void avancarPagina() {
    }
}