/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto4;

/**
 *
 * @author gabri
 */
import javax.swing.JOptionPane;
public class Projeto4 {

    public static void main(String[] args) {
        double media = 0.0;
        double soma = 0.0;
        int i = 1;
        while (i<=1000){
              soma = soma + i;
        JOptionPane.showMessageDialog(null,"soma: " + soma); 
			i++;
              
             
         }
        media = soma / 1000;
        JOptionPane.showMessageDialog(null,"a média é: " + media);
    }
}
