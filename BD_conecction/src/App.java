import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {
        
        IntBinaryOperator exp = (x, y) -> {
            int operation = y / x;
            return operation;
        };


        int r2 = IntStream.rangeClosed(1, 5)
                .parallel().reduce(0, exp);

        int r3 = IntStream.rangeClosed(1, 5)
                .reduce(1, exp);
        System.out.println(r2);
        System.out.println(r3);
    }
}
