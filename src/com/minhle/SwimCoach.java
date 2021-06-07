package com.minhle;

public class SwimCoach implements Coach{
    private String _mName;
    private long _mPhone;
    private LuckyExercises _mLuckyExercises;
    public SwimCoach() {
        System.out.println("Call a swim coach...");
    }

    public SwimCoach(LuckyExercises _mLuckyExercises) {
        System.out.println("Call a swim coach with set fortune");
        this._mLuckyExercises = _mLuckyExercises;
    }

    @Override
    public String getDailyWorkout() {
        return "Let swill 5 times around the pool";
    }

    @Override
    public String letCheckMyLuck() {
        return _mLuckyExercises.getLuckyWorkout();
    }

    public void set_mName(String _mName) {
        this._mName = _mName;
    }

    public void set_mPhone(long _mPhone) {
        this._mPhone = _mPhone;
    }

    public void set_mLuckyExercises(LuckyExercises _mLuckyExercises) {
        this._mLuckyExercises = _mLuckyExercises;
    }

    @Override
    public String toString() {
        return "SwimCoach{" +
                "_mName='" + _mName + '\'' +
                ", _mPhone=" + _mPhone +
                ", _mLuckyExercises=" + _mLuckyExercises +
                '}';
    }
}
