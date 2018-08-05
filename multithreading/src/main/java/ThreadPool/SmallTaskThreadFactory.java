package ThreadPool;

import java.util.concurrent.ThreadFactory;

/**
 * Created by Umair Akram on 8/4/2018.
 */
public class SmallTaskThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        //here you can assign diffret aspects to the Thread for example
        // Set Priority
        // Make it a deamon Thread
        // Change default stack size
        return new Thread(r);
    }
}
