package lista4.ex1;

public class Cilindro extends Circulo{
    private Double altura;
    
    public Cilindro () {
        super();
        altura = 0.0;
    }
    
    public Cilindro (Double raio, Double altura) {
        super(raio);
        this.altura = altura;
    }
    
    public Double getAltura () {
        return altura;
    }
    
    public void setAltura (Double altura) {
        this.altura = altura;
    }
    
    @Override
    public Double calcularArea () {
        Double area = 2*(Math.PI * Math.pow(getRaio(), 2)) + 2 * (Math.PI * getRaio() * altura);
        return area;
    }
    
    
}
