package com.minhle;

public class UnluckyExercises implements LuckyExercises{

    @Override
    public String getLuckyWorkout() {
        return "Oh ...Bad luck for you. Can not attend this exercise one more time";
    }
}
