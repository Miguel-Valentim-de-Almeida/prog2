package lista5.ex4;
import lista5.ex2.Ponto;

public class TesteHeranca {
    public static void main(String[] args) {
        RoboMarciano roboMarciano = new RoboMarciano(1, "Robson", new Ponto());
        roboMarciano.teletransporte(new Ponto(5,4));
        System.out.printf("Depois do teletransporte:\nx: %d\ny: %d\n", roboMarciano.getLocalizacao().getX(), roboMarciano.getLocalizacao().getY());
        RoboSolar roboSolar = new RoboSolar(2, "Adalberto", new Ponto(2,2));
        System.out.println("Função de emitir raios está ligada? " + roboSolar.getEmiteRaios());
        roboSolar.ativarFuncaoEmitirRaios();
        System.out.println("Função de emitir raios está ligada? " + roboSolar.getEmiteRaios()); 
        RoboPlutoniano roboPlutoniano = new RoboPlutoniano (3, "Metralhadora 1.5", new Ponto (9,4), 100);
        System.out.println("Munição antes de atirar: " + roboPlutoniano.getMunicao());
        for(int i = 0; i<100; i++) {
           roboPlutoniano.atirar();
           if (roboPlutoniano.getMunicao() == 0) {
               System.out.println("Não dá mais pra atirar!");
               System.out.println("Munição: " + roboPlutoniano.getMunicao());
           }
        }
        roboPlutoniano.recarregar(5);
        for(int i = 0; i<7; i++) {
            roboPlutoniano.atirar();
            if (roboPlutoniano.getMunicao() == 0) {
               System.out.println("Não dá mais pra atirar!");
               System.out.println("Munição: " + roboPlutoniano.getMunicao());
           }
        }
        System.out.println(roboMarciano.toString());
        System.out.println(roboSolar.toString());
        System.out.println(roboPlutoniano.toString());
    }
}
