package createThread;

/**
 * Created by Umair Akram on 8/4/2018.
 */
public class ThreadWithExtends extends Thread{
    private final String name = "Umair";
    @Override
    public void run(){
        System.out.println(name);
    }
}
