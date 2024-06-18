package lista5.ex2;

public class TestePixel {
    public static void main(String[] args) {
        Pixel pixel1 = new Pixel();
        System.out.printf("Pixel 1 (construtor vazio):\nx: %d\ny: %d\ncor: %s\n", pixel1.getX(), pixel1.getY(), pixel1.getCor());
        Pixel pixel2 = new Pixel(1, 2);
        System.out.printf("Pixel 2 (construtor que recebe apenas x e y):\nx: %d\ny: %d\ncor: %s\n", pixel2.getX(), pixel2.getY(), pixel2.getCor());
        Pixel pixel3 = new Pixel(3,4,"vermelha");
        System.out.printf("Pixel 3 (construtor que recebe x, y e cor):\nx: %d\ny: %d\ncor: %s\n", pixel3.getX(), pixel3.getY(), pixel3.getCor());   
    }
}
