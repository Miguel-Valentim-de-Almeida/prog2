package lista6.ex4;

public class Heroi implements IPersonagem{
    private int x;
    private int y;
    
    public Heroi () {
        x = 0;
        y = 0;
    }
    
    public Heroi (int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String getPosicao() {
        String posicao = "(" + x + ", " + y + ")";
        return posicao;
    }
}
