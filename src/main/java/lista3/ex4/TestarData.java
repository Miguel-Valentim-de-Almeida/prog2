package lista3.ex4;
import java.time.LocalDate;

public class TestarData {
    public static void main(String[] args) {
        LocalDate data1 = LocalDate.now();
        data1 = Data.mudarData(data1, 2006);
        System.out.println(data1);
        data1 = Data.mudarData(data1, 02, 2003);
        System.out.println(data1);
        data1 = Data.mudarData(data1, 18, 04, 2005);
        System.out.println(data1);
    }
}
