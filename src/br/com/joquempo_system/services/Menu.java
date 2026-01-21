package br.com.joquempo_system.services;

public class Menu {
    public static String menuPrincipal(){
        return "1 - Iniciar uma partida\n" +
                "2 - registrar novo jogador\n" +
                "2 - Listar jogadores e vitorias\n" +
                "3 - Listar partidas e seus jogadores\n" +
                "0 - sair\n" +
                "escolha: ";
    }
    public static String menuSelecaoModeJogo(){
        return "1 - vs player\n" +
                "2 - vs maquina\n";
    }
}