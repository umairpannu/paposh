package Locking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Umair Akram on 8/4/2018.
 */
public class UnboundedArrayQueue<T> {
    private final List ls = new ArrayList<T>();
    public synchronized void add(T elem){
        ls.add(elem);
    }
    public synchronized T get(int index){
        return (T)ls.get(index);
    }
    public synchronized boolean isPresent(int value){
        return ls.stream().anyMatch(x -> x.equals(value));
    }
    public synchronized boolean remove(T value){
        return ls.remove(value);
    }

}

