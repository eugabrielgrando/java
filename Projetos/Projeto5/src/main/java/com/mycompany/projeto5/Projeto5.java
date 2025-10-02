/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto5;

/**
 *
 * @author gabri
 */
import javax.swing.JOptionPane;

public class Projeto5 {

    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
        int soma = 0;
        int i = n1;
        
        while (i <= n2){
          soma = soma + i;
          i++;
        }
        JOptionPane.showMessageDialog(null,"soma: " + soma);
    }
}
