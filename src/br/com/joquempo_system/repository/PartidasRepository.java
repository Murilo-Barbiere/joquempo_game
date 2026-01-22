package br.com.joquempo_system.repository;

import br.com.joquempo_system.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PartidasRepository {
    private List<PartidaModel> partidas = new ArrayList<>();

    public void criaPartidaVsPlayer(PlayerModel player1, PlayerModel player2, PlayerModel vencedor){
        this.partidas.add(new PartidaVsPlayerModel(player1, player2, vencedor));
    }
    public void criaPartidaVsPlayer(PlayerModel player1, PlayerModel player2){
        this.partidas.add(new PartidaVsPlayerModel(player1, player2));
    }

    public void criaPartidaVsMaquina(PlayerModel Player, PlayerModel vencedor){
        this.partidas.add(new PartidaVsMaquinaModel(Player, vencedor));
    }
    public void criaPartidaVsMaquina(PlayerModel Player){
        this.partidas.add(new PartidaVsMaquinaModel(Player));
    }

    public PartidaModel retornaPartida(int indice){
        return this.partidas.get(indice-1);
    }
}