package lista1.ex3;

public class TestarData {
    public static void main(String[] args) {
        Data data1 = new Data();
        System.out.println(data1.formatarData('-'));
        Data data2 = new Data("2009");
        System.out.println(data2.formatarData('/'));
        Data data3 = new Data("18","4","2005");
        System.out.println(data3.formatarData('|'));
    }
}
