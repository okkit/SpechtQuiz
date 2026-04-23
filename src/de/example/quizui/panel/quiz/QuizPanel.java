package de.example.quizui.panel.quiz;

import java.awt.BorderLayout;

import de.example.quizdata.objects.Question;
import de.example.quizui.element.AppPanel;

public class QuizPanel extends AppPanel {

	public QuizPanel(Question question) {
		super(new BorderLayout(0, 15));
		add(new QuestionPanel(question.getText()), BorderLayout.NORTH);
		add(new AnswerPanel(), BorderLayout.CENTER);
		add(new InfoPanel(), BorderLayout.SOUTH);
	}

}
