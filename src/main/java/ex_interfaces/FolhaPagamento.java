package ex_interfaces;
import java.util.*;

public class FolhaPagamento {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Operario(100.00, 15));
        funcionarios.add(new Gerente(1000.00));
        System.out.println("Operario calcularSalario: R$ " + funcionarios.get(0).calcularSalario());
        System.out.println("Gerente calcularSalario: R$ " + funcionarios.get(1).calcularSalario());
        
        Collections.sort(funcionarios, new SalarioComparator());
        
        System.out.println("\nFuncionários ordenados pelo salário:");
        for (Funcionario f : funcionarios) {
            System.out.println("Salário: R$ " + f.calcularSalario());
        }
    }  
}
