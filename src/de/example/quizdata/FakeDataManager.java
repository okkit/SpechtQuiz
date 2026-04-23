package de.example.quizdata;

import java.util.Random;

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
		int antwortenAnzahl = 4; // Zu jeder Frage erstellen wir mehrere (antwortenAnzahl) Fakeantworten
		Random zufall = new Random();
		int zufallsJ; // Index der richtigen Frage. Wird zufällig festgelegt.

		for (int i = 0; i < fragenAnzahl; i++) {
			Question frage = new Question("Frage " + i); // Eine neue Frage

			zufallsJ = zufall.nextInt(antwortenAnzahl); // Zufallsindex der richtigen Antwort

			for (int j = 0; j < antwortenAnzahl; j++) {
				if (j == zufallsJ)
					frage.addAnswer("Richtige Antwort " + j, true); // Eine richtige Antwort zur Frage hinzufügen
				else
					frage.addAnswer("Falsche Antwort " + j, false); // Alle anderen Antworten sind falsche Antworten
			}

		}
		return q;
	}

}
