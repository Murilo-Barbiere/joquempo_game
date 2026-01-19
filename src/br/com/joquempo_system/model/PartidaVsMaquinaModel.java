package br.com.joquempo_system.model;

import java.util.Optional;

public class PartidaVsMaquinaModel extends PartidaModel {
    private PlayerModel player;

    public PartidaVsMaquinaModel(PlayerModel player, Optional<PlayerModel> vencedor) {
        super(vencedor);
        this.player = player;
    }

    public PlayerModel getPlayer() {
        return player;
    }
    public void setPlayer(PlayerModel player) {
        this.player = player;
    }
}