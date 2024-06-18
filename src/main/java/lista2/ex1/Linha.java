/*
Crie uma classe chamada Linha com o campo comprimento. Crie um construtor
vazio e um construtor que receba argumentos. A classe deve ter o método desenhar( )
que traça uma linha com o valor de comprimento.
Observação: traçar uma linha nesse caso é apenas printar o caractere _
*/

package lista2.ex1;

public class Linha {
    int comprimento;

    Linha () {
        comprimento = 0;
    }

    Linha (int comprimento) {
        this.comprimento = comprimento;
    }

    void desenhar () {
        for (int i = 0; i<comprimento; i++) {
            System.out.print("_");
        }
    }
}
