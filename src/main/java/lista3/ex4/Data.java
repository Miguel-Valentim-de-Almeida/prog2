/*
[Sobrecarga] Crie três métodos sobrecarregados chamados mudarData( ).
a) O primeiro deve receber um objeto LocalDate e um inteiro e setar o
ano do objeto LocalDate com o inteiro recebido.
b) O segundo deve receber um objeto LocalDate e dois inteiros e setar o
mês e o ano do objeto LocalDate com os inteiros recebidos.
c) O terceiro deve receber um objeto LocalDate e três inteiros e setar o
dia, o mês e o ano do objeto LocalDate com os inteiros recebidos.
*/

package lista3.ex4;
import java.time.LocalDate;

public class Data {
    
    public static LocalDate mudarData(LocalDate data, int ano) {
        return data.withYear(ano);
    }
    
    public static LocalDate mudarData(LocalDate data, int mes, int ano) {
        return data.withMonth(mes).withYear(ano);
    }
    
    public static LocalDate mudarData(LocalDate data, int dia, int mes, int ano) {
        return data.withDayOfMonth(dia).withMonth(mes).withYear(ano);
    }
}
