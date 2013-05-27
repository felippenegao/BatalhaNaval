/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import entidades.Navios;
import entidades.Tabuleiro;

/**
 *
 * @author Lucy
 */
public class App {
    public static void main(String[] args) {
        Tabuleiro t = new Tabuleiro();
        
        int [][] x = t.criaTabuleiro();
        
        for(int linha = 0; linha<10;linha++){
            System.out.println();
            for(int coluna=0;coluna<10;coluna++){
                System.out.print(x[linha][coluna] + " ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        Navios n = new Navios();        

        
        int [][] b = n.adicionaNavio(1, 1, 3, 3, 5, 5, x);
        
                for(int linha = 0; linha<10;linha++){
            System.out.println();
            for(int coluna=0;coluna<10;coluna++){
                System.out.print(b[linha][coluna] + " ");
            }
        }
        
        
    }
}
