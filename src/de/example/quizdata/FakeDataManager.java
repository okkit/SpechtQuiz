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
