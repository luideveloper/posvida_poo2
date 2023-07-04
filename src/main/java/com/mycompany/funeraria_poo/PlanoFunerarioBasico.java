/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funeraria_poo;

/**
 *
 * @author Aluno
 */
public class PlanoFunerarioBasico extends ComponenteFunerario{
    
    private ItensExistentes urna;
    private ItensExistentes mortalha;
    private ItensExistentes salavelorio;
    
    public PlanoFunerarioBasico (ItensExistentes urna, ItensExistentes mortalha, ItensExistentes salavelorio) {
        this.urna = urna;
        this.mortalha = mortalha;
        this.salavelorio = salavelorio;
    }
    
    public double getPreco() {
        return urna.getPreco() + mortalha.getPreco() + salavelorio.getPreco();
    }

    @Override
    public String getDescricao() {
        return urna.getDescricao() + ", " + mortalha.getDescricao() + ", " + salavelorio.getDescricao();
    }

    public void setUrna(ItensExistentes urna) {
        this.urna = urna;
    }

    public void setMortalha(ItensExistentes mortalha) {
        this.mortalha = mortalha;
    }

    public void setSalaVelorio(ItensExistentes salavelorio) {
        this.salavelorio = salavelorio;
    }
    
}
