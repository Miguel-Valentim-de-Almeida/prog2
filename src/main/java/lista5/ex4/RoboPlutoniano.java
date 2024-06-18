package lista5.ex4;
import lista5.ex2.Ponto;

public class RoboPlutoniano extends RoboMarciano{
    private int municao;
    
    public RoboPlutoniano () {
        super();
        municao = 0;
    }
    
    public RoboPlutoniano (int codigo, String nome, Ponto localizacao, int municao) {
        super(codigo, nome, localizacao);
        this.municao = municao;
    }
    
    public void atirar () {
        if (municao > 0) {
            municao--;
        }
    }
    
    public void recarregar (int qtd_Municao) {
        municao += qtd_Municao;
    }
    
    public int getMunicao () {
        return municao;
    }
    
    @Override
    public String toString () {
        return "Sou um robô plutoniano!";
    }
}
