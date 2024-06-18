/*
[static] Crie uma classe com um campo static chamado quantidadeObjetos.
Este atributo deve ser incrementado a cada vez que um objeto da classe é
instanciado. Mostre como exibir, em dado momento, a quantidade de objetos
existentes.
*/

package lista3.ex6;

public class Classe {
    private static int quantidadeDeObjetos = 0;
    
    Classe () {
        quantidadeDeObjetos++;
    }
    
    public int getQuantObjetos () {
        return quantidadeDeObjetos;
    }
    
    
}
