package com.estudos.padroes.singleton;

/**
 * @author maria
 * @date 04/08/2025
 * @description Classe SessaoUsuario
 */
public class SessaoUsuario {

    private static String nomeUsuario;
    private static boolean logado;

    public void setNomeUsuario(String nome) {
        SessaoUsuario.nomeUsuario = nome;
        SessaoUsuario.logado = true;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public boolean isLogado() {
        return logado;
    }

    public void logout() {
        logado = false;
        nomeUsuario = null;
    }
}
