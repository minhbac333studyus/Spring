package com.minhle;

import java.util.Random;

public class RandomExercises implements LuckyExercises{
    private final String[]  allExerciese= {
            "Random: Do 10 times this exercises hahaha",
            "Random: Do 10 times this exercises hahaha",
            "Random: Do 10 times this exercises hahaha"
    };

    @Override
    public String getLuckyWorkout() {
        int ranIndex = (int) (Math.random() * (2)) ;
        return allExerciese[ranIndex];
    }
}
