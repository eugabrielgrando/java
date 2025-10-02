/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto1;

/**
 *
 * @author gabri
 */

import javax.swing.JOptionPane;

public class Projeto1 {

    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("digite uma frase");
        int repetição = Integer.parseInt(JOptionPane.showInputDialog("quantas vezes se repetirar"));
        
        for (int i = 1; i <= repetição;i++){
            JOptionPane.showMessageDialog(null, frase);
        }
    }
}
