package com.wordpress.williamcosta303.jogo;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/*
 * Autor: William A. Costa
 * Início:  19/06/2013 - 09:12
 * Fim:     18/08/2013 - 18:28
 * ~
 * Jogo de cartas alta/baixa
 * ~
 * License:
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * ~
 * Changelog:
 * 
 * 18/08        ADD:    Licença GNU;
 *              EDIT:   -
 *              REMOVE: -
 *                      ~
 * 15/08        ADD:    -
 *              EDIT:   Versão do jogo em VCartas é uma variável final.
 *              REMOVE: -
 *                      ~
 * 21/07        ADD:    Sistema de logs, para futuros bugfixes;
 *              EDIT:   (BUGFix) Formato decimal em Cartas agora possui um 0 antes da vírgula;
 *              REMOVE: -
 *                      ~
 * 20/07        ADD:    -
 *              EDIT:   Novo jogo: agora o nome precisa cumprir as mesmas regras que no método em Cartas;
 *              REMOVE: -
 *                      ~
 * 18/07        ADD:    -
 *              EDIT:   O jogo está agora em inglês!
 *              REMOVE: -
 *                      ~
 * 17/07        ADD:    -
 *              EDIT:   (BUGFix) JOptionPane do contrutor e do método digitarCheats() não gera mais erros quando for fechado pelo X;
 *              REMOVE: -
 *                      ~
 * 15/07        ADD:    GUI: Janela não pode mais ser alterada de tamanho;
 *                      (SRC)CartasWindow: Método para novo jogo, para poupar linhas;
 *                      (SRC)CartasWindow: Método para atualizar os campos;
 *              EDIT:   -
 *              REMOVE: -
 *                      ~
 * 13/07        ADD:    -
 *              EDIT:   Como jogar/regras: atualizado;
 *              REMOVE: Método alterarAposta(), inútil com a nova GUI;
 *                      ~
 * 11/07        ADD:    (!) Área gráfica! (começo: por volta de 09/07);
 *              EDIT:   Créditos: Removido o "Visite:", deixado apenas o link;
 *                      Nome do jogador: Não aceita nomes com 0 caracteres;
 *                      (SRC)Cheats: Usa switch()case ao invés de if{};
 *              REMOVE: Classe UsaCartas;
 *                      ~
 * 06/07        ADD:    Cheat: carta inicial em (rei)
 *              EDIT:   Valores em $ agora possuem ',';
 *              REMOVE: -
 *                      ~
 * 03/07	ADD:	Novo menu para digitar cheats;
 * 			EDIT:	-
 * 			REMOVE	Menu de selecionar cheats;
 *                      ~
 * 02/07	ADD:	Método em Cartas para Cheats (menu: 6652);
 * 			Mensagem especial pra quem (descobrir e) usar cheats;
 * 		EDIT:	(BUGFix) Agora quando apostar menos ganha o valor atual da aposta (antes: +$5);
 * 			(BUGFix) "Como jogar?": regras de desistência agora diz '4' (antes '3')
 * 			(SRC) Apostar em mais, menos e alterar aposta agora são métodos na classe Cartas;
 * 			(SRC) Menu da classe UsaCartas invoca métodos;
 * 		REMOVE:	-
 *                      ~
 * 01/07	ADD:	Nova opção de aumentar/diminuir a aposta atual;
 * 			(SRC) Comentários para aumentar/diminuir a aposta;
 * 			Nome do jogador: Inicia com um valor randômico, iniciado na classe VCartas;
 * 		EDIT:	Vitória: Mensagem agora mostra o nome do jogador;
 * 			Menu: nova opção para alterar o valor da aposta;
 * 			Maior/menor: ganha o valor atual da aposta ou perde o valor atual vezes 2;
 * 			(SRC) "5" sai do menu (antes: 4);
 * 			(SRC) VCartas agora é instanciado no início do main;
 * 		REMOVE:	-
 *                      ~
 * 28/06	ADD:	Criada classe VCartas, para armazenar a versão do jogo e os créditos;
 * 		EDIT:	(SRC) Regras ("Como jogar?") agora é método na classe "Cartas";
 * 			(SRC) Nome do jogador: usa if{} e do()while ao invés de while{}
 * 		REMOVE:	-
 *                      ~
 * 27/06	ADD:	Chance de vitória
 * 			Vitória: Saldo chega à $200 ou mais
 *              EDIT:	Nome do jogador: novo máximo de 20 caracteres.
 * 			Nome do jogador: Não aceita "1234" como nome
 * 			Nome do jogador: Não aceita valores nulos como nome
 * 			(SRC) Comentários no main da vitória
 * 		REMOVE:	-
 *                      ~
 * 22/06	ADD:	Opção para exibir "Como jogar?" antes de começar o jogo;
 * 			(SRC) Comentários do novo "Como jogar?" no main;
 * 		EDIT:	Nome do jogador: mínimo de 4 caracteres;
 * 			Nome do jogador: máximo de 12 caracteres;
 * 			Nome do jogador: não aceita 4 espaços ("    ");
 * 		REMOVE:	-
 *                      ~
 * 21/06	ADD:	Opção para confirmar deistência;
 * 			(SRC) Comentários da main;
 * 		EDIT: 	(SRC) "4" sai do menu (antes: 3);
 * 			(SRC) O switch: default do menu seta 'menu' para 0;
 * 		REMOVE: -
 *                      ~
 * 20/06	ADD: 	Créditos no fim do programa;
 * 			Impossível possuir nome com 0 caracteres;
 * 			Opção para iniciar novo jogo;
 * 		EDIT: 	Informação de nova carta junto com resultado;
 * 		REMOVE: -
 *                      ~
 * 19/06	Início do código;
 */
