package lista6.ex4;

public class Teste {
    public static void main(String[] args) {
        Heroi heroi1 = new Heroi(1,2);
        Inimigo inimigo1 = new Inimigo(1,2);
        System.out.println("Posição do herói: " + heroi1.getPosicao());
        System.out.println("Posição do inimigo: " + inimigo1.getPosicao());
        if (Jogo.colidiu(heroi1, inimigo1)) {
            System.out.println("As posições do herói e do vilão são iguais!");
        } else {
            System.out.println("As posições do herói e do vião são diferentes!");
        }
    }
}
