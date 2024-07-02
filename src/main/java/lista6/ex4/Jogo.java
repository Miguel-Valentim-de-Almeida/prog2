package lista6.ex4;

public class Jogo {
    public static boolean colidiu (Heroi heroi, Inimigo inimigo) {
        if (heroi.getPosicao().equals(inimigo.getPosicao())) {
            return true;
        }
        return false;
    }
}
