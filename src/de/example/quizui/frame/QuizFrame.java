package de.example.quizui.frame;

import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * Hauptfenster der Quiz-Oberfläche.
 * <p>
 * Das Fenster enthält den Kopfbereich, den Fragenbereich, die Antwortoptionen,
 * die Ergebnisanzeige und den Infobereich. Es wird ausschließlich die GUI
 * aufgebaut, ohne fachliche Logik oder Persistenz.
 * </p>
 */
public class QuizFrame extends JFrame {

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
        setTitle("Quiz Oberfläche");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(900, 800));
        setLocationRelativeTo(null);
        setResizable(true);
    }

}
