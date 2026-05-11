package de.example.quizui.element;

import javax.swing.JRadioButton;

import de.example.quizdata.objects.Answer;

import java.awt.Color;
import java.awt.Font;

/**
 * Generalisierte Basisklasse für Radio-Buttons der Anwendung.
 */
public class AppRadioButton extends JRadioButton {

	Answer answer;

	/**
	 * Erstellt einen Radio-Button mit Text.
	 *
	 * @param answer Anser-Object
	 */
	public AppRadioButton(Answer answer) {
		super(answer.getText());
		this.answer = answer;
		initialize();
	}

	public boolean isCorrect() {
		return answer.isCorrect();
	}

	/**
	 * Initialisiert gemeinsame Basiseigenschaften des Radio-Buttons.
	 */
	private void initialize() {
		setOpaque(false);
		setFont(new Font("SansSerif", Font.PLAIN, 20));
		setForeground(new Color(40, 40, 40));
		setFocusPainted(false);
	}

	public void setAnswer(Answer ans) {
		answer = ans;
		setSelected(false);
		setForeground(Color.BLACK);
		setText(answer.getText());
	}
	
	public Answer getAnswer() {
		return answer;
	}
}