public class Cartas {
    DecimalFormat df = new DecimalFormat("##0.00");
    public String nomeJogador;
    public double saldoAtual;
    public double aposta;
    public boolean cheater;
    public int cartaInicial;
    public String naipeInicial;
    public int cheats;

    public Cartas() {
        VCartas nomes = new VCartas();
        boolean temNome = false;
        while (!temNome) {
            try {
                String nomeJogador = JOptionPane.showInputDialog("Type in your name:", nomes.randNomePadrao());
                if (nomeJogador.length() <= 3 || nomeJogador.length() > 20
                        || nomeJogador.equals("    ") || nomeJogador.equals("1234")
                        || nomeJogador.equals("") || nomeJogador.length() == 0) {
                    do {
                        nomeJogador = JOptionPane
                                .showInputDialog("Invalid name! (Min: 4 characters Max: 20 characters)\nType in your name:");
                    } while (nomeJogador.length() <= 3 || nomeJogador.length() > 20
                            || nomeJogador.equals("    ") || nomeJogador.equals("1234")
                            || nomeJogador.length() == 0);
                }
                this.nomeJogador = nomeJogador;
                this.saldoAtual = 50.0;
                this.aposta = 5;
                this.cheater = false;
                temNome = true;
            } catch (NullPointerException erroWinFechada) {
                JOptionPane.showMessageDialog(null, "The game needs a name before we begin!");
            }
        }
    }

    public String geraNaipe() {
        String naipe;
        int randNaipe = (int) 1 + (int) (Math.random() * 4);
        if (randNaipe == 1) {
            naipe = " of hearts";
        } else if (randNaipe == 2) {
            naipe = " of diamonds";
        } else if (randNaipe == 3) {
            naipe = " of clubs";
        } else {
            naipe = " of spades";
        }
        return naipe;
    }

    public int geraCarta() {
        int randNum = (int) 1 + (int) (Math.random() * 13); // Sorteia um número
        // de 1 a 13
        return randNum; // Retorna o valor sorteado
    }

    public String mostraCarta(int carta2) {
        String carta;
        if (carta2 == 1) {
            carta = "Ace";
        } else if (carta2 == 2) {
            carta = "2";
        } else if (carta2 == 3) {
            carta = "3";
        } else if (carta2 == 4) {
            carta = "4";
        } else if (carta2 == 5) {
            carta = "5";
        } else if (carta2 == 6) {
            carta = "6";
        } else if (carta2 == 7) {
            carta = "7";
        } else if (carta2 == 8) {
            carta = "8";
        } else if (carta2 == 9) {
            carta = "9";
        } else if (carta2 == 10) {
            carta = "10";
        } else if (carta2 == 11) {
            carta = "(J)Jack";
        } else if (carta2 == 12) {
            carta = "(Q)Queen";
        } else {
            carta = "(K)King";
        }
        return carta;
    }

