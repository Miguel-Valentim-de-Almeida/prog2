package ex_interfaces;
import java.util.*;

public class SalarioComparator implements Comparator<Funcionario> {
    @Override
    public int compare(Funcionario funcionario1, Funcionario funcionario2) {
        return Double.compare(funcionario1.calcularSalario(), funcionario2.calcularSalario());
    }
}
