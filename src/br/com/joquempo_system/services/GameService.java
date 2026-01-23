package br.com.joquempo_system.services;

import br.com.joquempo_system.model.PartidaModel;
import br.com.joquempo_system.model.PlayerModel;
import br.com.joquempo_system.repository.PartidasRepository;
import br.com.joquempo_system.repository.PlayersRepository;
import org.w3c.dom.ls.LSOutput;

import java.util.Optional;
import java.util.Random;

public class GameService {
    PlayersRepository playersRepository = new PlayersRepository();
    PartidasRepository partidasRepository = new PartidasRepository();

    public String criaJogador(String nome, String senha){
        if(Optional.ofNullable(playersRepository.retornaPlayer(nome)).isEmpty()){
            playersRepository.add(nome,senha);
            return "jogador "+ nome + " registrado";
        }
        return "jogador "+ nome + " nao registrado";
    }

    public Optional<PlayerModel> logarPlayerExistente(String nome, String senha){
        Optional<PlayerModel> optionalPlayer = Optional.ofNullable(playersRepository.retornaPlayer(nome));

        if(optionalPlayer.isPresent() && optionalPlayer.get().getSenha().equals(senha)){
            return optionalPlayer;
        }
        return Optional.empty();
    }

    public int jogadaMaquina(){
        return new Random().nextInt(3) + 1;
    }
    //1 pedra
    //2 papel
    //3 tesoura
    public int retonaNumeroDoVencedor(int escolha1, int escolha2){
        if(escolha1 == escolha2) return 0;

        if((escolha1 % 3) + 1 == escolha2){
            return 2;
        }
        return 1;
    }
    public Optional<PlayerModel> partidaVsPlayer(PlayerModel player1, PlayerModel player2, int escolha1, int escolha2){
        int numeroDoVencedor = retonaNumeroDoVencedor(escolha1, escolha2);

        return switch (numeroDoVencedor) {
            case 1 -> {
                partidasRepository.criaPartidaVsPlayer(player1, player2, player1);
                player1.ganhou();
                yield Optional.of(player1);
            }
            case 2 -> {
                partidasRepository.criaPartidaVsPlayer(player1, player2, player2);
                player2.ganhou();
                yield Optional.of(player2);
            }
            case 0 -> {
                partidasRepository.criaPartidaVsPlayer(player1, player2);
                yield Optional.empty();
            }
            default -> Optional.empty();
        };
    }
    public String partidaVsMaquina(PlayerModel player, int escolha){
        int numeroDoVencedor = retonaNumeroDoVencedor(escolha, jogadaMaquina());

        return switch (numeroDoVencedor) {
            case 1 -> {
                partidasRepository.criaPartidaVsMaquina(player, "player");
                player.ganhou();
                yield "player";
            }
            case 2 -> {
                partidasRepository.criaPartidaVsMaquina(player, "maquina");
                yield "maquina";
            }
            case 0 -> {
                partidasRepository.criaPartidaVsMaquina(player, "empate");
                yield "empate";
            }
            default -> null;
        };
    }

    public String mostraJogadorPorNome(String nome){
        Optional<PlayerModel> optPlayer = Optional.ofNullable(playersRepository.retornaPlayer(nome));
        if(optPlayer.isEmpty()) return "jogador nao existe\n";
        return optPlayer.get().toString();
    }
}