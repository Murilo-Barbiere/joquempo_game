package br.com.joquempo_system.repository;

import br.com.joquempo_system.model.PlayerModel;

import java.util.HashMap;
import java.util.Map;

public class PlayersRepository {
    private Map<String, PlayerModel> players = new HashMap();

    public PlayersRepository() {}

    public void add(String chave, PlayerModel player){
        this.players.put(chave, player);
    }
    public PlayerModel retornaPlayer(String nomeChave){
        return this.players.get(nomeChave);
    }
}