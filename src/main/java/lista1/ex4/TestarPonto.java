package lista1.ex4;

public class TestarPonto {
    public static void main(String[] args) {
        Ponto ponto1 = new Ponto();
        Ponto ponto2 = new Ponto(7,9);
        ponto1.plotar();
        ponto2.plotar();
        ponto2.setarXY(5,1);
        ponto2.plotar();
    }
}
