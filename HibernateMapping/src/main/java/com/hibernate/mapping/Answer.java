package com.hibernate.mapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Answer {
	@Id
	private int answer_Id;
	private String answer;

	public Answer() {

	}

	public Answer(int answer_Id, String answer) {
		this.answer_Id = answer_Id;
		this.answer = answer;

	}

	public void setAnswer_Id(int answer_Id) {
		this.answer_Id = answer_Id;
	}

	public int getAnswer_Id() {
		return answer_Id;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getAnswer() {
		return answer;
	}
}
