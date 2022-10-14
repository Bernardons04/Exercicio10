/*10.Faça um programa que leia um vetor de 12 posições e verifique
se existem valores iguais e os escreva na tela, inclusive seu
posicionamento. Demonstre quando não há valores iguais.*/
package com.mycompany.exercicio010;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Exercicio010 {
    public static void main(String[] args) {
        int valor [] = new int[12];
        int p;
        for (int c = 0; c <= valor.length-1; c++) {
            p = c+1;
            valor [c] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + p + "º valor: "));
        }
        for (int c = 0; c <= valor.length-1; c++) {
            for (int t = 1; t <= valor.length-1; t++) {
                if (c == t) {
                    break;
                } else if (valor[c] == valor[t]) {
                    JOptionPane.showMessageDialog(null, "O valor na posição " + c + " é igual ao valor na posição " + t);
                }
            }
        }
        Arrays.sort(valor);
        for (int c = 1; c <= valor.length-1; c++) {
            if (valor[c-1] == valor[c] || valor[c] == valor[c+1]) {
                
            } else {
                JOptionPane.showMessageDialog(null, "O valor " + valor[c] + " não possui valores iguais!");     
            }
        }
    }
}
