package lista4.ex2;

public class Gerente extends Funcionario {
    private Double gratificacao;
    
    public Gerente () {
        super();
        gratificacao = 0.0;
    }
    
    public Gerente (int codigo, String nome, Double salario, Double gratificacao) {
        super(codigo, nome, salario);
        this.gratificacao = gratificacao;
    }
    
    public Double getGratificacao () {
        return gratificacao;
    }
    
    public void setGratificacao (Double gratificacao) {
        this.gratificacao = gratificacao;
    }
    
    @Override
    public Double mostrarSalario (Double descontos) {
        Double salarioFinal = getSalario() - descontos + gratificacao;
        return salarioFinal;
    }
}
