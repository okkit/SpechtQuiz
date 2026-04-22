package de.example.quizui.panel.quiz;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JScrollPane;

import de.example.quizui.element.AppLabel;
import de.example.quizui.element.AppPanel;
import de.example.quizui.element.AppTextArea;

/**
 * Panel für zusätzliche Informationen zur aktuellen Frage oder Antwort.
 */
public class InfoPanel extends AppPanel {

    /**
     * Erstellt das Info-Panel.
     */
    public InfoPanel() {
        initializePanel();
        buildLayout();
    }

    /**
     * Initialisiert Layout, Rahmen und Hintergrund des Panels.
     */
    private void initializePanel() {
        setLayout(new BorderLayout(0, 10));
        setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(180, 180, 180), 1),
                BorderFactory.createEmptyBorder(15, 15, 15, 15)
        ));
        setBackground(Color.WHITE);
    }

    /**
     * Baut die enthaltenen Komponenten des Panels auf.
     */
    private void buildLayout() {
        AppLabel infoLabel = new AppLabel("Info:");

        // TODO
        // Schreibt die Klasse AppTextArea und verwendet diese hier 
        // den Konstruktor der Klasse anstatt die Methode buildInfoArea() aufzurufen.
        // LÖsung:
//        das kommt weg: JTextArea infoArea = buildInfoArea();
//        anstatt:
        AppTextArea infoArea = new AppTextArea();
        JScrollPane scrollPane = new JScrollPane(infoArea);

        add(infoLabel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }


    // TODO. Dies all soll in den Knstruktor der neuen Klasse AppTextArea
    // Die Methode kommt hier weg
    // Das, was in der Methode gemacht wird, übernimmt die Klasse AppTextArea selbst.
    // Wi eÜbernimmt sie das?
    // 1. Variaente: alle set... im Konstruktor
    // 2. Variante: die komplette Methode übernehmen und (!) anpassen
//    private JTextArea buildInfoArea() {
//    	
//        JTextArea infoArea = new JTextArea();
//        infoArea.setLineWrap(true);
//        infoArea.setWrapStyleWord(true);
//        infoArea.setEditable(false);
//        infoArea.setFont(new Font("SansSerif", Font.PLAIN, 18));
//        infoArea.setBackground(Color.WHITE);
//        infoArea.setText(
//                "Klassen in Java können beliebig viele Methoden enthalten.\n"
//                        + "Die Anzahl ist grundsätzlich nicht fachlich auf 1, 64 oder 0 begrenzt.\n\n"
//                        + "Diese Oberfläche bildet nur das Mockup nach.\n"
//                        + "Logik, Auswertung und Persistenz sind bewusst nicht enthalten."
//        );
//        return infoArea;
//    }
}
