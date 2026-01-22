package br.com.joquempo_system.model;

public abstract class PartidaModel {
    private PlayerModel vencedor;

    public PartidaModel(PlayerModel vencedor) {
        this.vencedor = vencedor;
    }
    public PartidaModel() {}

    public PlayerModel getVencedor() {
        return vencedor;
    }
    public void setVencedor(PlayerModel vencedor) {
        this.vencedor = vencedor;
    }
}