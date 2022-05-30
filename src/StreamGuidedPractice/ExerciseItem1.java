package StreamGuidedPractice;

import java.util.stream.Stream;

public class ExerciseItem1 {
    public static void main(String[] args) {
        Stream<String> streamEmpty = Stream.empty();
        streamEmpty.forEach((l) -> System.out.println(l));
    }
}
