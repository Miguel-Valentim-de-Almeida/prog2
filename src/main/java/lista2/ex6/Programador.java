/*
Escreva uma classe para representar um programador. A classe deve ter os campos
nome, salarioMensal e horasHorasExtras. Deve, também, ter o método
calcularSalario( ) que retorna o valor a receber pelo programador: salário mensal +
(quantidade de horas extras * valor hora extra). O valor da hora extra é passado como
argumento para o método.
*/

package lista2.ex6;

public class Programador {
    String nome;
    double salarioMensal;
    int horasExtras;

    Programador (String nome, double salarioMensal, int horasExtras) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
        this.horasExtras = horasExtras;
    }
    double calcularSalario (double valorHoraExtra) {
        double valorAReceber = salarioMensal + (horasExtras * valorHoraExtra);
        return valorAReceber;
    }
}
