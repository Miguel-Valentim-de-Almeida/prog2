/*
[static] Crie uma classe chamada Util que tenha o método static
formatarData( ). O método recebe um objeto do tipo LocalDate e retorna
uma String no formato dd/MM/aaaa. Mostre, no método main( ), como utilizar
o método static criado.
*/

package lista3.ex5;

import java.time.LocalDate;

public class Util {
    public static String formatarData (LocalDate data) {
        String dataFormatada = data.getDayOfMonth() + "/" + data.getMonth() + "/" + data.getYear();
        return dataFormatada;
    }
}
