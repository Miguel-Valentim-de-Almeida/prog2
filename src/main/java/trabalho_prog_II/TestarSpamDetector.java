package trabalho_prog_II;

public class TestarSpamDetector {
    public static void main(String[] args) {
        SpamDetector teste = new SpamDetector();
        String texto = LeitorArquivo.lerArquivo("C:\\Users\\migue\\OneDrive\\Documentos\\NetBeansProjects\\lista_prog2\\src\\main\\java\\trabalho_prog_II\\frases_spam.txt");
        int pontuacao = teste.procurarSpam(texto);
        System.out.printf("Pontuação: %d\n", pontuacao);
        System.out.println(teste.classificarSpam(pontuacao));
    }
}
