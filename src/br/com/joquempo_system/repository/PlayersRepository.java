package br.com.joquempo_system.repository;

import br.com.joquempo_system.model.PlayerModel;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PlayersRepository {
    private Map<String, PlayerModel> players = new HashMap();

    public PlayersRepository() {}

    public void add(String chave, PlayerModel player){
        this.players.put(chave, player);
    }
    public Optional<PlayerModel> retornaPlayer(String nomeChave){
        return Optional.ofNullable(this.players.get(nomeChave));
    }
}