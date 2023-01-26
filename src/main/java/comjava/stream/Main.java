package comjava.stream;

import java.time.LocalDate;
import java.time.Period;
import comjava.udemyfunctional.Consumer;

public class Main {

    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.now().plusMonths(1).plusDays(1);

        Period period = Period.between(localDate1, localDate2);
        System.out.println(period.getDays());
    }

    public static void print(int x) {
        int y = 1;


        Consumer<String> supplier = (e) -> System.out.println(x + y);

    }

    @FunctionalInterface
    public interface FuncTest {
        String test(String position, int str);
    }

}
