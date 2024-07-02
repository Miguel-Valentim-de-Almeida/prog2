package lista6.ex4;

public class Inimigo implements IPersonagem{
    private int x;
    private int y;
    
    public Inimigo () {
        x = 0;
        y = 0;
    }
    
    public Inimigo (int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String getPosicao() {
        String posicao = "(" + x + ", " + y + ")";
        return posicao;
    }
    
}
