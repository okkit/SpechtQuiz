package de.example.quizui.element;

import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Font;

/**
 * Generalisierte Basisklasse für Radio-Buttons der Anwendung.
 */
public class AppRadioButton extends JRadioButton {

    /**
     * Erstellt einen Radio-Button mit Text.
     *
     * @param text anzuzeigender Text
     */
    public AppRadioButton(String text) {
        super(text);
        initialize();
    }

    /**
     * Initialisiert gemeinsame Basiseigenschaften des Radio-Buttons.
     */
    private void initialize() {
        setOpaque(false);
        setFont(new Font("SansSerif", Font.PLAIN, 20));
        setForeground(new Color(40, 40, 40));
        setFocusPainted(false);
    }
}
