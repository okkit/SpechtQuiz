package de.example.quizui.element;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;

import de.example.quizui.UIConstants;

/**
 * Generalisierte Basisklasse für Buttons der Anwendung.
 */
public class AppButton extends JButton {

    /**
     * Erstellt einen Button mit Text.
     *
     * @param text anzuzeigender Text
     */
    public AppButton(String text) {
        super(text);
        initialize();
    }

    /**
     * Initialisiert gemeinsame Basiseigenschaften des Buttons.
     */
    private void initialize() {
        setFocusPainted(false);
        setFont(UIConstants.FONT_TEXT);
        setBackground(new Color(230, 230, 230));
        setForeground(UIConstants.TEXT_COLOR_STANDARD);
        setPreferredSize(new Dimension(200, 30));
    }
}
