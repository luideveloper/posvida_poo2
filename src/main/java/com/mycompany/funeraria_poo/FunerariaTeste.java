/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funeraria_poo;

/**
 *
 * @author Aluno
 */

public class FunerariaTeste {
    public static void main(String[] args){
        
    /* Definindo os itens padrões de um plano funerário */
    ItensExistentes urna_basica = new UrnaBasica();
    ItensExistentes mortalha_basica = new MortalhaBasica();
    ItensExistentes salavelorio_basica = new SalaVelorioBasica();
    PlanoFunerarioBasico plano = new PlanoFunerarioBasico(urna_basica, mortalha_basica, salavelorio_basica);
    
    /* Imprimindo o valor e descrevendo os itens do plano*/
    System.out.println("Voce possui um plano basico");
    System.out.println("Valor total do plano: R$" + plano.getPreco() + " reais");
    System.out.println("Itens do plano: " + plano.getDescricao());

    /* Trocando a categoria dos itens do plano */
    System.out.println("\n - Voce trocou a categoria da urna do seu plano para especial");
    ItensExistentes urna_luxo = new UrnaLuxo();
    plano.setUrna(urna_luxo);
    
    System.out.println("\n - Voce trocou a categoria da mortalha do seu plano para especial");
    ItensExistentes mortalha_especial = new MortalhaEspecial();
    plano.setMortalha(mortalha_especial);
    
    System.out.println("\n - Voce trocou a categoria da sala de velorio do seu plano para especial");
    ItensExistentes salavelorio_luxo = new SalaVelorioLuxo();
    plano.setSalaVelorio(salavelorio_luxo);
    
    /* Adicionando itens externos ao plano funerário */
    System.out.println("\n - Voce adicionou o servico de tanatopraxia ao seu plano");
    ItensAdicionais itens = new Tanatopraxia(plano);
    System.out.println("\n - Voce adicionou um ramalhete de flores ao seu plano");
    itens = new RamalheteFlores(itens);
    System.out.println("\n - Voce adicionou uma coroa de flores ao seu plano");
    itens = new CoroaFlores(itens);
    
    Subject subject = new Subject();
    Observer observer1 = new NotificationSubscriber("\nResponsável familiar");
    Observer observer2 = new NotificationSubscriber("Responsável financeiro");
    
    subject.addObserver(observer1);
    subject.addObserver(observer2);

    subject.notifyObservers("\nOuve uma alteração no plano funerário\n" 
            + "Itens do seu plano atual: " + itens.getDescricao() 
            + "\nPreco atual do seu plano: " + itens.getPreco() + plano.getPreco() + " reais\n");
 
    }
}
