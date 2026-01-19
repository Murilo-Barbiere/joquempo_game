package br.com.joquempo_system.model;

import java.util.Optional;

public abstract class PartidaModel {
    private Optional<PlayerModel> vencedor;

    public PartidaModel(Optional<PlayerModel> vencedor) {
        this.vencedor = vencedor;
    }

    public Optional<PlayerModel> getVencedor() {
        return vencedor;
    }
    public void setVencedor(Optional<PlayerModel> vencedor) {
        this.vencedor = vencedor;
    }
}