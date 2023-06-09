package com.hibernate.mapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Question {
	@Id
	private int question_Id;
	private String question;

	@OneToOne
	private Answer answer;

	public Question() {

	}
	

	public Question(int question_Id, String question, Answer answer) {
		this.question_Id = question_Id;
		this.question = question;
		this.answer = answer;
	}

	public void setQuestion_Id(int question_Id) {
		this.question_Id = question_Id;
	}

	public int getQuestion_Id() {
		return question_Id;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getQuestion() {
		return question;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public Answer getAnswer() {
		return answer;
	}
}
