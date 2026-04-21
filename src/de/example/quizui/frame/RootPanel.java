package de.example.quizui.frame;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;

import de.example.quizui.panel.HeaderPanel;
import de.example.quizui.ui.AppPanel;

public class RootPanel extends AppPanel{

	public RootPanel() {
		super(new BorderLayout(0, 15));
		setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		setBackground(new Color(245, 245, 245));
		
		add(new HeaderPanel(), BorderLayout.NORTH);
		add(new QuizPanel(), BorderLayout.CENTER);
	}

}
