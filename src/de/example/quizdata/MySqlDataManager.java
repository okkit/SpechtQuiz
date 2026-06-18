package de.example.quizdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import de.example.quizdata.objects.Quiz;

public class MySqlDataManager implements QuizDataManager {

	@Override
	public Quiz getQuiz() {
		// TODO

// Zu der DB connecten - mit der Datenbank verbinden

		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/spechtquiz", "root", "")) {
			
// Eine SQL-Query = ein SQL-Statement definieren
			String sqlStmt = "SELECT * FROM spechtquiz.quiz;";
			
// Das SQL-Statement erzeugen			
			PreparedStatement stmt = connection.prepareStatement(sqlStmt);
			
// Das SQL-Statement absetzen und ein Result erhalten
			ResultSet result = stmt.executeQuery();

// Das erhaltene Result auf ein Java-Objekt mappen
			Quiz q ;
			while (result.next()) {
				String title = result.getString("title");
				q = new Quiz(title);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

}
