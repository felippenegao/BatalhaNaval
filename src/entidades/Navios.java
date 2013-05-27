/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Lucy
 */
public class Navios {

    Tabuleiro tab = new Tabuleiro();

    public int[][] adicionaNavio(int linhaDestroyer, int colunaDestroyer, int linhaSubmarino, int colunaSubmarino, int linhaPortaAvioes, int colunaPortaAvioes, int[][] tabuleiro) {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro.length; j++) {
                if (tabuleiro[linhaDestroyer][colunaDestroyer] == 0) {
                    tabuleiro[linhaDestroyer - 1][colunaDestroyer - 1] = 1;
                }
            }
        }
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro.length; j++) {
                if (tabuleiro[linhaSubmarino][colunaSubmarino] == 0) {
                    tabuleiro[linhaSubmarino - 1][colunaSubmarino - 1] = 2;
                    tabuleiro[linhaSubmarino - 1][colunaSubmarino] = 2;
                }
            }
        }
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro.length; j++) {
                if (tabuleiro[linhaPortaAvioes][colunaPortaAvioes] == 0) {
                    tabuleiro[linhaPortaAvioes - 1][colunaPortaAvioes - 1] = 3;
                    tabuleiro[linhaPortaAvioes - 1][colunaPortaAvioes] = 3;
                    tabuleiro[linhaPortaAvioes - 1][colunaPortaAvioes + 1] = 3;
                }
            }
        }

        return tabuleiro;
    }
}
