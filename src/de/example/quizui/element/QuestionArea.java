package de.example.quizui.element;

import javax.swing.JTextArea;

import de.example.quizui.UIConstants;

public class QuestionArea extends JTextArea {

	public QuestionArea() {
		super();
		setOpaque(false);
		setEditable(false);
		setLineWrap(true);
		setFont(UIConstants.FONT_TEXT);
		setForeground(UIConstants.TEXT_COLOR_STANDARD);
	}

	public QuestionArea(String text) {
		this();
		setText(text);
	}

}
