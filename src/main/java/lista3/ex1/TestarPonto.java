package lista3.ex1;


public class TestarPonto {
    public static void main (String[] args) {
        Ponto ponto1 = new Ponto();
        System.out.printf("x: %.2f\ny: %.2f\n", ponto1.getX(), ponto1.getY());
        Ponto ponto2 = new Ponto(2.5, 3.0);
        System.out.println("Ponto.Ponto.Ponto.Ponto 2:");
        System.out.printf("x: %.2f\ny: %.2f", ponto2.getX(), ponto2.getY());
    }
}
