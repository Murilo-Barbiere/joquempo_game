package br.com.joquempo_system;

import br.com.joquempo_system.services.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameService gameService = new GameService();

        int escolha;
        int escolhaModoJogo;
        String nome;
        String senha;
        boolean existeJogador;

        while (true){
            System.out.printf(Menu.menuPrincipal());
            escolha = scanner.nextInt();
            switch (escolha){
                case 1:
                    System.out.printf(Menu.menuSelecaoModeJogo());
                    escolhaModoJogo = scanner.nextInt();

                    //player = 1, maquina = 2.
                    if(escolhaModoJogo == 1){
                        for (int i = 0; i < 2; i++) {
                            //player1
                            System.out.println("nome do jogador:");
                            nome = scanner.next();
                            //player2
                            System.out.println("senha:");
                            senha = scanner.next();

                            existeJogador = gameService.logarPlayerExistente(nome,senha);
                            if (!existeJogador){
                                System.out.println("jogador nao registrado");
                                break;
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("'-'");
                    break;
                case 0:
                    return;
                default:
                    System.out.println("valor invalido");
            }

        }


    }
}