package ca.self.practice;

import java.util.ArrayList;

/**
 * Ordered Pair.
 *
 * @param <K> key
 * @param <V> value
 * @author LukeB
 * @version October 2021
 */
public class OrderedPair<K, V> {

    private K first;
    private V second;

    public OrderedPair(final K key, final V value) {
        first = key;
        second = value;
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public static <K, V> boolean same(final OrderedPair<K, V> p1, final OrderedPair<K, V> p2) {
        return p1.getFirst().equals(p2.getFirst())
                && p1.getSecond().equals(p2.getSecond());
    }

    public static void main(String[] args) {
        OrderedPair<String, String> keyValuePair = new OrderedPair<>("key", "value");
        ArrayList<Integer> number = new ArrayList<>();
        number.add(6);
        number.add(3);
        number.add(1);
        OrderedPair<Integer, ArrayList<Integer>> numberAndList =
                new OrderedPair<>(1, number);

        OrderedPair<Integer, Integer> firstNumber = new OrderedPair<>(2, 4);
        OrderedPair<Integer, Integer> secondNumber = new OrderedPair<>(3, 9);

//        OrderedPair<Box<double>, Box<double>> boxes =
//                new OrderedPair<>();
        boolean state = same(firstNumber, secondNumber);
        System.out.printf(state ? "True" : "False");

    }

}
