package de.example.quizui.element;

import javax.swing.JLabel;

import de.example.quizui.UIConstants;

import java.awt.Color;
import java.awt.Font;

/**
 * Generalisierte Basisklasse für Labels der Anwendung.
 * <p>
 * Diese Klasse kapselt gemeinsame Darstellungsmerkmale wie Standardfarbe
 * und Standardschrift.
 * </p>
 */
public class AppLabel extends JLabel {

    /**
     * Erstellt ein Label mit Text.
     *
     * @param text anzuzeigender Text
     */
    public AppLabel(String text) {
        super(text);
        initialize();
    }

    /**
     * Erstellt ein Label mit Text und horizontaler Ausrichtung.
     *
     * @param text anzuzeigender Text
     * @param horizontalAlignment horizontale Ausrichtung des Textes
     */
    public AppLabel(String text, int horizontalAlignment) {
        super(text, horizontalAlignment);
        initialize();
    }

    /**
     * Initialisiert gemeinsame Basiseigenschaften des Labels.
     */
    protected void initialize() {
        setForeground(UIConstants.TEXT_COLOR_STANDARD);
        setFont(UIConstants.FONT_TEXT);
    }

    /**
     * Setzt Schriftstil und Schriftgröße des Labels.
     *
     * @param style Schriftstil gemäß {@link Font}
     * @param size Schriftgröße
     */
//    public void setAppFontStyle(int style, int size) {
////        setFont(new Font("SansSerif", style, size));
//    }
}
