package lista4.ex2;

public class TestaHeranca {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(1, "Ribamar", 3500.0);
        Gerente gerente = new Gerente(2, "Leo Pelé", 9800.0, 200.0);
        System.out.println("Salário do funcionário: " + funcionario.mostrarSalario(500.0));
        System.out.println("Salário do gerente: " + gerente.mostrarSalario(500.0));
    }
}
