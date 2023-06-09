package com.hibernate.many;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Answer1 {
	@Id
	private int answer_Id;
	private String answer;

	@ManyToOne
	private Question1 question;

	public Answer1(int answer_Id, String answer, Question1 question) {
		this.answer_Id = answer_Id;
		this.answer = answer;
		this.question = question;
	}

	public Answer1() {

	}

	public void setAnswer_Id(int answer_Id) {
		this.answer_Id = answer_Id;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public void setQuestion(Question1 question) {
		this.question = question;
	}

	public int getAnswer_Id() {
		return answer_Id;
	}

	public String getAnswer() {
		return answer;
	}

	public Question1 getQuestion() {
		return question;
	}

	@Override
	public String toString() {
		return "Answer1 [answer_Id=" + answer_Id + ", answer=" + answer + question + "]";
	}

}
