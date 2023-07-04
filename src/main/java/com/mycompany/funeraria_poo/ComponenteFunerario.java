/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funeraria_poo;

/**
 *
 * @author Aluno
 */
public abstract class ComponenteFunerario {
    
    protected String descricao;
    protected double preco;
    
    public String getDescricao(){
        return descricao;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public void setPreco (double preco){
        this.preco = preco;
    }
    
}
