package lista3.ex5;

import java.time.LocalDate;

public class TestarUtil {
    public static void main(String[] args) {
        LocalDate data1 = LocalDate.now();
        System.out.println(Util.formatarData(data1));
        LocalDate data2 = LocalDate.of(2005, 4, 18);
        System.out.println(Util.formatarData(data2));
    }
}
