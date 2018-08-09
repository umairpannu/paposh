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
        Integer i = new Integer(120);
        Integer v = Integer.valueOf(120);
        Integer x = Integer.valueOf(120);
        if(v == x)
            System.out.println("i , v are equal");
        if((int)i == 120)
            System.out.println("i , 120 are equal");


    }
}
