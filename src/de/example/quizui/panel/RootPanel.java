package de.example.quizui.panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.List;

import de.example.quizdata.objects.Question;
import de.example.quizdata.objects.Quiz;
import de.example.quizui.element.AppPanel;
import de.example.quizui.panel.header.HeaderPanel;
import de.example.quizui.panel.quiz.QuizPanel;
/**
 * Das Panel hält zwei separate Bereiche: Header und Quiz;<br>
 * Hält auch die Daten = den Quiz, der gespielt werden soll.
 */
public class RootPanel extends AppPanel {

	private HeaderPanel headerPanel;
	private QuizPanel quizPanel;
	
//	List<Component> component; 
//	Das Feld component gehört der Klasse Container
//	Container ist die super.super...superKlasse des RootPanels 

	public RootPanel(Quiz quiz) {
		super(new BorderLayout(0, 15));

		int questionCount = quiz.getQuestions().size();
		
		headerPanel = new HeaderPanel(questionCount); ////////////////////
		add(headerPanel, BorderLayout.NORTH);
	
		List<Question> liste = quiz.getQuestions();
		
		quizPanel = new QuizPanel(liste, headerPanel); ////////////////
		quizPanel.questionNumberUpdater = headerPanel;
		add(quizPanel, BorderLayout.CENTER);
	}
	
	
	@Override
    protected void initialize() {
    	super.initialize();
		setBackground(new Color(217, 242, 208));
    }
}
