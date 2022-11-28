package Streams.Methods;

import java.util.Arrays;
import java.util.List;

public class ParallelStream_Method {
    public static void main(String[] args) {

        List<Double> doubleList = List.of(10.0, 5.0, 1.0, 0.25);


        //double sumRes = doubleList.parallelStream().reduce((acc, el)-> acc + el).get();
        double divRes = doubleList.parallelStream().reduce((acc, el)->acc/el).get();

       // System.out.println(sumRes);
        System.out.println(divRes);



    }
}