    public void apostarMais() {
        int atualCarta = this.cartaInicial; // A carta atual receberá a
        // carta sorteado no começo
        String atualNaipe = this.naipeInicial; // O naipe atual receberá
        // o naipe sorteado no
        // começo
        int novaCarta = this.geraCarta(); // Gera uma nova carta
        String novoNaipe = this.geraNaipe(); // Gera um novo naipe
        if (novaCarta > atualCarta) { // Se a nova carta for maior
            // que a antiga
            JOptionPane.showMessageDialog(null, "Current card: " // Mensagem
                    // mostrando
                    // as
                    // cartas
                    // e
                    // o
                    // resultado
                    + this.mostraCarta(atualCarta)
                    + atualNaipe
                    + "\nNew Card: "
                    + this.mostraCarta(novaCarta)
                    + novoNaipe
                    + "\n\nYou won $" + df.format(this.aposta));
            this.saldoAtual += this.aposta; // Adicionados $5 ao
            // saldo
            this.cartaInicial = novaCarta; // A carta inicial receberá a
            // nova carta sorteada
            this.naipeInicial = novoNaipe; // O naipe inicial receberá o
            // novo naipe sorteaado
        } else if (novaCarta == atualCarta) { // Se a nova carta for
            // igual
            JOptionPane.showMessageDialog(null, "Current card: " // Mensagem
                    // mostrando
                    // as
                    // cartas
                    // e
                    // o
                    // resultado
                    + this.mostraCarta(atualCarta)
                    + atualNaipe
                    + "\nNew card: "
                    + this.mostraCarta(novaCarta)
                    + novoNaipe
                    + "\n\nTie, nobody wins");
            this.cartaInicial = novaCarta; // A carta inicial receberá a
            // nova carta sorteada
            this.naipeInicial = novoNaipe; // O naipe inicial receberá o
            // novo naipe sorteaado
        } else { // Caso a carta seja menor
            JOptionPane.showMessageDialog(null, "Current card: " // Exibe
                    // as
                    // cartas
                    // e
                    // o
                    // resultado
                    + this.mostraCarta(atualCarta)
                    + atualNaipe
                    + "\nNew card: "
                    + this.mostraCarta(novaCarta)
                    + novoNaipe
                    + "\n\nYou lost $" + df.format((this.aposta * 2)));
            this.saldoAtual -= (this.aposta * 2); // Retira $10 do
            // saldo
            this.cartaInicial = novaCarta; // A carta inicial receberá a
            // carta sorteada
            this.naipeInicial = novoNaipe; // O naipe inicial receberá o
            // naipe sorteado
        }
    }

    public void apostarMenos() {
        int atualCartaMenor = this.cartaInicial; // atualCartaMenor
        // recebe a carta
        // sorteada antes
        String atualNaipeMenor = this.naipeInicial; // atualNaipeMenor
        // recebe o naipe
        // sorteado antes
        int novaCartaMenor = this.geraCarta(); // gera uma nova
        // carta
        String novoNaipeMenor = this.geraNaipe(); // gera um novo
        // naipe
        if (novaCartaMenor < atualCartaMenor) { // Se a nova carta
            // for menor que a
            // atual
            JOptionPane.showMessageDialog(
                    // Exibe as cartas e o resultado
                    null,
                    "Current card: " + this.mostraCarta(atualCartaMenor)
                    + atualNaipeMenor + "\nNew card: "
                    + this.mostraCarta(novaCartaMenor) + novoNaipeMenor
                    + "\n\nYou won $" + df.format(this.aposta));
            this.saldoAtual += this.aposta; // Adiciona $5 ao saldo
            this.cartaInicial = novaCartaMenor; // cartaInicial recebe a
            // nova carta sorteada
            this.naipeInicial = novoNaipeMenor; // naipeInicial recebe o
            // novo naipe sorteado
        } else if (novaCartaMenor == atualCartaMenor) { // Se a nova
            // carta for
            // igual a
            // atual
            JOptionPane.showMessageDialog(
                    // Exibe as cartas e o resultado
                    null,
                    "Current card: " + this.mostraCarta(atualCartaMenor)
                    + atualNaipeMenor + "\nNew card: "
                    + this.mostraCarta(novaCartaMenor) + novoNaipeMenor
                    + "\n\nTie, nobody wins");
            this.cartaInicial = novaCartaMenor; // cartaInicial recebe a
            // nova carta sorteada
            this.naipeInicial = novoNaipeMenor; // naipeInicial recebe o
            // novo naipe sorteado
        } else { // Do contrário
            JOptionPane.showMessageDialog(
                    // Exibe as cartas e o resultado
                    null,
                    "Current card: " + this.mostraCarta(atualCartaMenor)
                    + atualNaipeMenor + "\nNew card: "
                    + this.mostraCarta(novaCartaMenor) + novoNaipeMenor
                    + "\n\nYou lost $" + df.format((this.aposta * 2)));
            this.saldoAtual -= (this.aposta * 2);
            this.cartaInicial = novaCartaMenor; // cartaInicial recebe a
            // nova carta sorteada
            this.naipeInicial = novoNaipeMenor; // naipeInicial recebe o
            // novo naipe sorteado
        }
    }

