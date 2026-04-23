package de.example.quizdata;

import java.util.Random;

import de.example.quizdata.objects.Answer;
import de.example.quizdata.objects.Question;
import de.example.quizdata.objects.Quiz;

public class FakeDataManager implements QuizDataManager {

	@Override
	public Quiz getQuiz() {

		Quiz quiz = createFirstQuiz();
		return quiz;
	}
	

	private Quiz createFirstQuiz() {

		Quiz q = new Quiz("Java Bingo");
		// TODO: 1. vier Fragen, 2. je Frage vier Antworten

		int fragenAnzahl = 4; // Wir erstellen mehrere (fragenAnzahl) Fakefragen
		int antwortenAnzahl = 4; // Zu jeder Frage erstellen wir mehrere (antwortenAnzahl)
									// Fakeantworten
		Random zufall = new Random();
		int zufallsJ; // Index der richtigen Frage. Wird zufällig festgelegt.

		for (int i = 0; i < fragenAnzahl; i++) {
			Question frage = new Question("Dies ist die Quiz-Frage Nummer " + i); // Eine neue Frage
			q.addQuestion(frage); // Die Frage zum Quiz hinzufügen

			// Index für die richtige Frage zufällig bestimmen
			zufallsJ = zufall.nextInt(antwortenAnzahl);
			for (int j = 0; j < antwortenAnzahl; j++) {
				if (j == zufallsJ)
					frage.addAnswer("A" + j, true);
				else
					frage.addAnswer("A" + j, false); // Alle anderen Antworten sind
			}
		}
		return q;
	}

}
