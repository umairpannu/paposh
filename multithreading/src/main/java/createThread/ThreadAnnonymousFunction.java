package createThread;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * Created by Umair Akram on 8/4/2018.
 */
public class ThreadAnnonymousFunction {
    public static Void computePrimeAsync(int x){
        new Thread(()-> {isPrime(656565);}).start();

        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                isPrime(x);
                System.out.println("Thread Ended");
            }
        });
        th.start();
        System.out.println("Thread started");
        return null;
    }
    private static boolean isPrime(int number){
        return Stream.iterate(1, i -> i+1).limit((int)Math.sqrt(number)).map(x -> number % x == 0).filter(x -> x == true).count() <= 2;
    }
}
