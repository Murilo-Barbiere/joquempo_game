package br.com.joquempo_system.model;

public class PartidaVsMaquinaModel extends PartidaModel {
    private PlayerModel player;
    private String vencedor;

    public PartidaVsMaquinaModel(PlayerModel player, String maquinaGanhou) {
        this.player = player;
        this.vencedor = maquinaGanhou;
    }

    public PartidaVsMaquinaModel(PlayerModel player) {
        this.player = player;
    }

    public String getVencedor() {
        return vencedor;
    }

    public void setMaquinaGanhou(String maquinaGanhou) {
        this.vencedor = maquinaGanhou;
    }

    public PlayerModel getPlayer() {
        return player;
    }
    public void setPlayer(PlayerModel player) {
        this.player = player;
    }
}