package org.example.collectionFrame.secondExample;
//:collectionFrame/secondExample/AppleWithOrangeWithoutGeneric
//Simple example with using container who trow
import java.util.ArrayList;

public class AppleWithOrangeWithoutGeneric{
    @SuppressWarnings("Unchecked")
    public static void main(String[] args){
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for(int i = 0; i < 3; i++){
            apples.add(new Apple());
            apples.add(new Fuji());
            apples.add(new Gala());
            apples.add(new Braeburn());
//            throws unchecked class exception
//            apples.add(new Orange());
        }
        for(Apple c: apples){
            System.out.println(c);
        }
    }
}