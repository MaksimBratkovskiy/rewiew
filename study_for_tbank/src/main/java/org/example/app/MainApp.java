package org.example.app;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;

public class MainApp {
    Function<Integer, Integer> addOne = x -> x + 1;

    // a method assigned to a reference, where
    // Consumer takes an input (void return):
    final Consumer<Integer> simpleReference1 = App::someMethod1;

    // a method assigned to a reference, where
    // IntConsumer takes an int input (void return):
    final IntConsumer simpleReference2 = App::someMethod2;

    // a method assigned to a reference, where
    // IntUnaryOperator uses int for its input and output:
    final Consumer<Integer> another = i -> System.out.println(i);

    MyInterface myInterface = (p1, p2) -> {
        return p2 + p1;
    };
}
