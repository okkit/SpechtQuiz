package de.example.quizdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Die Klasse zum erzeugen einiger Testdatensätze in der Datenbank
 */
public class DataBaseFiller {

	private static final String URL = System.getenv("DB_URL");
	private static final String USER = System.getenv("DB_USER");
	private static final String PASSWORD = System.getenv("DB_PASSWORD");

	public static void main(String[] args) {

		if (URL == null || USER == null || PASSWORD == null) {
			System.out.println("Fehler: DB_URL, DB_USER oder DB_PASSWORD ist nicht gesetzt.");
			return;
		}
		fillQuizTable();

	}

	private static void fillQuizTable() {

		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {

//			 ein Quiz in die DB speichern
// AUs der Work bench: INSERT INTO `spechtquiz`.`quiz` (`title`) VALUES ('test');
			String SQL_QUIZ = "insert into spechtquiz.quiz (title) values('OOP');";
//-------------------------------------------------------------------------------------------------------------
// Das Parameter Statement.RETURN_GENERATED_KEYS) verannslast das Statement
// den autogenerierten PK zurückzuliefern.
			PreparedStatement statement = connection.prepareStatement(SQL_QUIZ,
					Statement.RETURN_GENERATED_KEYS);
			statement.execute();

// Nach dem der SQL-Befehl auf die DB abgesetzt wurde, kann das generierte PK abgefragt werden.
// das PK brauchen wir für das Question, das wir an das Quiz anhängen
			ResultSet primaryKeys = statement.getGeneratedKeys();
			int pk_quiz = -1;
			if (primaryKeys.next())
				pk_quiz = primaryKeys.getInt(1); // 1 ist die Nummer der Spalte in der Tabelle
			
			System.out.println("Quiz wurde gespeichert. PK " + pk_quiz);

// 			zum Quiz eine Question in die DB speichern.		
//-------------------------------------------------------------------------------------------------------------
			String SQL_QUESTION = "INSERT INTO spechtquiz.question (text, Quiz_id) VALUES (?, ?);";
// Eine neue Instanz der Klasse PreparedStatement
			statement = connection.prepareStatement(SQL_QUESTION, Statement.RETURN_GENERATED_KEYS);

			String fragentext = "Wenn eine Klasse beinhaltet extends und implements, dann handelt es sich um...";

			statement.setString(1, fragentext); // 1 bedeutet das erste Fragezeichen ? im SQL_QUESTION
			statement.setInt(2, pk_quiz); // 2 bedeutet das zweite ? im SQL_QUESTION

			statement.execute();
			
//Primary key der Question erhalten. Das PK brauchen wir für die Answers
			primaryKeys = statement.getGeneratedKeys();
			int pk_quest = -1;
			if (primaryKeys.next())
				pk_quest = primaryKeys.getInt(1);
			
			System.out.println("Question wurde gespeichert. PK " + pk_quest);
			
			
// 			zur Question vier Answers in die DB speichern.		
//-------------------------------------------------------------------------------------------------------------
			String SQL_ANSWER = "INSERT INTO spechtquiz.answer (text, correct, question_id, Question_Quiz_id) VALUES (?, ?, ?, ?);";

			String[] answertexte = {"Aggregation", "Polymorphie", "Singleton", "Model-View-Pattern"};
			int[] correctness = {0, 1, 0, 0};
			
			for (int i = 0; i < answertexte.length; i++) {
				statement = connection.prepareStatement(SQL_ANSWER, Statement.RETURN_GENERATED_KEYS);
				statement.setString(1, answertexte[i]);
				statement.setInt(2,  correctness[i]);
				statement.setInt(3, pk_quest);
				statement.setInt(4, pk_quiz);
				statement.execute();
				primaryKeys = statement.getGeneratedKeys();
				if (primaryKeys.next())
					System.out.println("Answer wurde gespeichert pk:" + primaryKeys.getInt(1));
			}


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
