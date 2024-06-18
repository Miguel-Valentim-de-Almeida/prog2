package lista1.ex1;

public class TestarLampada {
    public static void main(String[] args) {
        Lampada lampada1 = new Lampada();
        lampada1.acender();
        System.out.println(lampada1.mostrarEstado()+"\n");
        lampada1.apagar();
        System.out.println(lampada1.mostrarEstado());

    }
}
