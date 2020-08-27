package com.interview.collection.hash;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.stream.Stream;

public class SeqVsParallelStream {
    public static void main (String[] args) {
        String[] strings = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10","11","12","13"};

        System.out.println("-------\nRunning sequential\n-------");
        //run(Arrays.stream(strings).sequential());
        //System.out.println("-------\nRunning parallel\n-------");
        //run(Arrays.stream(strings).parallel());
        System.out.println(6&5);
        System.out.println(7&2);
        System.out.println(6&4);
        System.out.println(6&7);
    }
    public static void run (Stream<String> stream) {

        stream.forEach(s -> {
            System.out.println(LocalTime.now() + " - value: " + s +
                    " - thread: " + Thread.currentThread().getName()) ;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
