package de.example.quizdata.objects;

import java.util.ArrayList;
import java.util.List;

public class Question {

	private String text;
	private String info;
	private List<Answer> answers;

	public Question(String text) {
		super();
		this.text = text;
		answers = new ArrayList<Answer>();
	}

	public void addAnswer(String text, boolean correct) {
		addAnswer(new Answer(text, correct));
	}

	public void addAnswer(Answer answer) {
		if (answers != null) {

			answers.add(answer);
			answer.setQuestion(this);
		}
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

}
