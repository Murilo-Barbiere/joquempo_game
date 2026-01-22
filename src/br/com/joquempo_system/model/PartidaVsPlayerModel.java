package br.com.joquempo_system.model;


public class PartidaVsPlayerModel extends PartidaModel {
    private PlayerModel p1;
    private PlayerModel p2;

    public PartidaVsPlayerModel(PlayerModel p1, PlayerModel p2, PlayerModel vencedor) {
        super(vencedor);
        this.p1 = p1;
        this.p2 = p2;
    }

    public PartidaVsPlayerModel(PlayerModel p1, PlayerModel p2) {
        this.p1 = p1;
        this.p2 = p2;
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
}
