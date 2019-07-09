import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>(new IntegerAscComparatorByEven());
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
}
