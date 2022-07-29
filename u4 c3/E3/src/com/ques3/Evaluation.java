package com.ques3;

public abstract class Evaluation {

	private final int numberOfQuestions;
	
	abstract void evaluationTiming();
	
	public Evaluation(int numberOfQuestions) {
		
		this.numberOfQuestions=numberOfQuestions;
	}
	
	void printNoOfQuestions() {
		
		System.out.println("No. of Questions in Evaluations : "+numberOfQuestions);
	}
	
	
}


class CodingEvaluation extends Evaluation {
	
	
	public CodingEvaluation(int numberOfQuestions) {
		super(numberOfQuestions);
		// TODO Auto-generated constructor stub
	}

	@Override
	void evaluationTiming() {
		// TODO Auto-generated method stub
		System.out.println("Evaluation Timing is : 2:00 to 3:30");
	}
}

class DSAEvaluation extends Evaluation {
	
	public DSAEvaluation(int numberOfQuestions) {
		super(numberOfQuestions);
		// TODO Auto-generated constructor stub
	}

	@Override
	void evaluationTiming() {
		// TODO Auto-generated method stub
		System.out.println("Evaluation Timg is : 9:30 to 11:00");
	}
}