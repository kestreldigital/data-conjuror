package com.kestreldigital.conjuror;

import java.util.List;
import java.util.Random;

public class RandomUtils {

    private Random random;

    public RandomUtils() {
        random = new Random();
    }

    public int getListIndex(List list) {
        return random.nextInt(list.size());
    }
}
