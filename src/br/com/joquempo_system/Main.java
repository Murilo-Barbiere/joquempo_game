package br.com.joquempo_system;

import br.com.joquempo_system.model.PlayerModel;
import br.com.joquempo_system.services.*;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameService gameService = new GameService();

        int escolha;
        int escolhaModoJogo;
        boolean existeJogador;

        while (true){
            System.out.printf(Menu.menuPrincipal());
            escolha = scanner.nextInt();

            switch (escolha){
                case 1:
                    System.out.printf(Menu.menuSelecaoModeJogo());
                    //VS Player = 1, VS maquina = 2.
                    escolhaModoJogo = scanner.nextInt();

                    if(escolhaModoJogo == 1){
                        System.out.println("digite nome: ");
                        String nome1 = scanner.next();
                        System.out.println("digite senha: ");
                        String senha1 = scanner.next();

                        System.out.println("digite nome: ");
                        String nome2 = scanner.next();
                        System.out.println("digite senha: ");
                        String senha2 = scanner.next();

                        if(gameService.playerIsPresent(nome1) && gameService.playerIsPresent(nome2)){
                            PlayerModel player1 = gameService.logarPlayerExistente(nome1,senha1).get();
                            PlayerModel player2 = gameService.logarPlayerExistente(nome2,senha2).get();

                            System.out.println("");
                        }
                        else break;

                    }

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