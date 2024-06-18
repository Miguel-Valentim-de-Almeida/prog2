package trabalho_prog_II;

public class SpamDetector {
    private String matrizSpamPeso[][];
    
    public SpamDetector () {
        matrizSpamPeso = new String[10][2];
        matrizSpamPeso[0][0] = "você ganhou";
        matrizSpamPeso[0][1] = "8";
        matrizSpamPeso[1][0] = "tentativa de entrega frustrada";
        matrizSpamPeso[1][1] = "7";
        matrizSpamPeso[2][0] = "empréstimos para negativados";
        matrizSpamPeso[2][1] = "10";
        matrizSpamPeso[3][0] = "oferta imperdível";
        matrizSpamPeso[3][1] = "9";
        matrizSpamPeso[4][0] = "ganhe dinheiro fácil";
        matrizSpamPeso[4][1] = "4";
        matrizSpamPeso[5][0] = "promoção exclusiva";
        matrizSpamPeso[5][1] = "5";
        matrizSpamPeso[6][0] = "acesse agora!";
        matrizSpamPeso[6][1] = "1";
        matrizSpamPeso[7][0] = "não perca essa chance";
        matrizSpamPeso[7][1] = "3";
        matrizSpamPeso[8][0] = "descontos arrasadores";
        matrizSpamPeso[8][1] = "2";
        matrizSpamPeso[9][0] = "ganhe prêmios incríveis";
        matrizSpamPeso[9][1] = "6";   
    }
    
    public int procurarSpam (String texto) {
        int pontuacao = 0;
        for (int i = 0; i<10; i++) {
            if (texto.contains(matrizSpamPeso[i][0])) {
                pontuacao += Integer.parseInt(matrizSpamPeso[i][1]);
            } 
        }
        return pontuacao;
    }
    
    public String classificarSpam (int pontuacao) {
        if (pontuacao >= 5 && pontuacao <= 30) {
            return "Fracamento suspeito!\n";
        } else if (pontuacao >= 31 && pontuacao <= 70) {
            return "Potencialmente suspeito!\n";
        } else if (pontuacao > 70) {
            return "Spam\n";
        } else {
            return "Não é spam";
        }
    } 
}
