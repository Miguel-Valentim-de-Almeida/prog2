package lista5.ex4;
import lista5.ex2.Ponto;

public class RoboMarciano extends Robo{
    public RoboMarciano () {
        super();
    }
    
    public RoboMarciano (int codigo, String nome, Ponto localizacao) {
        super(codigo, nome, localizacao);
    }
    
    public void teletransporte (Ponto novoPonto) {
        setLocalizacao(novoPonto);
    }
    
    @Override
    public String toString () {
        return "Sou um robô marciano!";
    }
}
