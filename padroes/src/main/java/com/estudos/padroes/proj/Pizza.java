package com.estudos.padroes.proj;

import com.estudos.padroes.proj.prototype.Prototype;

/**
 * @author maria
 * @date 01/06/2025
 * @description Classe Pizza
 */
public class Pizza implements ItemCardapio, Prototype<Pizza> {

    private String sabor1;
    private String sabor2;
    private String sabor3;
    private String sabor4;
    private String tamanho;
    private boolean bordaRecheada;
    private boolean extraQueijo;
    private String descricao;
    private double preco;

    public Pizza() {

    }

    public Pizza(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public Pizza(String sabor1) {
        this.sabor1 = sabor1;
    }

    public Pizza(String sabor1, String sabor2, String sabor3, String sabor4, String tamanho, boolean bordaRecheada, boolean extraQueijo, String descricao, double preco) {
        this.sabor1 = sabor1;
        this.sabor2 = sabor2;
        this.sabor3 = sabor3;
        this.sabor4 = sabor4;
        this.tamanho = tamanho;
        this.bordaRecheada = bordaRecheada;
        this.extraQueijo = extraQueijo;
        this.descricao = descricao;
        this.preco = preco;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    public String getSabor1() {
        return sabor1;
    }

    public void setSabor1(String sabor1) {
        this.sabor1 = sabor1;
    }

    public String getSabor2() {
        return sabor2;
    }

    public void setSabor2(String sabor2) {
        this.sabor2 = sabor2;
    }

    public String getSabor3() {
        return sabor3;
    }

    public void setSabor3(String sabor3) {
        this.sabor3 = sabor3;
    }

    public String getSabor4() {
        return sabor4;
    }

    public void setSabor4(String sabor4) {
        this.sabor4 = sabor4;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isBordaRecheada() {
        return bordaRecheada;
    }

    public void setBordaRecheada(boolean bordaRecheada) {
        this.bordaRecheada = bordaRecheada;
    }

    public boolean isExtraQueijo() {
        return extraQueijo;
    }

    public void setExtraQueijo(boolean extraQueijo) {
        this.extraQueijo = extraQueijo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public Pizza clone() {
        return new Pizza(this.sabor1);
    }
}
