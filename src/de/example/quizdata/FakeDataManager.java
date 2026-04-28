package de.example.quizdata;

import java.util.Random;

import de.example.quizdata.objects.Answer;
import de.example.quizdata.objects.Question;
import de.example.quizdata.objects.Quiz;
import de.example.quizdata.objects.Subject;

public class FakeDataManager implements QuizDataManager {

	@Override
	public Quiz getQuiz() {

		Quiz quiz = createJavaQuiz();
		return quiz;
	}

	private Quiz createJavaQuiz() {

		Quiz java = new Quiz("Java");
		Subject sub = new Subject("Java-Keywords");

		Question quest = new Question("Welche Variable wird mit dem Keyword static deklariert?");
		quest.setSubject(sub);
		java.addQuestion(quest);

		Answer ans = new Answer("Lokale Variable", false);
		quest.addAnswer(ans);
		ans = new Answer("Instanzariable", false);
		quest.addAnswer(ans);
		ans = new Answer("Laufvariable", false);
		quest.addAnswer(ans);
		ans = new Answer("Klassenvariable", false);
		quest.addAnswer(ans);
		quest.setInfo(
				"Um eine statische Variable verwenden zu können braucht man keine Instanz der Klasse.");

		quest = new Question(
				"Welches Keyword wird bei der Deklaration einer Methode verwendet, die keinen Returnwert zurückgibt?");
		quest.setSubject(sub);
		java.addQuestion(quest);

		quest.addAnswer(new Answer("private", false));
		quest.addAnswer(new Answer("stacic", false));
		quest.addAnswer(new Answer("void", false));
		quest.addAnswer(new Answer("String", false));
		quest.setInfo(
				"Bei der Deklaration einer Methode muss der Datentyp des Rückgabewertes benannt werden.");

		return java;
	}

	/**
	 * Erzeugt ein Fake-Quiz.<br>
	 * 
	 * @return Quiz-Object
	 */
	private Quiz createFirstQuiz() {

		Quiz q = new Quiz("Java Bingo");

		int fragenAnzahl = 4;
		int antwortenAnzahl = 4;
		Random zufall = new Random();
		int zufallsJ;

		for (int i = 0; i < fragenAnzahl; i++) {
			Question frage = new Question("Question " + i);
			q.addQuestion(frage);

			frage.setSubject(new Subject("Subject"));

			zufallsJ = zufall.nextInt(antwortenAnzahl);
			for (int j = 0; j < antwortenAnzahl; j++) {
				if (j == zufallsJ)
					frage.addAnswer("Answer " + j, true);
				else
					frage.addAnswer("Answer " + j, false);
			}
		}
		return q;
	}
}
