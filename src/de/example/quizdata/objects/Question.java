package de.example.quizdata.objects;

import java.util.ArrayList;
import java.util.List;

public class Question {

	private String text; // Ohne Initialisierung null
	private String info; // Ohne Initialisierung null
	/**
	 * Aggregation (Sammlung) der Instanzen der Klasse Answer, bzw der
	 * Answer-Objekte.
	 */
	private List<Answer> answers = new ArrayList<Answer>(); // Ohne Initialisierung null

	// Standardkonstruktor
	public Question() {
		super(); // super braucht man nicht, wir tun es dennoch, um NICHT die Mutter zu vergessen 
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
		answers.add(answer); // Hier verwende ich answers. Es darf NICHT null sein.
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
