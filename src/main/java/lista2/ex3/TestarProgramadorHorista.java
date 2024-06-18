package lista2.ex3;

public class TestarProgramadorHorista {
    public static void main(String[] args) {
        ProgramadorHorista programador1 = new ProgramadorHorista();
        System.out.println(programador1.calcularSalario());
        ProgramadorHorista programador2 = new ProgramadorHorista(100.51, 56);
        System.out.println(programador2.calcularSalario());
    }
}
