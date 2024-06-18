/*
Crie uma classe Data que tenha três campos: dia, mes e ano. Crie três
construtores:
- um vazio
- um construtor que recebe o ano (neste caso, os campos dia e mes devem ser
iniciados com 1)
- um construtor que recebe três parâmetros.
Crie um método formatarData( ) que recebe como parâmetro o separador e
retorna a data formatada. Exemplo:
- se for passado o caractere “/”, o retorno será 1/6/2021
- se for passado o caractere “-”, o retorno será 1-6-2021
Crie um método main( ) e mostre:
- como criar objetos utilizando os construtores criados.

- como chamar o método e exibir o resultado
Observação: não utilize nenhuma das classes de data da linguagem Java.
*/

package lista1.ex3;

public class Data {
    String dia;
    String mes;
    String ano;

    Data () {
        dia = "1";
        mes = "1";
        ano = "1";
    }

    Data (String ano) {
        this.ano = ano;
        dia = "1";
        mes = "1";
    }

    Data (String dia, String mes, String ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String formatarData(char separador) {
        String dataFormatada = dia + separador + mes + separador + ano;
        return dataFormatada;
    }
}
