package lista2.ex6;

public class TestarProgramador {
    public static void main(String[] args) {
        Programador programador1 = new Programador("Miguel", 3600.51, 26);
        System.out.println("Valor a receber: R$ " + programador1.calcularSalario(162.59));
    }
}
