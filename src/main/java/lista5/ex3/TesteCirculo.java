package lista5.ex3;
import lista5.ex2.Ponto;

public class TesteCirculo {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo (new Ponto(2,4), 15.0);
        System.out.println(circulo1.getPonto().getX());
        System.out.println(circulo1.getPonto().getY());
    }
}
