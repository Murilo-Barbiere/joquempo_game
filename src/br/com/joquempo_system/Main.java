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

        System.out.println(gameService.criaJogador("fulano", "123"));
        System.out.println(gameService.criaJogador("sla", "123"));

        while (true){
            System.out.printf(Menu.menuPrincipal());
            escolha = scanner.nextInt();
            String nome;
            String senha;

            switch (escolha) {
                //jogar
                case 1 -> {
                    System.out.printf(Menu.menuSelecaoModeJogo());
                    //VS Player = 1, VS maquina = 2.
                    escolhaModoJogo = scanner.nextInt();

                    if (escolhaModoJogo == 1) {
                        //recebe nome senha do jogador 1
                        System.out.println("digite nome do player 1: ");
                        nome = scanner.next();
                        System.out.println("digite senha do player 1: ");
                        senha = scanner.next();

                        //cria jogador 1
                        Optional<PlayerModel> optionalPlayer = gameService.logarPlayerExistente(nome, senha);
                        if(optionalPlayer.isEmpty()){
                            System.out.println("\nnome ou senha incorretos\n");
                            continue;
                        }
                        PlayerModel player1 = optionalPlayer.get();

                        //recebe nome senha do jogador 2
                        System.out.println("digite nome do player 2: ");
                        nome = scanner.next();
                        System.out.println("digite senha do player 2: ");
                        senha = scanner.next();

                        //cria jogador 2
                        optionalPlayer = gameService.logarPlayerExistente(nome, senha);
                        if(optionalPlayer.isEmpty()){
                            System.out.println("nome ou senha incorretos");
                            continue;
                        }
                        PlayerModel player2 = optionalPlayer.get();

                        //recebe jogada dos jogadores
                        System.out.println(Menu.menuDeJogada()+"jogada player 1: ");
                        int jogada1 = scanner.nextInt();
                        System.out.println(Menu.menuDeJogada()+"jogada player 2: ");
                        int jogada2 = scanner.nextInt();

                        //joga
                        Optional<PlayerModel> vencedor = gameService.partidaVsPlayer(player1, player2, jogada1, jogada2);
                        if (vencedor.isEmpty()) {
                            System.out.println("Empate!");
                            continue;
                        }
                        System.out.println("\nJogador " + vencedor.get().getNome() + " venceu!\n");
                    }
                    else{
                        //recebe nome senha do jogador
                        System.out.println("digite nome do player: ");
                        nome = scanner.next();
                        System.out.println("digite senha do player: ");
                        senha = scanner.next();

                        //cria jogador
                        Optional<PlayerModel> optionalPlayer = gameService.logarPlayerExistente(nome, senha);
                        if(optionalPlayer.isEmpty()){
                            System.out.println("\nnome ou senha incorretos\n");
                            continue;
                        }
                        PlayerModel player = optionalPlayer.get();

                        // recebe jogada
                        System.out.println(Menu.menuDeJogada()+"jogada: ");
                        int jogada = scanner.nextInt();

                        //joga
                        String resultadoPartida = gameService.partidaVsMaquina(player, escolha);
                        if(resultadoPartida.equals("empate")){
                            System.out.println("partida teve um "+resultadoPartida);
                            continue;
                        }
                        System.out.println("partida "+resultadoPartida);
                    }
                }
                //listar jogadores
                case 3 ->{
                    System.out.println("nome do jogador: ");
                    nome = scanner.next();
                    System.out.println(gameService.mostraJogadorPorNome(nome));
                }
                case 0 -> {
                    return;
                }
                default -> System.out.println("valor invalido");
            }
        }
    }
}