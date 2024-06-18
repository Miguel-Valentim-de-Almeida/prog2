/*
Crie uma classe chamada Lampada. A classe deve ter o atributo (campo) acesa.
A classe deve ter os métodos:
● acender( ) (muda o campo acesa para verdadeiro)
● apagar( ) (muda o campo acesa para falso)
Crie um método chamado mostrarEstado( ) que retorna a mensagem “acesa” ou
“apagada” conforme o valor do campo acesa.
*/

package lista1.ex1;

public class Lampada {
    boolean acesa;
    void acender() {
        acesa = true;
    }
    void apagar() {
        acesa = false;
    }
    String mostrarEstado() {
        if (acesa) {
            return "acesa";
        } else {
            return "apagada";
        }
    }
}
