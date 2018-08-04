import createThread.ThreadAnnonymousFunction;
import createThread.ThreadWithExtends;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Umair Akram on 8/4/2018.
 */
public class Main {
    public static void main(String ...args){
        Stream.iterate(551315267, i -> i +1).limit(1).map(x -> ThreadAnnonymousFunction.computePrimeAsync(x)).collect(Collectors.toList());
        ThreadAnnonymousFunction.computePrimeAsync(7);
        ThreadWithExtends threadWithExtends = new ThreadWithExtends();
        threadWithExtends.start();
    }
}
