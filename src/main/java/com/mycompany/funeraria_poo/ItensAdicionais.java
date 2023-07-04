/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funeraria_poo;

/**
 *
 * @author TI - 01
 */
public abstract class ItensAdicionais extends ComponenteFunerario{
    private ComponenteFunerario componentefunerario;
    
    public ItensAdicionais (ComponenteFunerario componentefunerario){
        this.componentefunerario = componentefunerario;
    }
    
    public ComponenteFunerario getComponenteFunerario(){
        return componentefunerario;
    }
    
    @Override
    public double getPreco(){
        return this.preco + componentefunerario.getPreco();
    }
    
    @Override
    public String getDescricao(){
        return componentefunerario.getDescricao() + ", " + this.descricao;
    }
    
}
