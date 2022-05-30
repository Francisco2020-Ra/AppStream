package StreamGuidedPractice;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class ExerciseItem2 {
    public static void main(String[] args) {
        Collection<String> listVowels = Arrays.asList("a","e","i","o","u");
        Stream<String> streamListVowels = listVowels.stream();

        streamListVowels.forEach((l)-> System.out.println(l));

    }
}
