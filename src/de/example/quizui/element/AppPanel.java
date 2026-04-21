package de.example.quizui.element;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.LayoutManager;

/**
 * Generalisierte Basisklasse für Panels der Anwendung.
 * <p>
 * Diese Klasse kapselt gemeinsame Grundeinstellungen wie Hintergrundfarbe
 * und Standard-Innenabstand.
 * </p>
 */
public class AppPanel extends JPanel {

    /**
     * Erstellt ein Panel mit dem übergebenen Layoutmanager.
     *
     * @param layout zu verwendender Layoutmanager
     */
    public AppPanel(LayoutManager layout) {
        super(layout);
        initialize();
    }

    /**
     * Erstellt ein Panel mit Standardlayout von Swing.
     */
    public AppPanel() {
        initialize();
    }

    /**
     * Initialisiert gemeinsame Basiseigenschaften des Panels.
     */
    private void initialize() {
        setOpaque(true);
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    }
}
