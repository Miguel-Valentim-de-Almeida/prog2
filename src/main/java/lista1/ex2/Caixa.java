/*
Crie uma classe chamada Caixa, com os atributos largura, altura e
profundidade. Crie um método chamado calcularVolume( ) que retorna o volume
da caixa.
*/

package lista1.ex2;

public class Caixa {
    double largura;
    double altura;
    double profundidade;

    Caixa (double largura, double altura, double profundidade) {
        this.largura = largura;
        this.altura = altura;
        this.profundidade = profundidade;
    }
    double calcularVolume () {
        double volume = largura + altura + profundidade;
        return volume;
    }
}
