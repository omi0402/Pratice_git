package com.hibernate.many;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Question1 {
	@Id
	private int question_Id;
	private String question;

	@OneToMany(mappedBy = "question")
	private List<Answer1> answer;

	public Question1(int question_Id, String question, List<Answer1> answer) {
		this.question_Id = question_Id;
		this.question = question;
		this.answer = answer;
	}

	public Question1() {

	}

	public String getQuestion() {
		return question;
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

	public List<Answer1> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer1> answer) {
		this.answer = answer;
	}

//	public void setAnswer(List<Answer> answer) {
//		this.answer = answer;
//	}

//	public List<Answer> getAnswer() {
//		return answer;
//	}

}
