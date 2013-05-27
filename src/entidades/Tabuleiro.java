/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Lucy
 */
public class Tabuleiro {

    private int[][] tabuleiro = new int[10][10];

    public Tabuleiro() {
    }

    public int[][] getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(int[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public int[][] criaTabuleiro() {
        for (int linha = 0; linha < this.tabuleiro.length; linha++) {
            for (int coluna = 0; coluna < this.tabuleiro.length; coluna++) {
                tabuleiro[linha][coluna] = 0;
            }
        }
        return tabuleiro;

    }

    public String checaAcerto(String palpite, Integer[][] tabuleiro) {
        String[] p = palpite.split(",");
        int linha = (Integer.valueOf(p[0]) - 1);
        int coluna = (Integer.valueOf(p[1]) - 1);

        for (int navio = 0; navio < tabuleiro.length; navio++) {
            if (linha == tabuleiro[navio][0] && coluna == tabuleiro[navio][1]) {
                return "1";
            }
        }
        return "0";
    }
}
