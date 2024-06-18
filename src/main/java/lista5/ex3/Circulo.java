/*
Crie a classe Circulo, que tem um Ponto e um raio. A classe deve ter dois construtores: 
a. o que não recebe argumentos: cria um Circulo com centro em 0,0 e raio 1 b. o que recebe a posição e o raio
*/

package lista5.ex3;
import lista5.ex2.Ponto;

public class Circulo extends Ponto {
    private Ponto ponto;
    private double raio;
    
    public Ponto getPonto () {
        return ponto;
    }
    
    public Circulo () {
        ponto = new Ponto();
        raio = 1.0;
    }
    
    public Circulo (Ponto ponto, Double raio) {
        this.ponto = ponto;
        this.raio = raio;
    } 
}
