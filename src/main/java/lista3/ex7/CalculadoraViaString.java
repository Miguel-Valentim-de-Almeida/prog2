/*
[varargs] Crie um método que receba uma String e uma quantidade variável
de inteiros. Se o valor da String for “SOM”, o método deve retornar a soma de
todos os elementos. Se o valor da String for “MULT”, o método deve retornar
a multiplicação de todos os elementos.
*/

package lista3.ex7;

public class CalculadoraViaString {
    public static int Calcular (String operacao, int ... listaDeNumeros) {
        int resultado;
        if (operacao.equals("SOM")) {
            resultado = 0;
            for (int i = 0; i<listaDeNumeros.length; i++) {
                resultado += listaDeNumeros[i];
            }
        } else if (operacao.equals("MULT")) {
            resultado = 1;
            for (int i = 0; i<listaDeNumeros.length; i++) {
                resultado *= listaDeNumeros[i];
            }
        } else {
            return 0;
        }
        return resultado;
    }
}
