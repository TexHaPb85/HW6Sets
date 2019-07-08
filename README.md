# HW6Sets
# 2. Difference between Comparable and Comparator
Comparable and Comparator are the interfaces, that implement comparation of objects in java. 
The main difference is, that Comparable implements method compareTo(Object o) and usually sets the default ordering of objects, 
but Comparable can compare our objects just by one certain factor, if we want to have an ability to compare objects by many factors,
we can create a Comparator class which implements method compare(Object o1,Object o2)for every of factor that we want to compare.

# 3.1 Why in PriorityQueue MAX capacity is MAX_INTEGER- 8?
As written in PriorityQueue class:
   /**
     * The maximum size of array to allocate.
     * Some VMs reserve some header words in an array.
     * Attempts to allocate larger arrays may result in
     * OutOfMemoryError: Requested array size exceeds VM limit
     */
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
 We subtract 8 because because array needs memory(4*8=32 bytes) to safe its lenght, flags and lock.
 # 3.2 Why does priority queue has default initial capacity of 11?
 It's a prime number, it's small enough to be trivial but large enough to be useful. Also, it prevents having to grow the queue from 1->2,   2->3, 3->4 if you want to add 1000 objects. Although "The details of the growth policy are not specified", it is vanishingly unlikely to be O(N), and in fact "this implementation provides O(log(n)) time for the enqueing and dequeing methods."
