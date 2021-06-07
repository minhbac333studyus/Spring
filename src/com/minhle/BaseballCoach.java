package com.minhle;

public class BaseballCoach implements Coach  {
	private LuckyExercises luckyExercises;
	public BaseballCoach () {
		System.out.println("Call a baseball Coach...");
	}

	public void setLuckyExercises(LuckyExercises luckyExercises) {
		this.luckyExercises = luckyExercises;
	}

	public BaseballCoach(LuckyExercises luckyExercises){

		System.out.println("Call a baseball Coach that have lucky....");
		this.luckyExercises= luckyExercises;
	}
	@Override
	public String getDailyWorkout() {
		return "Baseball coach: Let do some baseball exercises";
	}

	@Override
	public String letCheckMyLuck() {
		System.out.println("Let baseball coach give your luck...");
		return luckyExercises.getLuckyWorkout();
	}


}








