package com.wordpress.williamcosta303.jogo;

import javax.swing.JOptionPane;

public class VCartas {

    final private String versao;

    public VCartas() {
        this.versao = "1.0";
    }

    public String getVersao() {
        return versao;
    }

    public void creditos() {
        JOptionPane
                // Exibe os créditos
                .showMessageDialog(
                null,
                "High/low card game (v. "
                + this.versao
                + ")\nProgrammed by: William A. Costa\nwilliamcosta303.wordpress.com\n\nHope you had a good game! :)");
    }

    public String randNomePadrao() {
        int randNum = (int) 1 + (int) (Math.random() * 6);
        String randNome;
        if (randNum == 1) {
            randNome = "William";
        } else if (randNum == 2) {
            randNome = "Elisabete";
        } else if (randNum == 3) {
            randNome = "Joseph";
        } else if (randNum == 4) {
            randNome = "Amanda";
        } else if (randNum == 5) {
            randNome = "Nicholas";
        } else {
            randNome = "Terence";
        }
        return randNome;
    }
} // Fim da classe