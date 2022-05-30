package StreamGuidedPractice;

import java.util.stream.Stream;

public class ExerciseItem3 {

    public static void main(String[] args) {
        Stream<Integer> listNumber = Stream.iterate(40, n -> n + 2).limit(20);
        listNumber.forEach(n -> System.out.println(n));
        System.out.println(listNumber);
    }
}
