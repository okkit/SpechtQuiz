package de.example.quizui.frame;

import de.example.quizui.panel.AnswerPanel;
import de.example.quizui.panel.HeaderPanel;
import de.example.quizui.panel.InfoPanel;
import de.example.quizui.panel.QuestionPanel;
import de.example.quizui.panel.ResultPanel;
import de.example.quizui.ui.AppPanel;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

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
        add(buildMainPanel());
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

    /**
     * Baut das Wurzel-Panel des Fensters auf.
     *
     * @return das Hauptpanel der Anwendung
     */
    private AppPanel buildMainPanel() {
//        AppPanel rootPanel = new AppPanel(new BorderLayout(0, 15));
//        rootPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
//        rootPanel.setBackground(new Color(245, 245, 245));
    	
    	RootPanel rootPanel = new RootPanel();

//        rootPanel.add(new HeaderPanel(), BorderLayout.NORTH);
        rootPanel.add(buildCenterPanel(), BorderLayout.CENTER);

        return rootPanel;
    }

    /**
     * Baut den mittleren Inhaltsbereich auf.
     *
     * @return das mittlere Panel mit Frage, Antworten und unterem Bereich
     */
    private JPanel buildCenterPanel() {
//        AppPanel centerPanel = new AppPanel(new BorderLayout(0, 15));

    	QuizPanel centerPanel = new QuizPanel();
//        centerPanel.add(new QuestionPanel(), BorderLayout.NORTH);
//        centerPanel.add(new AnswerPanel(), BorderLayout.CENTER);
        centerPanel.add(buildBottomSection(), BorderLayout.SOUTH);

        return centerPanel;
    }

    /**
     * Baut den unteren Bereich mit Ergebnis- und Infopanel auf.
     *
     * @return das untere Panel
     */
    private JPanel buildBottomSection() {
//        AppPanel bottomPanel = new AppPanel(new BorderLayout(0, 15));

    	InfoPanel bottomPanel = new InfoPanel();
//        bottomPanel.add(new ResultPanel(), BorderLayout.NORTH);
//        bottomPanel.add(new InfoPanel(), BorderLayout.CENTER);

        return bottomPanel;
    }
}
