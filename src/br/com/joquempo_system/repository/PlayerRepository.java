package br.com.joquempo_system.repository;

import br.com.joquempo_system.model.PlayerModel;

import java.util.HashMap;
import java.util.Map;

public class PlayerRepository {
    private Map<String, PlayerModel> players = new HashMap();

    public PlayerRepository() {}

    public void add(String chave, PlayerModel player){
        this.players.put(chave, player);
    }
    public PlayerModel buscaPlayer(String nomeChave){
        return this.players.get(nomeChave);
    }
}