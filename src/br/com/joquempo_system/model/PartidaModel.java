package br.com.joquempo_system.model;

public class PartidaModel {
    private PlayerModel p1;
    private PlayerModel p2;
    private PlayerModel vencedor;

    public PartidaModel(PlayerModel p1, PlayerModel p2, PlayerModel vencedor) {
        this.p1 = p1;
        this.p2 = p2;
        this.vencedor = vencedor;
    }

    public PlayerModel getP1() {
        return p1;
    }
    public void setP1(PlayerModel p1) {
        this.p1 = p1;
    }

    public PlayerModel getP2() {
        return p2;
    }
    public void setP2(PlayerModel p2) {
        this.p2 = p2;
    }

    public PlayerModel getVencedor() {return vencedor;}
    public void setVencedor(PlayerModel vencedor) {this.vencedor = vencedor;}
}