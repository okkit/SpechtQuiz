package de.example.quizui.panel.quiz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;

import de.example.quizui.UIConstants;
import de.example.quizui.element.AppLabel;
import de.example.quizui.element.AppPanel;

/**
 * Panel für die Anzeige der aktuellen Frage.
 */
public class QuestionPanel extends AppPanel {

    /**
     * Erstellt das Fragen-Panel.
     */
    public QuestionPanel() {
        initializePanel();
        buildLayout();
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
        AppLabel questionLabel = new AppLabel(
                "<html>Wie viele Methoden<br>kann eine Klasse haben?</html>"
        );
        questionLabel.setAppFontStyle(Font.PLAIN, 34);

        add(questionLabel, BorderLayout.CENTER);
    }
}
