package br.edu.faseh.lista;

import br.edu.faseh.lista.Hospital;
import br.edu.faseh.lista.Navegador;

import java.util.Scanner;

//Essa é a classe principal onde fica o menu que separa as duas questões, 1 - navegador e 2 - o hospital

public class Main {
    //"Scanner" é utilizado para ler o que está sendo digitado no sistema
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao;
//O sistema contem as duas questões e so será finalizado ao selecionar 0
        do {
            System.out.println("\n---------- MENU PRINCIPAL ---------");
            System.out.println("1 - Navegador (Pilhas)");
            System.out.println("2 - Hospital (Fila)");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();
//dependendo da escolha, a classe correspondente e chamada
            switch (opcao) {
                case 1 -> Navegador.menu();
                case 2 -> Hospital.menu();
            }
// ou o sistema é finalizado
        } while (opcao != 0);

        System.out.println("Sistema finalizado.");
    }
}