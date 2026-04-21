package de.example.quizui.frame;

import javax.swing.JFrame;

import de.example.quizui.UIConstants;
import de.example.quizui.panel.RootPanel;

/**
 * Hauptfenster der Quiz-Oberfläche.
 * <p>
 * Das Fenster enthält den Kopfbereich, den Fragenbereich, die Antwortoptionen,
 * die Ergebnisanzeige und den Infobereich. Es wird ausschließlich die GUI
 * aufgebaut, ohne fachliche Logik oder Persistenz.
 * </p>
 */
public class QuizFrame extends JFrame{

    /**
     * Erstellt das Hauptfenster und initialisiert alle enthaltenen GUI-Bereiche.
     */
    public QuizFrame() {
        initializeFrame();
        add(new RootPanel());
        setVisible(true);
    }

    /**
     * Initialisiert die grundlegenden Fenstereigenschaften.
     */
    private void initializeFrame() {
        setTitle(UIConstants.APP_TITLE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(UIConstants.FRAME_DIMENSION);
        setLocationRelativeTo(null);
        setResizable(false);
    }

}
