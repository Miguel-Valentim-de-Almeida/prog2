package lista4.ex1;

public class TestaHeranca {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo (2.0);
        System.out.println("Área do círculo: " + circulo1.calcularArea());
        Cilindro cilindro1 = new Cilindro (1.0, 2.0);
        System.out.println("Área do cilindro: " + cilindro1.calcularArea());
    }
    
}
