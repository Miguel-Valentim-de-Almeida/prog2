/*
Crie uma classe chamada Ponto, com campos x e y, que representam uma
coordenada no plano cartesiano. Os campos devem ser privados com
métodos get() e set() para cada um. Crie um construtor parametrizado e um
construtor vazio.
*/

package lista3.ex1;

public class Ponto {
    private double x;
    private double y;
    
    public Ponto () {
        x = 0.0;
        y = 0.0;
    }
    
    public Ponto (double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Double getX () {
        return x;
    }
    
    public void setX (double x) {
        this.x = x;
    }
    
    public Double getY () {
        return y;
    }
    
    public void setY (double y) {
        this.y = y;
    }
    
}
