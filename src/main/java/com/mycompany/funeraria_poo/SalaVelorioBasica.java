/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funeraria_poo;

/**
 *
 * @author admin
 */
public class SalaVelorioBasica implements ItensExistentes {
    String descricao = "sala velorio basica";
    double preco = 100.00;
    
    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }
}