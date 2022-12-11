package comjava.generic;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<BookMark> list = new ArrayList<>();
    }

    public static <T> T go(T t1, T t2) {
        return t1;
    }

    public static <T extends BookMark> void number(List<T> list) {}
}
