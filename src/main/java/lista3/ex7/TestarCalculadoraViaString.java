package lista3.ex7;

public class TestarCalculadoraViaString {
    public static void main(String[] args) {
        int chamandoMetodo = CalculadoraViaString.Calcular("SOM", 2,6,9,8);
        if (chamandoMetodo == 0) {
            System.out.println("Operacao invalida!");
        } else {
            System.out.println(chamandoMetodo);
        }
    }  
}
