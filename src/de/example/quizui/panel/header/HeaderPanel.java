package de.example.quizui.panel.header;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.SwingConstants;

import de.example.quizui.UIConstants;
import de.example.quizui.element.AppBigLabel;
import de.example.quizui.element.AppPanel;

/**
 * Panel für den oberen Kopfbereich der Oberfläche.
 * <p>
 * Es zeigt den aktuellen Fragenfortschritt sowie die Anzahl der richtig
 * beantworteten Fragen an.
 * </p>
 */
public class HeaderPanel extends AppPanel {

	/**
	 * Erstellt das Kopfbereich-Panel.
	 */
	public HeaderPanel() {
		initializePanel();
		buildLayout();
	}

	/**
	 * Initialisiert Layout, Rahmen und Hintergrund des Panels.
	 */
	private void initializePanel() {
		setLayout(new BorderLayout());
		setBorder(UIConstants.HP_COMPOUD_BORDER);
		setBackground(Color.WHITE);
	}

	/**
	 * Baut die enthaltenen Komponenten des Panels auf.
	 */
	private void buildLayout() {
		AppBigLabel questionCounterLabel = new AppBigLabel("Frage 10 / 16");
		AppBigLabel scoreLabel = new AppBigLabel("Richtig: 2 / 10", SwingConstants.RIGHT);

		add(questionCounterLabel, BorderLayout.WEST);
		add(scoreLabel, BorderLayout.EAST);
	}
}
