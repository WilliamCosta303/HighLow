package com.github.williamcosta303.utilitarios;

/*
    Copyright (c) 2016, William A. Costa
    All rights reserved.

    Redistribution and use in source and binary forms, with or without
    modification, are permitted provided that the following conditions are met:
        * Redistributions of source code must retain the above copyright
          notice, this list of conditions and the following disclaimer.
        * Redistributions in binary form must reproduce the above copyright
          notice, this list of conditions and the following disclaimer in the
          documentation and/or other materials provided with the distribution.
        * Neither the name of the William A. Costa nor the
          names of its contributors may be used to endorse or promote products
          derived from this software without specific prior written permission.

    THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
    ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
    WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
    DISCLAIMED. IN NO EVENT SHALL WILLIAM A. COSTA BE LIABLE FOR ANY
    DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
    (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
    LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
    ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
    (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
    SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

public class Estranho {
    
    private String nome;
    /**
     * Níveis de estresse:
     * 2 - Calmo
     * 3 - Preocupado
     * 4 - Irritado
     */

    public Estranho() {
        this.setaNomeAleatorio();
    }

    /*
    Getter e Setter do nome para Salvar/Carregar 
     */
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    /**
     * GERADORES DE FALA
     */
    
    public String geraFalaVitoria(int estresse){
        int mensagemEscolhida = geraNumeroAleatorio(4);
        switch(estresse){
            case 2:
                switch(mensagemEscolhida){
                    case 1:
                        return nome + ":\nQue sorte a sua!";
                    case 2:
                        return nome + ":\nDona sorte sorriu pra você.";
                    case 3:
                        return nome + ":\nQuem pode, pode.";
                    case 4:
                        return nome + ":\nSortudo.";
                    default:
                        return "BUG";
                }
            case 3:
                switch(mensagemEscolhida){
                    case 1:
                        return nome + ":\nNão vá se acostumando!";
                    case 2:
                        return nome + ":\nJá já o jogo vira a meu favor.";
                    case 3:
                        return nome + ":\nDona sorte, por favor sorria para mim!";
                    case 4:
                        return nome + ":\nSua sorte já acaba!";
                    default:
                        return "BUG";
                }
            case 4:
                switch(mensagemEscolhida){
                    case 1:
                        return nome + ":\nMas que droga!";
                    case 2:
                        return nome + ":\nComo pode existir alguém com tanta sorte?";
                    case 3:
                        return nome + ":\nVocê deve estar roubando!";
                    case 4:
                        return nome + ":\nImpossível!";
                    default:
                        return "BUG";
                }
            default:
                return "BUG";
        }
    }
    
    public String geraFalaDerrota(int estresse){
        int mensagemEscolhida = geraNumeroAleatorio(4);
        switch(estresse){
            case 2:
                switch(mensagemEscolhida){
                    case 1:
                        return nome + ":\nQuem sabe você tem sorte depois!";
                    case 2:
                        return nome + ":\nDona Sorte sorriu para mim.";
                    case 3:
                        return nome + ":\nGanhei, haha.";
                    case 4:
                        return nome + ":\nJá estou acostumado.";
                    default:
                        return "BUG";
                }
            case 3:
                switch(mensagemEscolhida){
                    case 1:
                        return nome + ":\nEstou voltando!";
                    case 2:
                        return nome + ":\nUm pouco de sorte pra mim.";
                    case 3:
                        return nome + ":\nÓtimo!";
                    case 4:
                        return nome + ":\nVamos, jogue de novo, tenho que me recuperar!";
                    default:
                        return "BUG";
                }
            case 4:
                switch(mensagemEscolhida){
                    case 1:
                        return nome + ":\nFinalmente sorte!";
                    case 2:
                        return nome + ":\nJogue de uma vez, tenho que me recuperar";
                    case 3:
                        return nome + ":\nMe recuperando aos poucos!";
                    case 4:
                        return nome + ":\nVoltando a me acostumar a ganhar!";
                    default:
                        return "BUG";
                }
            default:
                return "BUG";
        }
    }
    
    public String geraFalaEmpate(int estresse){
        int mensagemEscolhida = geraNumeroAleatorio(4);
        switch(estresse){
            case 2:
                switch(mensagemEscolhida){
                    case 1:
                        return nome + ":\nQuem diria!";
                    case 2:
                        return nome + ":\nRaro de acontecer.";
                    case 3:
                        return nome + ":\nNão acontece muito.";
                    case 4:
                        return nome + ":\nEstranho.";
                    default:
                        return "BUG";
                }
            case 3:
                switch(mensagemEscolhida){
                    case 1:
                        return nome + ":\nCerto... ?";
                    case 2:
                        return nome + ":\nQuais as chances?";
                    case 3:
                        return nome + ":\nVamos de novo, rápido.";
                    case 4:
                        return nome + ":\nCalmaria para eu poder me recuperar depois!";
                    default:
                        return "BUG";
                }
            case 4:
                switch(mensagemEscolhida){
                    case 1:
                        return nome + ":\nDesperdício de rodada!";
                    case 2:
                        return nome + ":\nNinguem ganha, ou seja, agora esta tudo em meu favor";
                    case 3:
                        return nome + ":\nA próxima rodada é minha!";
                    case 4:
                        return nome + ":\nQuais as chances dessa desgraça acontecer?";
                    default:
                        return "BUG";
                }
            default:
                return "BUG";
        }
    }
    
    public String geraFalaInicio(){
        int mensagemEscolhida = geraNumeroAleatorio(3);
        this.setaNomeAleatorio();
        switch(mensagemEscolhida){
            case 1:
                return nome + ":\nEntão você quer apostar? Vamos lá então.";
            case 2:
                return nome + ":\nÉ hora da aposta!";
            case 3:
                return nome + ":\nVamos nessa, preciso de uma grana extra.";
            default:
                return nome + ":\nBUG";
        }
    }
    
    public String geraFalaCarregou(int estresse){
        int mensagemEscolhida = geraNumeroAleatorio(3);
        switch(estresse){
            case 2:
                switch(mensagemEscolhida){
                    case 1:
                        return nome + ":\nDe volta? Bora!";
                    case 2:
                        return nome + ":\nVoltou pra continuar perdendo? Okay!";
                    case 3:
                        return nome + ":\nVoltou para esse baile que está tomando?";
                    default:
                        return nome + ":\nBUG";
                }
            case 3:
                switch(mensagemEscolhida){
                    case 1:
                        return nome + ":\nDe volta? Vamos de uma vez, tenho que me recuperar!";
                    case 2:
                        return nome + ":\nVamos lá, tenho que recuperar meu dinheiro!";
                    case 3:
                        return nome + ":\nAinda tenho chances.";
                    default:
                        return nome + ":\nBUG";
                }
            case 4:
                switch(mensagemEscolhida){
                    case 1:
                        return nome + ":\nVamos vamos vamos, tenho que ganhar!";
                    case 2:
                        return nome + ":\nQue demora tenho que ganhar essa desgraça.";
                    case 3:
                        return nome + ":\nEnquanto você saia a sorte voltou veio para mim.";
                    default:
                        return nome + ":\nBUG";
                }
            default:
                return "BUG";
        }
    }
    
    public String geraFalaCartaAtual(int cartaAtual, int naipeAtual, int estresse){
        int mensagemEscolhida = geraNumeroAleatorio(2);
        String nomeCarta = this.leCarta(cartaAtual);
        String naipeNovo = this.leNaipe(naipeAtual);
        
        switch(estresse){
            case 2:
                switch(mensagemEscolhida){
                    case 1:
                        return nome + ":\nHmm? " + nomeCarta + naipeNovo + "? É a carta atual, o que tem?";
                    default:
                        return nome + ":\nGosto dessa carta. \"" + nomeCarta + naipeNovo + "\". Não sei o porquê, só gosto.";
                }
            case 3:
                switch(mensagemEscolhida){
                    case 1:
                        return nome + ":\n" + nomeCarta + naipeNovo + ". É a carta atual.";
                    default:
                        return nome + ":\nNão me sinto muito confortável com " + nomeCarta + naipeNovo + " na mesa. Não posso nem explicar.";
                }
            case 4:
                switch(mensagemEscolhida){
                    case 1:
                        return nome + ":\nO que você quer, hein? " + nomeCarta + naipeNovo + " é a carta atual, qual o problema?";
                    default:
                        return nome + ":\nAhh " + nomeCarta + naipeNovo + ", a fonte de todos os meus problemas.";
                }
            default:
                return "BUG";
                
        }
    }
    
    public String geraFalaCartaAnterior(int cartaAnterior, int naipeAnterior, int estresse){
        int mensagemEscolhida = geraNumeroAleatorio(2);
        String nomeCarta = this.leCarta(cartaAnterior);
        String naipeNovo = this.leNaipe(naipeAnterior);
        
        switch(estresse){
            case 2:
                switch(mensagemEscolhida){
                    case 1:
                        return nome + ":\nA carta passada? Foi " + nomeCarta + naipeNovo;
                    default:
                        return nome + ":\nOutra hora " + nomeCarta + naipeNovo + " aparece de novo.";
                }
            case 3:
                switch(mensagemEscolhida){
                    case 1:
                        return nome + ":\n" + nomeCarta + naipeNovo + " já passou.";
                    default:
                        return nome + ":\nNão tive muita sorte com " + nomeCarta + naipeNovo + " no passado.";
                }
            case 4:
                switch(mensagemEscolhida){
                    case 1:
                        return nome + ":\n" + nomeCarta + naipeNovo + " sempre me deu azar.";
                    default:
                        return nome + ":\n" + nomeCarta + naipeNovo + " já passou, esquece dessa desgraça.";
                }
            default:
                return "BUG";
                
        }
    }
    
    public String geraFalaDinheiro(int estresse){
        int mensagemEscolhida = geraNumeroAleatorio(3);
        switch(estresse){
            case 2:
                switch(mensagemEscolhida){
                    case 1:
                        return nome + ":\n" + "Estou precisando de um dinheirinho extra.";
                    case 2:
                        return nome + ":\n" + "Você não tem muito, mas já me ajuda.";
                    default:
                        return nome + ":\n" + "Qualquer poquinho já ME ajuda.";
                }
            case 3:
                switch(mensagemEscolhida){
                    case 1:
                        return nome + ":\n" + "Preciso do meu dinheiro de volta.";
                    case 2:
                        return nome + ":\n" + "Vou pegar meu dinheiro de volta aos poucos.";
                    default:
                        return nome + ":\n" + "Estou deixando você achar que vai ganhar.";
                }
            default:
                switch(mensagemEscolhida){
                    case 1:
                        return nome + ":\n" + "Agora é sério, vou pegar tudo de volta.";
                    case 2:
                        return nome + ":\n" + "Vou pegar o meu dinheiro, o seu e você vai ficar me devendo!";
                    default:
                        return nome + ":\n" + "Devolva meu dinheiro, aposte mais!";
                }
        }
    }
    
    public String geraFalaGenerica(String mensagem){
        return nome + ":\n" + mensagem;
    }
    
    
    
    
    /**
     * 
     */    
    private void setaNomeAleatorio(){
        int nomeSelecionado = geraNumeroAleatorio(10);
        
        switch(nomeSelecionado){
            case 1:
                this.nome = "Adalberto";
                break;
            case 2:
                this.nome = "Bernardo";
                break;
            case 3:
                this.nome = "Fabiano";
                break;
            case 4:
                this.nome = "Eduardo";
                break;
            case 5:
                this.nome = "Marcio";
                break;
            case 6:
                this.nome = "Dionatam";
                break;
            case 7:
                this.nome = "Otávio";
                break;
            case 8:
                this.nome = "Leonardo";
                break;
            case 9:
                this.nome = "Geraldo";
                break;
            case 10:
                this.nome = "Yago";
                break;
            default:
                this.nome = "Cláudio";
        }
    }
    
    private String leCarta(int carta){
        switch (carta) {
            case 1:
                return "Ás";
            case 11:
                return "Valete";
            case 12:
                return "Rainha";
            case 13:
                return "Rei";
            default:
                return Integer.toString(carta);
        }
    }
    
    private String leNaipe(int naipe){
        switch (naipe){
            case 1:
                return " de ouros";
            case 2:
                return " de paus";
            case 3:
                return " de espadas";
            case 4:
                return " de copas";
            default:
                return " BUGOU";
        }
    }
    
    private int geraNumeroAleatorio(int maximo){
        return (int) 1 + (int) (Math.random() * maximo);
    }
}
