package ex_interfaces;

public class Gerente implements Funcionario, Comparable<Funcionario>{
    private double salarioMes;
    
    public Gerente () {
        salarioMes = 0.0;
    }
    
    public Gerente (double salarioMes) {
        this.salarioMes = salarioMes;
    }
    
    @Override
    public double calcularSalario() {
        return salarioMes + salarioMes*0.1;
    }
    
    @Override
    public int compareTo(Funcionario outroFuncionario) {
        return Double.compare(this.calcularSalario(), outroFuncionario.calcularSalario());
    }
}
