package lista2.ex4;

public class TestarCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        System.out.println("Acelerando:\n");
        for (int i = 0; i<202; i++) {
            carro1.acelerar();
            System.out.println(carro1.velocidade);
        }
        System.out.println("\n\nFreando:\n");
        for (int i = 0; i<202; i++) {
            carro1.frear();
            System.out.println(carro1.velocidade);
        }

        Carro carro2 = new Carro("Honda", "Civic", 2019);
        for (int i = 0; i<50; i++) {
            carro2.acelerar();
        }

        for (int i = 0; i<20; i++) {
            carro2.frear();
        }
        System.out.printf("\nMarca: %s | Modelo: %s | Ano: %d | Velocidade atual: %d", carro2.marca, carro2.modelo, carro2.anoDeFabricacao, carro2.velocidade);
    }
}
