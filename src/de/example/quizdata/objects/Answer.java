package de.example.quizdata.objects;

public class Answer {

	private String text;
	private boolean correct;
	private Question question;

	public Answer(String text) {
		super();
		this.text = text;
	}

	public Answer(String text, boolean correct) {
		super();
		this.text = text;
		this.correct = correct;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean isCorrect() {
		return correct;
	}

	public void setCorrect(boolean correct) {
		this.correct = correct;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

}
