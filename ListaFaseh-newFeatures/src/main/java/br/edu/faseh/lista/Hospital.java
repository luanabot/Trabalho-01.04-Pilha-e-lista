package br.edu.faseh.lista;

import java.util.*;



public class Hospital {

    static Scanner scanner = new Scanner(System.in);

    static Queue<String> filaPacientes = new LinkedList<>();
    static List<String> historico = new ArrayList<>();
    static int senha = 1;
    /*
     * Menu do hospital.
     * Permite gerar senhas e chamar pacientes.
     */
    public static void menu() {

        int op;

        do {
            System.out.println("\n--- HOSPITAL ---");
            System.out.println("1 - Gerar senha");
            System.out.println("2 - Chamar próximo");
            System.out.println("3 - Mostrar histórico");
            System.out.println("0 - Voltar");

            op = scanner.nextInt();

            switch (op) {
                case 1 -> gerarSenha();
                case 2 -> chamarProximo();
                case 3 -> mostrarHistorico();
            }

        } while (op != 0);
    }
    /*
     * Gera uma nova senha e adiciona no final da fila.
     */
    static void gerarSenha() {

        String novaSenha = "P" + senha++;
        filaPacientes.add(novaSenha);

        System.out.println("Senha gerada: " + novaSenha);
    }
    /*
     * Chama o próximo paciente da fila.
     * Remove o primeiro elemento (FIFO).
     */
    static void chamarProximo() {

        if (!filaPacientes.isEmpty()) {
            String atendido = filaPacientes.poll();
            // adiciona no histórico a informação
            historico.add(atendido);

            System.out.println("Chamando: " + atendido);
        } else {
            System.out.println("Fila vazia.");
        }
    }

    static void mostrarHistorico() {

        System.out.println("Histórico de chamadas:");

        for (String h : historico) {
            System.out.println(h);
        }
    }
}