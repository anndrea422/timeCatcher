package com.example.timeCatcher;

import java.util.function.Supplier;

public class UserNotFoundException<X> implements Supplier<X> {
    @Override
    public X get() {
        return null;
    }
}
