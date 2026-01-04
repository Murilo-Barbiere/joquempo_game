package br.com.joquempo_system.model;

public class Player {
    private String nome;
    private int numeroVitorias;

    Player(String nome, int numeroVitorias){
        this.nome = nome;
        this.numeroVitorias = numeroVitorias;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumeroVitorias() {
        return numeroVitorias;
    }
    public void setNumeroVitorias(int numeroVitorias) {
        this.numeroVitorias = numeroVitorias;
    }

    @Override
    public String toString() {
        return "Player{" +
                "nome='" + nome + '\'' +
                ", numeroVitorias=" + numeroVitorias +
                '}';
    }
}
