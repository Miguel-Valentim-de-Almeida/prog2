package lista4.ex2;

public class Funcionario extends Pessoa {
    private Double salario;
    
    public Funcionario () {
        super();
        salario = 0.0;
    }
    
    public Funcionario (int codigo, String nome, Double salario) {
        super (codigo, nome);
        this.salario = salario;
    }
    
    public Double getSalario () {
        return salario;
    }
    
    public void setSalario (Double salario) {
        this.salario = salario;
    }
    
    public Double mostrarSalario (Double descontos) {
        Double salarioFinal = salario - descontos;
        return salarioFinal;
    }
}
