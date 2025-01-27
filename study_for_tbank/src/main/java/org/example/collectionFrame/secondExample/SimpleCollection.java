package org.example.collectionFrame.secondExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class SimpleCollection {
    public static void main(String[] args){
        Collection<Integer> c = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++){
            c.add(i);
            c.addAll(Arrays.asList(1,2,3,4));
        }
        for (Integer i : c){
            System.out.println(i);
        }
    }
}
