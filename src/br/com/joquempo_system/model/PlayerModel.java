    package br.com.joquempo_system.model;

    public class PlayerModel {
        private String nome;
        private String senha;
        private int numeroVitorias;

        public PlayerModel(String nome, String senha){
            this.nome = nome;
            this.senha = senha;
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
        public String getSenha() {
            return senha;
        }
        public void setSenha(String senha) {this.senha = senha;}

        @Override
        public String toString() {
            return "Player:" + nome + "\nnumeroVitorias: " + numeroVitorias+ "\n";
        }

        public void ganhou(){
            this.numeroVitorias++;
        }
    }