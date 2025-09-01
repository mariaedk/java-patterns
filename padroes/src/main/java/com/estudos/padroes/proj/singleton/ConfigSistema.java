package com.estudos.padroes.proj.singleton;

/**
 * @author maria
 * @date 04/08/2025
 * @description Classe ConfigSistema
 */
public class ConfigSistema {

    private static ConfigSistema instancia;
    private String nomeRestaurante;

    private ConfigSistema() {
        this.nomeRestaurante = "Restaurante da Maria";
    }

    public static ConfigSistema getInstance() {
        if (instancia == null) {
            instancia = new ConfigSistema();
        }
        return instancia;
    }

    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }
}
