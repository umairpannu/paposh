package ThreadPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Umair Akram on 8/4/2018.
 */
public class Processor {

    private final ExecutorService executorService = Executors.newFixedThreadPool(4);
    private final ExecutorService executorService2 = Executors.newWorkStealingPool();

    public synchronized void submit(Runnable runnable) throws ExecutionException, InterruptedException {
        executorService.submit(runnable);
        executorService.execute(runnable);
        Future<?> hey = executorService.submit(runnable);
        hey.get();

    }
    public void shutDown(){
        executorService.shutdown();
    }

}
