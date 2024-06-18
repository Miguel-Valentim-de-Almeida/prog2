/*
Crie a classe Pixel, que é um Ponto que tem uma cor (String). A classe deve ter 3 construtores: 
a. um vazio, que inicializa x e y com zero e a cor como “preta”,
b. um construtor que recebe os valores para x e y apenas, e deixa a cor padrão (“preta”) e 
c. outro que recebe x, y e a cor. 
Utilize, obrigatoriamente, chamada ao construtor da classe base. 
*/

package lista5.ex2;

public class Pixel extends Ponto{
    private String cor;
    
    public Pixel () {
        super();
        cor = "preta";
    }
    
    public Pixel (int x, int y) {
        super(x,y);
        cor = "preta";
    }
    
    public Pixel (int x, int y, String cor) {
        super(x,y);
        this.cor = cor;
    }
    
    public String getCor () {
        return cor;
    }
}
