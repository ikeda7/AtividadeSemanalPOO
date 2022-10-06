/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veiculo;

import java.util.ArrayList;

/**
 *
 * @author lukin
 */
public class Principal {
    
    public static void main(String[] args) {
    
        Veiculo v1 = new Veiculo("Fox", "Volkswagen", 2018, 2017, "Preto", "ABC-1234", 2500.00f, false);
        Veiculo v2 = new Veiculo("Corsa", "Chevrolet", 2002, 2000, "Cinza", "WTF-7777", 500.00f, true);
        Veiculo v3 = new Veiculo("Civic", "Honda", 2020, 2019, "Amarelo", "SFD-6969", 9000.00f, false);
        
        Veiculo veiculo = new Veiculo();
        veiculo.addVeiculo(v1);
        veiculo.addVeiculo(v2);
        veiculo.addVeiculo(v3);
           
        v1.verificarStatusIPVA();
        v1.atualizarValorIPVA(12);
        v1.pagarIPVA();
        v2.verificarStatusIPVA();
        v2.atualizarValorIPVA(12);
        v2.pagarIPVA();
        v3.verificarStatusIPVA();
        v3.atualizarValorIPVA(8);
        v3.pagarIPVA();
        
        veiculo.exibirVeiculos();
    }
}
