/*
Crie a interface Funcionario com o método calcularSalario( ) cujo retorno seja double. Crie a classe concreta Operario que implementa Funcionario. A classe tem os atributos salarioDia e diasTrabalhados. O método calcularSalario( ) retorna a multiplicação de  salarioDia por diasTrabalhados. Crie a classe Gerente que implementa Funcionario. A classe tem o atributo salarioMes. O método calcularSalario( ) retorna o salarioMes mais um bônus de 10%. Crie a classe FolhaPagamento com uma lista do tipo Funcionario com alguns objetos do tipo Operario e alguns do tipo Gerente. 
a) Mostre a execução polimorfica de calcularSalario( ) utilizando os objetos desta lista. 
b) Ordene os objetos pelo salário, do menor para o maior, utilizando o método sort( )
*/

package ex_interfaces;

public interface Funcionario {
    public double calcularSalario();
}
