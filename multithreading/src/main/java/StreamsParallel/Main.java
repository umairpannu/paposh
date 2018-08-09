package StreamsParallel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Umair Akram on 8/5/2018.
 */
public class Main {
    public static void main(String ...args){
        List<Integer> integers = Arrays.asList(1,2,2,3,5);
        integers.stream().flatMap();
        integers.stream().map(x -> new  Student(x)).collect(Collectors.toList());
    }
}
