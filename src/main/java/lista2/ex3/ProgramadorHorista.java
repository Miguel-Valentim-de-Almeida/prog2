/*
Escreva uma classe para representar um programador horista (que trabalha por horas).
A classe deve ter os campos valorHora e horasTrabalhadas. Deve, também, ter o
método calcularSalario( ) que retorna o valor a receber pelo programador (horas
trabalhadas multiplicadas pelo valor da hora). Crie um método main( ) para instanciar
objeto(s) e testar.
*/

package lista2.ex3;

public class ProgramadorHorista {
    double valorHora;
    int horasTrabalhadas;

    ProgramadorHorista () {
        valorHora = 0.0;
        horasTrabalhadas = 0;
    }

    ProgramadorHorista (double valorHora, int horasTrabalhadas) {
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    double calcularSalario () {
        double salario = valorHora * horasTrabalhadas;
        return salario;
    }
}
