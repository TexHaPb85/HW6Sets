import java.util.Comparator;

public class IntegerAscComparatorByEven implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        if (Math.abs(o1 % 2) == Math.abs(o2 % 2)) {
            return o1 - o2;
        } else if (o1 % 2 == 0) {
            return -1;
        } else return 1;
    }
}
