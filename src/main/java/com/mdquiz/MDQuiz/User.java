package com.mdquiz.MDQuiz;

public class User {

	private String quizId;

	private String fullName;

	public String getQuizId() {
		return quizId;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "user {Quiz Number ="+quizId +" Name = "+fullName+"}";
	}

	public void setQuizId(String quizId) {
		this.quizId = quizId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
