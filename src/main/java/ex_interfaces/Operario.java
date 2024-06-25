package ex_interfaces;

public class Operario implements Funcionario, Comparable<Funcionario>{
    private double salarioDia;
    private int diasTrabalhados;
    
    public Operario () {
        salarioDia = 0.0;
        diasTrabalhados = 0;
    }
    
    public Operario (double salarioDia, int diasTrabalhados) {
        this.salarioDia = salarioDia;
        this.diasTrabalhados = diasTrabalhados;
    }
    
    @Override
    public double calcularSalario () {
        return salarioDia * diasTrabalhados;
    }
    
    @Override
    public int compareTo(Funcionario outroFuncionario) {
        return Double.compare(this.calcularSalario(), outroFuncionario.calcularSalario());
    }
}