    public void digitarCheats() {
        boolean xiter = true;
        this.cheats = 0;
        while (xiter) {
            try {
                String cheat = JOptionPane.showInputDialog("Type in the cheat or type 'sair' to exit:", "sair");
                switch (cheat) {
                    case "sair":
                        xiter = false;
                        break;
                    case "Sair":
                        xiter = false;
                        break;
                    case "precisoDeGrana":
                        this.cheater = true;
                        this.saldoAtual += 50;
                        this.cheats = 1;
                        JOptionPane.showMessageDialog(null, "Balanced raised in $50");
                        xiter = false;
                        break;
                    case "apostaAltaPraCarvalho":
                        this.cheater = true;
                        this.aposta = 50;
                        this.cheats = 2;
                        JOptionPane.showMessageDialog(null, "Bet set in $50");
                        xiter = false;
                        break;
                    case "apostaMinimaPraCarvalho":
                        this.cheater = true;
                        this.aposta = 0.5;
                        this.cheats = 3;
                        JOptionPane.showMessageDialog(null, "Bet set in $0,50");
                        xiter = false;
                        break;
                    case "precisoDumAs":
                        this.cheater = true;
                        this.cartaInicial = 1;
                        this.cheats = 4;
                        JOptionPane.showMessageDialog(null, "Current card is now an Ace");
                        xiter = false;
                        break;
                    case "precisoDumRei":
                        this.cheater = true;
                        this.cartaInicial = 13;
                        this.cheats = 5;
                        JOptionPane.showMessageDialog(null, "Current card is now a King (K).");
                        xiter = false;
                        break;
                        
                        
                    //Não-cheats de desenvolvedor:

                     /*
                     case "debugDinheiro":
                     this.saldoAtual = 199;
                     JOptionPane.showMessageDialog(null, "Modo desenvolvedor:\nDinheiro em $199");
                     xiter = false;
                     break;
                     case "debugAs":
                     this.cartaInicial = 1;
                     xiter= false;
                     JOptionPane.showMessageDialog(null, "Modo desenvolvedor:\nCarta atual é Ás");
                     break;
                     */
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid!");
                }
            } catch (NullPointerException erroFecharJanela) {
                JOptionPane.showMessageDialog(null, "Leaving cheat menu...");
                xiter = false;
            }

        }
    }

    public void regras() {
        int regras = JOptionPane
                // Pergunta se o usuário quer ver as regras antes de começar
                .showConfirmDialog(
                null,
                "Before we begin, would you like to know the rules/how-to-play the game?",
                "Rules", JOptionPane.YES_NO_OPTION);
        if (regras == JOptionPane.YES_OPTION) { // Se sim
            int entendido = 0; // Cria uma variável entendido para uso
            // posterior
            while (entendido != 1) { // Enquanto "entendido" for diferente
                // de 1
                JOptionPane
                        // Explica como jogar
                        .showMessageDialog(
                        null,
                        "How to play:\nThe computer will select a random card.\nYou need to bet if the next card will be:\nHIGHER or LOWER clicking in a button");
                JOptionPane.showMessageDialog(null,
                        "To win:\n> Your currency is bigger than $200"); // Explica
                // como
                // ganhar
                JOptionPane
                        // Explica as posibilidades de fim de jogo
                        .showMessageDialog(
                        null,
                        "If:\n> You pick 'Give up' and confirm\n> Has a balance lower than $-50\nThe game will end.");
                entendido = JOptionPane.showConfirmDialog(null, // Pergunta
                        // se o
                        // jogador
                        // entendeu
                        // as regras
                        "Got it?", "Rules", JOptionPane.YES_NO_OPTION);
                if (entendido == JOptionPane.YES_OPTION) { // Se sim
                    entendido = 1; // 'entendido' recebe 1
                    JOptionPane.showMessageDialog(null, // Exibe mensagem
                            // que vai começar o
                            // jogo
                            "Great! Let's play!");
                }
            } // Fim do while entendido != 1
        } // Fim do if
    } // Fim método regras()
}