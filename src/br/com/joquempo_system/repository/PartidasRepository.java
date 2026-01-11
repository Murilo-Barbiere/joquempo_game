package br.com.joquempo_system.repository;

import br.com.joquempo_system.model.PartidaModel;
import br.com.joquempo_system.model.PlayerModel;

import java.util.ArrayList;
import java.util.List;

public class PartidasRepository {
    private List<PartidaModel> partidas = new ArrayList<>();

    public PartidasRepository() {
    }

    public void CriaPartida(PlayerModel player1, PlayerModel player2, PlayerModel vencedor){
        this.partidas.add(new PartidaModel(player1, player2, vencedor));
    }

    public PartidaModel retornaPartida(int indice){
        return this.partidas.get(indice-1);
    }
}