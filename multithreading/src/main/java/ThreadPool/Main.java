package ThreadPool;

import java.util.concurrent.ExecutionException;

/**
 * Created by Umair Akram on 8/5/2018.
 */
public class Main {
    public static void main(String ...args) throws InterruptedException, ExecutionException {
        Processor processor  = new Processor();
        processor.submit(() ->{while (true) System.out.println("Task1");});
        processor.submit(() ->{while (true) System.out.println("Task2");});
        processor.submit(() ->{while (true) System.out.println("Task3");});
        processor.submit(() ->{while (true) System.out.println("Task4");});
        Thread.sleep(1000);
        System.out.println("Kahatam");
    }
}
