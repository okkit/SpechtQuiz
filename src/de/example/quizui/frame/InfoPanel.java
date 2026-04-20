package de.example.quizui.frame;

import java.awt.BorderLayout;

import de.example.quizui.panel.ResultPanel;
import de.example.quizui.ui.AppPanel;

public class InfoPanel extends AppPanel {

	public InfoPanel() {
		super(new BorderLayout(0, 15));
		add(new ResultPanel(), BorderLayout.NORTH);
		add(new InfoPanel(), BorderLayout.CENTER);
	}

}
