package de.example.quizui;

import de.example.quizui.frame.QuizFrame;

/**
 * Startklasse der Anwendung.
 * <p>
 * Diese Klasse initialisiert das Look-and-Feel und startet anschließend
 * das Hauptfenster der reinen Swing-GUI.
 * </p>
 */
public class AppLauncher extends Object{

    /**
     * Einstiegspunkt der Anwendung.
     *
     * @param args Kommandozeilenargumente, werden in dieser Anwendung nicht verwendet
     */
    public static void main(String[] args) {
//       
//    		if (args != null) {
//    			for (int i = 0; i < args.length; i++)
//    				System.out.print(args[i]);
//    		}
            new QuizFrame();
    }
}
