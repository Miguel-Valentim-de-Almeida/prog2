package lista3.ex2_e_ex3;
import lista3.ex1.Ponto;

public class TestarRobo {
    public static void main (String[] args) {
        Robo robo1 = new Robo();
        robo1.andarParaBaixo();
        robo1.andarParaCima();
        robo1.andarParaCima();
        robo1.andarParaEsquerda();
        System.out.printf("Posição do Robô:\nx: %.2f\ny: %.2f\n", robo1.getPosicaoRobo().getX(), robo1.getPosicaoRobo().getY());
        robo1.teletransporte(new Ponto(5.2, 6.9));
        System.out.printf("Posição do Robô:\nx: %.2f\ny: %.2f\n", robo1.getPosicaoRobo().getX(), robo1.getPosicaoRobo().getY());
        Robo robo2 = new Robo("R2-D2", new Ponto(2.0, 6.0));
        robo2.andarParaBaixo();
        robo2.andarParaBaixo();
        robo2.andarParaDireita();
        robo2.andarParaDireita();
        System.out.printf("Posição do Robô:\nx: %.2f\ny: %.2f\n", robo2.getPosicaoRobo().getX(), robo2.getPosicaoRobo().getY());
        robo2.teletransporte(new Ponto(5.2, 6.9));
        System.out.printf("Posição do Robô:\nx: %.2f\ny: %.2f\n", robo2.getPosicaoRobo().getX(), robo2.getPosicaoRobo().getY());
        if (robo1.colidiu(robo2)) {
            System.out.printf("Os robôs colidiram no ponto ( %.2f , %.2f )\n", robo1.getPosicaoRobo().getX(), robo1.getPosicaoRobo().getY());
        } else {
            System.out.println("Os robôs não colidiram!");
        }
        System.out.printf("Nome do robo2: %s\n", robo2.getNome());
        robo1.setNome("Leandro");
        System.out.printf("Nome do robo1: %s\n", robo1.getNome());
    }
}
