package de.example.quizdata.objects;

import java.util.ArrayList;
import java.util.List;

public class Question extends DataAccessObject{

	private String text;
	private String info;
	/**
	 * Aggregation (Sammlung) der Instanzen der Klasse Answer, <br>
	 * bzw der Answer-Objekte.
	 */
	private List<Answer> answers = new ArrayList<Answer>();

	// Standardkonstruktor
	public Question() {
		super();
		answers = new ArrayList<Answer>();
	}

	// Konstruktor
	public Question(String text) {
		this();
		this.text = text;
	}

	public void addAnswer(String text, boolean correct) {
		addAnswer(new Answer(text, correct));
	}

	public void addAnswer(Answer answer) {
		if (answers == null)
			answers = new ArrayList<Answer>();
		answers.add(answer);
		answer.setQuestion(this);
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
