/*
Crie uma classe chamada Robo, que simula um robô. A classe deve ter um
campo, do tipo String, com o nome do robô e um campo do tipo Ponto, que
representa a posição do Robo no plano cartesiano. A classe deve ter
a) um construtor parametrizado que recebe o nome do robô e um Ponto
b) um construtor vazio
Um robô pode andar para direita (x é incrementado), andar para esquerda (x
é decrementado), andar para baixo (y é decrementado) e andar para cima (y
é incrementado). Um robô pode, também, se teletransportar para uma
coordenada específica. Um robô também deve saber informar sua posição
(um método que retorna a coordenada em que está).
Crie métodos adequados para essas ações do robô.
*/

package lista3.ex2_e_ex3;

import lista3.ex1.Ponto;

public class Robo {
    private String nome;
    private Ponto posicaoRobo;

    public Robo (String nome, Ponto posicaoRobo) {
        this.nome = nome;
        this.posicaoRobo = posicaoRobo;
    }

    public Robo () {
        nome = "";
        posicaoRobo = new Ponto();
    }

    public void andarParaEsquerda () {
        posicaoRobo.setX(posicaoRobo.getX()-1);
    }

    public void andarParaDireita () {
        posicaoRobo.setX(posicaoRobo.getX()+1);
    }

    public void andarParaBaixo () {
        posicaoRobo.setY(posicaoRobo.getY()-1);
    }

    public void andarParaCima () {
        posicaoRobo.setY(posicaoRobo.getY()+1);
    }

    public Ponto getPosicaoRobo () {
        return posicaoRobo;
    }

    public void teletransporte (Ponto novaPosicao) {
        this.posicaoRobo = novaPosicao;
    }

    public boolean colidiu (Robo robo2) {
        if (this.posicaoRobo.getX() == robo2.posicaoRobo.getX() && this.posicaoRobo.getY() == robo2.posicaoRobo.getY()) {
            return true;
        } else {
            return false;
        }
    }

    public String getNome () {
        return nome;
    }

    public void setNome (String novo_nome) {
        this.nome = novo_nome;
    }
}

