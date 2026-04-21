package de.example.quizui.frame;

import java.awt.BorderLayout;

import de.example.quizui.panel.AnswerPanel;
import de.example.quizui.panel.InfoPanel;
import de.example.quizui.panel.QuestionPanel;
import de.example.quizui.ui.AppPanel;

public class QuizPanel extends AppPanel {

	public QuizPanel() {
		super(new BorderLayout(0, 15));
		add(new QuestionPanel(), BorderLayout.NORTH);
		add(new AnswerPanel(), BorderLayout.CENTER);
		add(new InfoPanel(), BorderLayout.SOUTH);
	}
	
	

}
