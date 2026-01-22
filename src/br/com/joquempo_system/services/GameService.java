package br.com.joquempo_system.services;

import br.com.joquempo_system.model.PartidaModel;
import br.com.joquempo_system.model.PlayerModel;
import br.com.joquempo_system.repository.PartidasRepository;
import br.com.joquempo_system.repository.PlayersRepository;

import java.util.Optional;
import java.util.Random;

public class GameService {
    PlayersRepository playersRepository = new PlayersRepository();
    PartidasRepository partidasRepository = new PartidasRepository();

    public void registrarNovoPlayer(String nome, String senha){
        this.playersRepository.add(nome, new PlayerModel(nome, senha));
    }

    public Optional<PlayerModel> logarPlayerExistente(String nome, String senha){
        Optional<PlayerModel> optionalPlayer = playersRepository.retornaPlayer(nome);

        if(optionalPlayer.isPresent() && optionalPlayer.get().getSenha().equals(senha)){
            return optionalPlayer;
        }
        return Optional.empty();
    }

    public boolean playerIsPresent(String nome){
        return playersRepository.retornaPlayer(nome).isPresent();
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
    public void partidaVsPlayer(PlayerModel player1, PlayerModel player2, int escolha1, int escolha2){
        int numeroDoVencedor = retonaNumeroDoVencedor(escolha1, escolha2);

        if(numeroDoVencedor == 1){
            partidasRepository.criaPartidaVsPlayer(player1, player2, player1);
        }

    }
}