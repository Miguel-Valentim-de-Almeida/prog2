/*
Crie classes adequadas para modelar robôs. Crie uma classe abstrata Robo, que tem um código (inteiro), um nome (String) e uma localização (Ponto). Um robô só pode andar para frente (atributo x da localização incrementado em 1), para trás (atributo x da localização decrementado em 1), para cima (atributo y da localização incrementado em 1) e andar para baixo (atributo y da localização decrementado em 1). Crie robôs especializados. 
a. O robô marciano é subclasse de Robo e tem a capacidade de se teletransportar (ele pode ir direto a um novo Ponto). 
b. O robô solar é subclasse de Robo e pode emitir raios. No entanto, alguns saem de fábrica com esta funcionalidade desabilitada (isto quer dizer que deve haver um campo booleano para indicar se está ativada ou não). 
c. O robô plutoniano, além de ter tudo o que o robô marciano tem, também pode atirar. Para tanto, ele mantém a quantidade de balas em sua arma. O método atirar decrementa a quantidade de balas. O método recarregar aumenta a quantidade de balas com o valor passado como parâmetro. Não deve ser possível atirar sem balas. 
d. Sobrescreva, em cada uma das classes, o método toString( ) para retornar a seguinte mensagem: “Sou um robô <tipo>”, onde tipo corresponde ao tipo do robô, que pode ser RoboMarciano, RoboSolar ou RoboPlutoniano.
*/

package lista5.ex4;
import lista5.ex2.Ponto;

public abstract class Robo {
    private int codigo;
    private String nome;
    private Ponto localizacao;
    
    public Robo () {
        codigo = 0;
        nome = "";
        localizacao = new Ponto();
    }
    
    public Robo (int codigo, String nome, Ponto localizacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.localizacao = localizacao;
    }
    
    public void andarParaDireita () {
        localizacao.setX(localizacao.getX() + 1);
    } 
    
    public void andarParaEsquerda () {
        localizacao.setX(localizacao.getX() - 1);
    }
    
    public void andarParaBaixo () {
        localizacao.setY(localizacao.getY() - 1);
        
    }
    
    public void andarParaCima () {
        localizacao.setY(localizacao.getY() + 1);
    }
    
    public String mostrarPosicao () {
        return ("X = " + localizacao.getX() + ", Y = " + localizacao.getY());
    }
    
    public boolean colidiu (Robo robo2) {
        if (this.localizacao.getX() == robo2.localizacao.getX() && this.localizacao.getY() == robo2.localizacao.getY()) {
            return true;
        } else {
            return false;
        }
    }
    
    public void setLocalizacao (Ponto ponto) {
        this.localizacao = ponto;
    }
    
    public Ponto getLocalizacao () {
        return localizacao;
    }
    
    public abstract String toString();
}   


