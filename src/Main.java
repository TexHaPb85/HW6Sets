import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>(new IntegerASCComparatorByEven());
        numbers.add(2);
        numbers.add(1);
        numbers.add(4);
        numbers.add(-4);
        numbers.add(-1);
        numbers.add(-5);
        numbers.add(-2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(6);

        System.out.println(numbers);
    }
}
