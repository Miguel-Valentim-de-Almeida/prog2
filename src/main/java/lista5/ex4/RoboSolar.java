package lista5.ex4;
import lista5.ex2.Ponto;

public class RoboSolar extends Robo{
    private boolean emiteRaios;
    
    public RoboSolar () {
        super();
        emiteRaios = false;
    }
    
    public RoboSolar (int codigo, String nome, Ponto localizacao) {
        super(codigo, nome, localizacao);
        emiteRaios = false;
    }
    
    public void ativarFuncaoEmitirRaios () {
        emiteRaios = true;
    }
    
    public boolean getEmiteRaios () {
        return emiteRaios;
    }
    
    @Override
    public String toString () {
        return "Sou um robô solar!";
    }
}
