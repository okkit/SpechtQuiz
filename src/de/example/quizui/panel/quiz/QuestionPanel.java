package de.example.quizui.panel.quiz;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;

import de.example.quizui.UIConstants;
import de.example.quizui.element.AppLabel;
import de.example.quizui.element.AppPanel;

/**
 * Panel für die Anzeige der aktuellen Frage.
 */
public class QuestionPanel extends AppPanel {

    private AppLabel questionLabel;

	/**
     * Erstellt das Fragen-Panel.
     * @param text 
     */
    public QuestionPanel(String text) {
        initializePanel();
        buildLayout();
        questionLabel.setText(text);
    }

    /**
     * Initialisiert Layout, Rahmen und Hintergrund des Panels.
     */
    private void initializePanel() {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createCompoundBorder(
                UIConstants.QP_MATTE_BORDER,
                UIConstants.QP_EMPTY_BORDER
        ));
        setBackground(Color.WHITE);
    }

    /**
     * Baut die enthaltenen Komponenten des Panels auf.
     */
    private void buildLayout() {
         questionLabel = new AppLabel(
                "<html>Wie viele Methoden<br>kann eine Klasse haben?</html>"
        );

        add(questionLabel, BorderLayout.CENTER);
    }
}
