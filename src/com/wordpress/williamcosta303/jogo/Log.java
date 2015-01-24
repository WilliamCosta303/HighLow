package com.wordpress.williamcosta303.jogo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Log {
    PrintWriter out; 
    File tmpDir = new File("dmps");

    public Log(){
        if (!tmpDir.exists()){
            tmpDir.mkdir();
        }
        try{
            this.out = new PrintWriter(new FileWriter("dmps/HighLowLog_" + this.nomeLog() + ".dmp"));
        }catch(IOException e){
            System.out.println("ERRO! " + e);
        }
        out.println("Jogo de cartas High/Low");
        out.println("~~~");
        out.println(this.horaDataAtual() + " - Jogo iniciado");
        out.println("-");
    }
    
    public void botaoPressionado(String qualBotao){
        out.println(this.horaDataAtual() + " - Botão '" + qualBotao + "' foi pressionado!");
        out.println("-");
    }
    
    public void vitoria(boolean vitoria, boolean cheat){
        if(vitoria){
            if(!cheat){
                out.println(this.horaDataAtual() + " - O jogador ganhou uma partida.");
                out.println("-");
            } else {
                out.println(this.horaDataAtual() + " - O jogador ganhou uma partida(com cheats).");
                out.println("-");
            }
        } else {
            out.println(this.horaDataAtual() + " - O jogador perdeu uma partida.");
            out.println("-");
        }
    }
    
    public void returnCheats(int cheat){
        if (cheat == 1){
            out.println(this.horaDataAtual() + " - Cheat +50 no saldo ativado!");
            out.println("-");
        } else if (cheat == 2){
            out.println(this.horaDataAtual() + " - Aposta em 50 ativada!");
            out.println("-");
        } else if (cheat == 3){
            out.println(this.horaDataAtual() + " - Aposta em .50 ativada!");
            out.println("-");
        } else if (cheat == 4){
            out.println(this.horaDataAtual() + " - Carta inicial 1 ativada!");
            out.println("-");
        } else if (cheat == 5){
            out.println(this.horaDataAtual() + " - Carta inicial 13 ativada!");
            out.println("-");
        } else {
            out.println(this.horaDataAtual() + " - O jogador saiu do menu de cheats sem roubar.");
            out.println("-");
        }
    }
    
    public void msgGenerica(String msg){
        out.println(this.horaDataAtual() + " - " + msg);
        out.println("-");
    }
    
    public void encerrar(){
        out.println(this.horaDataAtual() + " - Jogo encerrado.");
        out.close();
    }
    
    public void erroWinFechada(NullPointerException nomeErro){
        out.println(this.horaDataAtual() + " - Erro: " + nomeErro);
        out.println("A janela tentou ser fechada!");
        out.println("-");
    }
    
    public String horaDataAtual(){
        return new SimpleDateFormat("dd/MM HH:mm:ss").format(new Date());
    }
    
    public String nomeLog(){
        return new SimpleDateFormat("dd.MM.yy_HH.mm").format(new Date());
    }
    
    /*public String nomeJogador(){
        return new CartasWindow().jog1.nomeJogador;
    }*/

}
