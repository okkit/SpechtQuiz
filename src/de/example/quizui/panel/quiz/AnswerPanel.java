package de.example.quizui.panel.quiz;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;

import de.example.quizdata.objects.Answer;
import de.example.quizui.UIConstants;
import de.example.quizui.element.AppPanel;
import de.example.quizui.element.AppRadioButton;

/**
 * Panel für die Anzeige der auswählbaren Antwortoptionen.
 */
public class AnswerPanel extends AppPanel {

	List<Answer> list;
	List<AppRadioButton> radioButtons;

	/**
	 * Erstellt das Antwort-Panel.
	 * 
	 * @param list
	 */
	public AnswerPanel(List<Answer> list) {

		this.list = list;
		radioButtons = new ArrayList<AppRadioButton>(list.size());
		initializePanel();
		buildLayout();
	}

	/**
	 * Initialisiert Layout, Rahmen und Hintergrund des Panels.
	 */
	private void initializePanel() {
		setLayout(new GridLayout(4, 1, 0, 18));
		setBorder(UIConstants.AP_EMPTY_BORDER);
		setBackground(Color.WHITE);
	}

	/**
	 * Baut die Antwortoptionen des Panels auf.
	 */
	private void buildLayout() {
		ButtonGroup buttonGroup = new ButtonGroup();

		for (Answer answer : list) {
			AppRadioButton radioButton = new AppRadioButton(answer.getText());
			buttonGroup.add(radioButton);
			radioButtons.add(radioButton);
			add(radioButton);

			radioButton.addActionListener(e -> checkAnswer(e, answer.isCorrect()));
		}
	}

	public void checkAnswer(ActionEvent e, boolean correct) {

		if (e.getSource() instanceof AppRadioButton) {
			AppRadioButton rb = (AppRadioButton) e.getSource();
			System.out.println(rb.getText() + " ist " + correct);
			// Schrift grühn, wenn Korrekt, sonst rot

			if (correct)
				rb.setForeground(Color.GREEN);
			else {
				rb.setForeground(Color.RED);
				for (int i = 0; i < radioButtons.size(); i++) {
					if (list.get(i).isCorrect())
						radioButtons.get(i).setForeground(Color.GREEN);
				}
			}

		}
	}
}
