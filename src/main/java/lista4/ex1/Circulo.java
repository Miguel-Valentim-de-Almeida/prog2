/*
Crie: 
a. A classe Circulo com o atributo raio (construtores, get e set). b. O método calcularArea( ), que retorna a área ( Area = π.raio2) c. A classe Cilindro, derivada de Circulo, com o atributo altura (construtores, get e set). 
d. Sobrescreva o método calcularArea( ), para retornar a área do cilindro Area = 2(π.r2) + 2(π.r.h) 
Crie uma classe para testar os métodos. 

*/

package lista4.ex1;

public class Circulo {
    private Double raio;
    
    public Circulo () {
        raio = 0.0;
    }
    
    public Circulo (Double raio) {
        this.raio = raio;
    }
    
    public Double getRaio () {
        return raio;
    }
    
    public void setRaio (Double raio) {
        this.raio = raio;
    }
    
    public Double calcularArea () {
        Double area = Math.PI * Math.pow(this.raio, 2);
        return area;
    }
}
