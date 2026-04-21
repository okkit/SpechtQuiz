package de.example.quizui.panel.header;

import javax.swing.BorderFactory;
import javax.swing.SwingConstants;

import de.example.quizui.element.AppLabel;
import de.example.quizui.element.AppPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

/**
 * Panel für den oberen Kopfbereich der Oberfläche.
 * <p>
 * Es zeigt den aktuellen Fragenfortschritt sowie die Anzahl
 * der richtig beantworteten Fragen an.
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
        setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(180, 180, 180), 1),
                BorderFactory.createEmptyBorder(10, 15, 10, 15)
        ));
        setBackground(Color.WHITE);
    }

    /**
     * Baut die enthaltenen Komponenten des Panels auf.
     */
    private void buildLayout() {
        AppLabel questionCounterLabel = new AppLabel("Frage 10 / 16");
        questionCounterLabel.setAppFontStyle(Font.PLAIN, 28);

        AppLabel scoreLabel = new AppLabel("Richtig: 2 / 10", SwingConstants.RIGHT);
        scoreLabel.setAppFontStyle(Font.BOLD, 28);
        scoreLabel.setForeground(new Color(0, 120, 90));

        add(questionCounterLabel, BorderLayout.WEST);
        add(scoreLabel, BorderLayout.EAST);
    }
}
