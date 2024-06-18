/*
Crie: 
a. A classe Pessoa com codigo e nome (construtores, gets e sets). b. A classe Funcionario que herda de Pessoa e tem o atributo salario (construtores, get e set). 
c. A classe Funcionario deve ter o método mostrarSalario( ) que retorna o salario menos os descontos. O valor dos descontos é passado como argumento para o método. 
d. A classe Gerente, que herda de Funcionario e tem o atributo gratificacao. e. Sobrescreva o método mostrarSalario( ) para retornar o salario menos os descontos mais a gratificacao. 
Crie uma classe para testar os métodos.
*/

package lista4.ex2;

public class Pessoa {
   private int codigo;
   private String nome;
   
   public Pessoa () {
       codigo = 0;
       nome = "";
   }
   
   public Pessoa (int codigo, String nome) {
       this.codigo = codigo;
       this.nome = nome;
   }
   
   public int getCodigo () {
       return codigo;
   }
   
   public void setCodigo (int codigo) {
       this.codigo = codigo;
   }
   
   public String getNome () {
       return nome;
   }
   
   public void setNome (String nome) {
       this.nome = nome;
   }
}
