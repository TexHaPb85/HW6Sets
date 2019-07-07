import java.util.Set;
import java.util.TreeSet;

public class Main {

    private static Set<Integer> numbers = new TreeSet<>(new IntegerASCComparatorByEven());

    static {
        numbers.add(2);
        System.out.println(numbers);
        numbers.add(1);
        System.out.println(numbers);
        numbers.add(4);
        System.out.println(numbers);
        numbers.add(-4);
        System.out.println(numbers);
        numbers.add(-1);
        System.out.println(numbers);
        numbers.add(-5);
        System.out.println(numbers);
        numbers.add(-2);
        System.out.println(numbers);
        numbers.add(3);
        System.out.println(numbers);
        numbers.add(5);
        System.out.println(numbers);
        numbers.add(7);
        System.out.println(numbers);
        numbers.add(6);
        System.out.println(numbers);
    }

    public static void main(String[] args) {

    }
}
