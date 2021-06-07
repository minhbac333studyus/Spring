package com.minhle;

public class TrackCoach implements Coach {
	private LuckyExercises luckyExercises;
	public TrackCoach() {
		System.out.println("Call a track coach...");
	}
	public TrackCoach(LuckyExercises theLuckyExercises){
		System.out.println("Call a track coach that have lucky");
		this.luckyExercises = theLuckyExercises;
	}

	public void setLuckyExercises(LuckyExercises luckyExercises) {
		this.luckyExercises = luckyExercises;
	}

	@Override
	public String getDailyWorkout() {
		return "TrackCoach: Let run 5 kilometers.";
	}

	@Override
	public String letCheckMyLuck() {
		System.out.println("Let track coach check your luck...");
		return luckyExercises.getLuckyWorkout();
	}

}










